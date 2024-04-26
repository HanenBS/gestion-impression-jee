package iit.jee.gestionimpressionjee.services;

import iit.jee.gestionimpressionjee.models.Utilisateur;

import java.util.List;

public interface AdministrateurService {

    void creerUtilisateur(Utilisateur utilisateur);

    void activerUtilisateur(int idUtilisateur);

    void desactiverUtilisateur(int idUtilisateur);

    // Liste des utilisateurs
    List<Utilisateur> getAllUtilisateurs();

    // Détails d'un utilisateur
    Utilisateur getUtilisateurById(int idUtilisateur);
}
