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
import java.util.List;

@WebServlet("/AgentTirageController")
public class AgentTirageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DemandeImpressionService service = new DemandeImpressionService();
        List<DemandeImpression> demandes = service.listerDemandes();

        request.setAttribute("demandes", demandes);
        request.getRequestDispatcher("tableauBord.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String matiere = request.getParameter("matiere");
        Part filePart = request.getPart("document");
        String fileName = getSubmittedFileName(filePart);
        String dateHeure = request.getParameter("dateHeure");
        String dateRetrait = request.getParameter("dateRetrait");
        int nbCopies = Integer.parseInt(request.getParameter("nbCopies"));

        //  DemandeImpression demandeTirage = new DemandeImpression(matiere, fileName, dateRetrait, nbCopies);
        //demandeImpressionService.traiterDemande(demandeTirage);
        response.sendRedirect("confirmationDemande.jsp");

    }


    private String getSubmittedFileName(Part filePart) {
        return null;
    }
}

