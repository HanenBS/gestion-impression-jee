package iit.jee.gestionimpressionjee.services;

import iit.jee.gestionimpressionjee.models.DemandeImpression;

import java.util.List;

public interface DemandeImpressionService {
    List<DemandeImpression> getAllDemandes();
    List<DemandeImpression> getDemandesByEnseignant(String enseignantId);
    DemandeImpression getDemandeById(String demandeId);
    void createDemande(DemandeImpression demande);
    void updateDemande(DemandeImpression demande);
    void deleteDemande(String demandeId);
}
