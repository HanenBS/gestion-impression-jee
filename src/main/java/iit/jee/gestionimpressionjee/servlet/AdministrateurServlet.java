package iit.jee.gestionimpressionjee.servlet;

import iit.jee.gestionimpressionjee.models.Administrateur;
import iit.jee.gestionimpressionjee.services.AdministrateurService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/administrateur/*")
public class AdministrateurServlet extends HttpServlet {
    private AdministrateurService adminService;

    @Override
    public void init() throws ServletException {
        super.init();
        // Initialisation du service administrateur
        adminService = new AdministrateurService();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo();
        if (action == null) {
            action = "/";
        }
        switch (action) {
            case "/":
                afficherListeAdministrateurs(request, response);
                break;
            case "/activer":
                activerAdministrateur(request, response);
                break;
            case "/desactiver":
                desactiverAdministrateur(request, response);
                break;
            // Autres cas à ajouter selon les besoins
            default:
                response.sendError(HttpServletResponse.SC_NOT_FOUND);
                break;
        }
    }

    private void afficherListeAdministrateurs(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Administrateur> administrateurs = adminService.getAllAdministrateurs();
        request.setAttribute("administrateurs", administrateurs);
        request.getRequestDispatcher("/listeAdministrateurs.jsp").forward(request, response);
    }

    private void activerAdministrateur(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idAdmin = Integer.parseInt(request.getParameter("id"));
        adminService.activerAdministrateur(idAdmin);
        response.sendRedirect(request.getContextPath() + "/administrateur/");
    }

    private void desactiverAdministrateur(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idAdmin = Integer.parseInt(request.getParameter("id"));
        adminService.desactiverAdministrateur(idAdmin);
        response.sendRedirect(request.getContextPath() + "/administrateur/");
    }

    // Autres méthodes de contrôleur pour la gestion des administrateurs
}
