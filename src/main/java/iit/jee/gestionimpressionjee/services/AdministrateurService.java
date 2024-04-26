package iit.jee.gestionimpressionjee.services;

import iit.jee.gestionimpressionjee.models.Administrateur;

import java.util.ArrayList;
import java.util.List;

public class AdministrateurService {
    private List<Administrateur> administrateurs;

    public AdministrateurService() {
        this.administrateurs = new ArrayList<>();
    }

    public void creerAdministrateur(Administrateur admin) {
        administrateurs.add(admin);
    }

    public void activerAdministrateur(int idAdmin) {
        for (Administrateur admin : administrateurs) {
            if (admin.getId() == idAdmin) {
                break;
            }
        }
    }

    public void desactiverAdministrateur(int idAdmin) {
        for (Administrateur admin : administrateurs) {
            if (admin.getId() == idAdmin) {
                break;
            }
        }
    }

    public List<Administrateur> getAllAdministrateurs() {
        return administrateurs;
    }
}
