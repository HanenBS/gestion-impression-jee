package iit.jee.gestionimpressionjee.servlet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Récupérer les paramètres du formulaire de connexion
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Vérifier les identifiants de l'utilisateur (vous pouvez remplacer ceci par votre logique de vérification)
        boolean credentialsValid = validateCredentials(username, password);

        if (credentialsValid) {
            // Déterminer le rôle de l'utilisateur (vous pouvez remplacer ceci par votre logique de détermination de rôle)
            String role = determineUserRole(username);

            // Stocker le rôle de l'utilisateur dans la session
            request.getSession().setAttribute("role", role);

            // Rediriger l'utilisateur vers la page d'accueil appropriée en fonction du rôle
            if (role.equals("enseignant")) {
                response.sendRedirect("accueilEnseignant.jsp");
            } else if (role.equals("administrateur")) {
                response.sendRedirect("accueilAdministrateur.jsp");
            } else if (role.equals("agenttirage")) {
                response.sendRedirect("accueilAgentTirage.jsp");
            }
        } else {
            // Identifiants incorrects, rediriger vers la page de connexion avec un message d'erreur
            response.sendRedirect("login.jsp?error=1");
        }
    }

    private boolean validateCredentials(String username, String password) {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, username);
                statement.setString(2, password);
                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next(); // Retourne true si les identifiants sont valides, sinon false
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // En cas d'erreur de base de données, considérer les identifiants comme invalides
        }
    }

    private String determineUserRole(String username) {
        try (Connection connection = DatabaseConnector.getConnection()) {
            String query = "SELECT role FROM users WHERE username = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, username);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        return resultSet.getString("role"); // Retourne le rôle de l'utilisateur
                    } else {
                        return "unknown"; // Si l'utilisateur n'existe pas, retourne un rôle inconnu
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return "unknown"; // En cas d'erreur de base de données, retourne un rôle inconnu
        }
    }

}
