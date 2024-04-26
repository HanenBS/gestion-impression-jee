package iit.jee.gestionimpressionjee.models;

import java.util.Date;

public class DemandeImpression {
    private int id;
    private Enseignant enseignant;
    private Matiere matiere;
    private int nombreCopies;
    private Date dateArrivee;

    // Constructeur
    public DemandeImpression(int id, Enseignant enseignant, Matiere matiere, int nombreCopies, Date dateArrivee) {
        this.id = id;
        this.enseignant = enseignant;
        this.matiere = matiere;
        this.nombreCopies = nombreCopies;
        this.dateArrivee = dateArrivee;
    }

    public DemandeImpression() {

    }

    // Getters et Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(Enseignant enseignant) {
        this.enseignant = enseignant;
    }

    public Matiere getMatiere() {
        return matiere;
    }

    public void setMatiere(Matiere matiere) {
        this.matiere = matiere;
    }

    public int getNombreCopies() {
        return nombreCopies;
    }

    public void setNombreCopies(int nombreCopies) {
        this.nombreCopies = nombreCopies;
    }

    public Date getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(Date dateArrivee) {
        this.dateArrivee = dateArrivee;
    }
}