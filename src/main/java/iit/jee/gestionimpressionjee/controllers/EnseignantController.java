package iit.jee.gestionimpressionjee.controllers;


import iit.jee.gestionimpressionjee.models.DemandeImpression;
import iit.jee.gestionimpressionjee.models.Enseignant;
import iit.jee.gestionimpressionjee.models.Matiere;
import iit.jee.gestionimpressionjee.services.DemandeImpressionService;
import iit.jee.gestionimpressionjee.services.EnseignantService;
import iit.jee.gestionimpressionjee.services.MatiereService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EnseignantController", urlPatterns = {"/enseignant/*"})
public class EnseignantController extends HttpServlet {

    private EnseignantService enseignantService;
    private MatiereService matiereService;
    private DemandeImpressionService demandeImpressionService;

    @Override
    public void init() throws ServletException {
        super.init();
        enseignantService = new EnseignantService() {
            @Override
            public void ajouterEnseignant(Enseignant enseignant) {

            }

            @Override
            public void modifierEnseignant(Enseignant enseignant) {

            }

            @Override
            public void supprimerEnseignant(Long id) {

            }

            @Override
            public Enseignant getEnseignantById(Long id) {
                return null;
            }

            @Override
            public List<Enseignant> getAllEnseignants() {
                return null;
            }
        };
        matiereService = new MatiereService();
        demandeImpressionService = new DemandeImpressionService() {
            @Override
            public List<DemandeImpression> getAllDemandes() {
                return null;
            }

            @Override
            public List<DemandeImpression> getDemandesByEnseignant(String enseignantId) {
                return null;
            }

            @Override
            public DemandeImpression getDemandeById(String demandeId) {
                return null;
            }

            @Override
            public void createDemande(DemandeImpression demande) {

            }

            @Override
            public void updateDemande(DemandeImpression demande) {

            }

            @Override
            public void deleteDemande(String demandeId) {

            }
        };
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo();
        if (action.equals("/demande")) {
            int enseignantId = Integer.parseInt(request.getParameter("enseignantId"));
            int matiereId = Integer.parseInt(request.getParameter("matiereId"));
            int copies = Integer.parseInt(request.getParameter("copies"));
            String document = request.getParameter("document");
            String dateArrivee = request.getParameter("dateArrivee");

            DemandeImpression demande = new DemandeImpression();
          //  demande.setEnseignantId(enseignantId);
          //  demande.setMatiereId(matiereId);
          //  demande.setCopies(copies);
          //  demande.setDocument(document);
          //  demande.setDateArrivee(dateArrivee);

       //     demandeImpressionService.faireDemande(demande);
            response.sendRedirect(request.getContextPath() + "/enseignant/accueil");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo();
        if (action == null || action.equals("/accueil")) {
            List<Matiere> matieres = matiereService.getAllMatieres();
            request.setAttribute("matieres", matieres);
            request.getRequestDispatcher("/Pages/enseignant/accueilEnseignant.jsp").forward(request, response);
        } else if (action.equals("/demande")) {
            List<Matiere> matieres = matiereService.getAllMatieres();
            request.setAttribute("matieres", matieres);
            request.getRequestDispatcher("/Pages/enseignant/demandeImpression.jsp").forward(request, response);
        } else if (action.equals("/consultation")) {
            int enseignantId = Integer.parseInt(request.getParameter("enseignantId"));
    //        List<DemandeImpression> demandes = demandeImpressionService.getDemandesByEnseignantId(enseignantId);
    //        request.setAttribute("demandes", demandes);
         //   request.getRequestDispatcher("/Pages/enseignant/consultationDemandes.jsp").forward(request, response);
        }
    }
}
