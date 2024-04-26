package iit.jee.gestionimpressionjee.controllers;

import iit.jee.gestionimpressionjee.services.DemandeImpressionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AgentTirageController", urlPatterns = {"/agent-tirage/*"})
public class AgentTirageController extends HttpServlet {

    private DemandeImpressionService demandeImpressionService;

    @Override
    public void init() throws ServletException {
        super.init();
      //  demandeImpressionService = new DemandeImpressionService();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Traitement des tâches de l'agent de tirage
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       // List<DemandeImpression> taches = demandeImpressionService.getTaches();
       // request.setAttribute("taches", taches);
        request.getRequestDispatcher("/Pages/agentTirage/listeTaches.jsp").forward(request, response);
    }
}
