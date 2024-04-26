package iit.jee.gestionimpressionjee.services;

import iit.jee.gestionimpressionjee.models.DemandeImpression;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DemandeImpressionService {
    public List<DemandeImpression> listerDemandes() {

        List<DemandeImpression> demandes = new ArrayList<>();
        demandes.add(new DemandeImpression("Professeur A", 50, new Date(), "document1.pdf"));
        demandes.add(new DemandeImpression("Professeur B", 30, new Date(), null));
        return demandes;
    }
}

