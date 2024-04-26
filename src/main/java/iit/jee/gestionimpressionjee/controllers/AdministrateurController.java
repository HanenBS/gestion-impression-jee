package iit.jee.gestionimpressionjee.controllers;

import iit.jee.gestionimpressionjee.models.Utilisateur;
import iit.jee.gestionimpressionjee.services.AdministrateurService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdministrateurController", urlPatterns = {"/administrateur/*"})
public class AdministrateurController extends HttpServlet {

    private AdministrateurService administrateurService;

    @Override
    public void init() throws ServletException {
        super.init();
        administrateurService = new AdministrateurService() {
            @Override
            public void creerUtilisateur(Utilisateur utilisateur) {

            }

            @Override
            public void activerUtilisateur(int idUtilisateur) {

            }

            @Override
            public void desactiverUtilisateur(int idUtilisateur) {

            }

            @Override
            public List<Utilisateur> getAllUtilisateurs() {
                return null;
            }

            @Override
            public Utilisateur getUtilisateurById(int idUtilisateur) {
                return null;
            }
        };
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo();
        if (action.equals("/creer-utilisateur")) {
            // Logique de création d'un utilisateur par l'administrateur
        } else if (action.equals("/activer-utilisateur")) {
            // Logique d'activation d'un utilisateur par l'administrateur
        } else if (action.equals("/desactiver-utilisateur")) {
            // Logique de désactivation d'un utilisateur par l'administrateur
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getPathInfo();
        if (action == null || action.equals("/accueil")) {
            // Affichage de la page d'accueil de l'administrateur
        } else if (action.equals("/gestion-utilisateurs")) {
            // Affichage de la page de gestion des utilisateurs
        }
    }
}
