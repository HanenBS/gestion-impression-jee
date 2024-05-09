package iit.jee.gestionimpressionjee.models;

import java.util.Date;

public class DemandeImpression {
    private String enseignant;
    private String matiere;
    private int groupe;
    private Date dateImpression;
    private String etat;
    private int nombreDePages;

    public DemandeImpression(String enseignant, String matiere, int groupe, Date dateImpression, int nombreDePages, String etat) {
        this.enseignant = enseignant;
        this.matiere = matiere;
        this.groupe = groupe;
        this.dateImpression = dateImpression;
        this.etat = etat;
        this.nombreDePages = this.nombreDePages;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public String getMatiere() {
        return matiere;
    }

    public Date getDateImpression() {
        return dateImpression;
    }

    public String getEtat() {
        return etat;
    }

    public int getNombreDePages() {
        return nombreDePages;
    }

    public int getGroupe() {
        return groupe;
    }
}
