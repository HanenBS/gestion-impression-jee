package iit.jee.gestionimpressionjee.servlet;


import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class DemandeTirageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Récupérer les paramètres du formulaire
        String matiere = request.getParameter("matiere");
        // Traiter les autres paramètres de la demande de tirage

        // Rediriger vers la page de confirmation
        response.sendRedirect("confirmationDemande.jsp");
    }
}


