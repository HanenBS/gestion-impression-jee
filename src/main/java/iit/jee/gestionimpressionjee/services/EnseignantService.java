package iit.jee.gestionimpressionjee.services;

import iit.jee.gestionimpressionjee.models.Enseignant;

import java.util.List;

public interface EnseignantService {

    // Add methods for managing Enseignant entities here
    void ajouterEnseignant(Enseignant enseignant);
    void modifierEnseignant(Enseignant enseignant);
    void supprimerEnseignant(Long id);
    Enseignant getEnseignantById(Long id);
    List<Enseignant> getAllEnseignants();
}