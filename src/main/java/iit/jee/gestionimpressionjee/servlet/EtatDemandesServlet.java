package iit.jee.gestionimpressionjee.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class EtatDemandesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Ici vous pouvez récupérer les données nécessaires à afficher dans l'état des demandes depuis votre base de données ou d'autres sources
        // Supposons que vous avez déjà récupéré les données et les avez stockées dans une liste appelée "listeDemandes"

        // Mettre les données dans un attribut de la requête
        request.setAttribute("demandes", "");

        // Dispatcher vers la page d'état des demandes
        RequestDispatcher dispatcher = request.getRequestDispatcher("etatDemande.jsp");
        dispatcher.forward(request, response);
    }
}
