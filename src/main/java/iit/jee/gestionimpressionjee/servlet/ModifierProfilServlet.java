package iit.jee.gestionimpressionjee.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ModifierProfilServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les paramètres du formulaire
        String nom = request.getParameter("nom");
        // Traiter les autres paramètres de modification du profil

        // Rediriger vers la page de confirmation
        response.sendRedirect("modifierProfile.jsp");
    }
}

