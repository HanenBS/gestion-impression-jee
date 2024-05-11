package iit.jee.gestionimpressionjee.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Enseignant")
public class EnseignantServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            // Si aucune action spécifiée, rediriger vers la page d'accueil
            response.sendRedirect("accueilEnseignant.jsp");
            return;
        }

        switch (action) {
            case "demandeTirage":
                // Redirection vers la page de demande de tirage
                response.sendRedirect("demandeTirage.jsp");
                break;
            case "etatDemandes":
                // Redirection vers la page de consultation de l'état des demandes
                response.sendRedirect("etatDemandes.jsp");
                break;
            case "modifierProfil":
                // Redirection vers la page de modification du profil
                response.sendRedirect("modifierProfile.jsp");
                break;
            case "deconnexion":
                // Redirection vers la page de déconnexion
                response.sendRedirect("deconnexion.jsp");
                break;
            default:
                // Si une action non reconnue est spécifiée, rediriger vers la page d'accueil
                response.sendRedirect("accueilEnseignant.jsp");
                break;
        }
    }
}
