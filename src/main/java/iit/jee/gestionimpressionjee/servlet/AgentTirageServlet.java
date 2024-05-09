package iit.jee.gestionimpressionjee.servlet;

import iit.jee.gestionimpressionjee.models.DemandeImpression;
import iit.jee.gestionimpressionjee.services.DemandeImpressionService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet("/AgentTirageController")
public class AgentTirageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private final DemandeImpressionService demandeImpressionService = new DemandeImpressionService();

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<DemandeImpression> demandes = demandeImpressionService.listerDemandes();
        request.setAttribute("demandes", demandes);
        request.getRequestDispatcher("accueilAgentTirage.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String enseignant = request.getParameter("enseignant");
        Part filePart = request.getPart("document");
        String matiere = getSubmittedFileName(filePart);
        Date dateImpression = new Date(); // Obtenir la date actuelle
        int groupe = Integer.parseInt(request.getParameter("groupe"));
        int nombreDePages = Integer.parseInt(request.getParameter("nombreDePages"));

        // Utiliser le constructeur approprié avec les paramètres corrects
        DemandeImpression demandeTirage = new DemandeImpression(enseignant, matiere,groupe, dateImpression, nombreDePages, "En attente");

        demandeImpressionService.traiterDemande(demandeTirage);
        response.sendRedirect("confirmationDemande.jsp");
    }


    private String getSubmittedFileName(Part filePart) {
        String fileName = null;
        String header = filePart.getHeader("content-disposition");
        for (String headerPart : header.split(";")) {
            if (headerPart.trim().startsWith("filename")) {
                fileName = headerPart.substring(headerPart.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return fileName;
    }
}
