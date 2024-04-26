package iit.jee.gestionimpressionjee.services;

import iit.jee.gestionimpressionjee.models.DemandeImpression;

import java.util.ArrayList;
import java.util.List;

public class DemandeImpressionServiceImpl implements DemandeImpressionService {

    private List<DemandeImpression> demandes;

    public DemandeImpressionServiceImpl() {
        this.demandes = new ArrayList<>();
    }

    @Override
    public List<DemandeImpression> getAllDemandes() {
        return demandes;
    }

    @Override
    public List<DemandeImpression> getDemandesByEnseignant(String enseignantId) {
        List<DemandeImpression> enseignantDemandes = new ArrayList<>();
        for (DemandeImpression demande : demandes) {
         //   if (demande.getEnseignantId().equals(enseignantId)) {
         //       enseignantDemandes.add(demande);
         //   }
        }
        return enseignantDemandes;
    }

    @Override
    public DemandeImpression getDemandeById(String demandeId) {
        for (DemandeImpression demande : demandes) {
         //   if (demande.getId().equals(demandeId)) {
             return demande;
          //  }
        }
        return null;
    }

    @Override
    public void createDemande(DemandeImpression demande) {
        demandes.add(demande);
    }

    @Override
    public void updateDemande(DemandeImpression demande) {
        // Implémentation de la mise à jour de la demande
    }

    @Override
    public void deleteDemande(String demandeId) {
        // Implémentation de la suppression de la demande
    }
}
