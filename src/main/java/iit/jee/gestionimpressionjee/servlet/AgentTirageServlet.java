package iit.jee.gestionimpressionjee.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AgentTirageServlet")
public class AgentTirageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();

        // Connexion à la base de données MySQL
        String jdbcUrl = "jdbc:mysql://localhost:3306/my_gestion_data";
        String username = "";
        String password = "";

        try {
            Connection conn = DriverManager.getConnection(jdbcUrl, username, password);

            // Requête SQL pour récupérer les données de la table demandes
            String sql = "SELECT enseignant, matiere, groupe, dateImpression, nombrePages, document FROM demandes";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            // Construction de la réponse JSON
            StringBuilder jsonResponse = new StringBuilder("[");
            while (resultSet.next()) {
                jsonResponse.append("{");
                jsonResponse.append("\"enseignant\": \"" + resultSet.getString("enseignant") + "\",");
                jsonResponse.append("\"matiere\": \"" + resultSet.getString("matiere") + "\",");
                jsonResponse.append("\"groupe\": \"" + resultSet.getString("groupe") + "\",");
                jsonResponse.append("\"dateImpression\": \"" + resultSet.getString("dateImpression") + "\",");
                jsonResponse.append("\"nombrePages\": \"" + resultSet.getInt("nombrePages") + "\",");
                jsonResponse.append("\"document\": \"" + resultSet.getString("document") + "\"");
                jsonResponse.append("},");
            }
            jsonResponse.deleteCharAt(jsonResponse.length() - 1); // Supprimer la virgule en trop à la fin
            jsonResponse.append("]");

            // Envoi de la réponse JSON
            out.print(jsonResponse.toString());

            // Fermeture des ressources
            resultSet.close();
            statement.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
