package iit.jee.gestionimpressionjee.services;

import iit.jee.gestionimpressionjee.models.Utilisateur;
import iit.jee.gestionimpressionjee.services.AdministrateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/*
@Service

 */
public class AdministrateurServiceImpl implements AdministrateurService {

    @Autowired
    private UtilisateurDAO utilisateurDAO;

    @Override
    public void creerUtilisateur(Utilisateur utilisateur) {
        utilisateurDAO.save(utilisateur);
    }

    @Override
    public void activerUtilisateur(int idUtilisateur) {
        utilisateurDAO.activerUtilisateur(idUtilisateur);
    }

    @Override
    public void desactiverUtilisateur(int idUtilisateur) {
        utilisateurDAO.desactiverUtilisateur(idUtilisateur);
    }

    @Override
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurDAO.findAll();
    }

    @Override
    public Utilisateur getUtilisateurById(int idUtilisateur) {
        return utilisateurDAO.findById(idUtilisateur);
    }


}