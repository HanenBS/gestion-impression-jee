package iit.jee.gestionimpressionjee.servlet;


import iit.jee.gestionimpressionjee.models.Enseignant;
import iit.jee.gestionimpressionjee.services.EnseignantService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EnseignantServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String matiere = request.getParameter("matiere");
        String documentPDF = request.getParameter("documentPDF");
        String dateHeureRetrait = request.getParameter("dateHeureRetrait");
        int nombreCopies = Integer.parseInt(request.getParameter("nombreCopies"));

        Enseignant enseignant = new Enseignant("Nom de l'enseignant", "Matière enseignée", 30); // Supposons que le groupe contient 30 étudiants

        EnseignantService enseignantService = new EnseignantService();
        boolean demandeValide = enseignantService.validerDemandeTirage(enseignant, matiere, documentPDF, dateHeureRetrait, nombreCopies);

        if (demandeValide) {
            response.getWriter().println("Demande de tirage validée avec succès !");
        } else {
            response.getWriter().println("Erreur lors de la validation de la demande de tirage.");
        }
    }

}
