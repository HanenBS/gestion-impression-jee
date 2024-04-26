package iit.jee.gestionimpressionjee.models;

import java.util.Date;

public class DemandeImpression {
    private String enseignant;
    private int nombreCopies;
    private Date dateReception;
    private String document;

    public DemandeImpression(String enseignant, int nombreCopies, Date dateReception, String document) {
        this.enseignant = enseignant;
        this.nombreCopies = nombreCopies;
        this.dateReception = dateReception;
        this.document = document;
    }

    public String getEnseignant() {
        return enseignant;
    }

    public void setEnseignant(String enseignant) {
        this.enseignant = enseignant;
    }

    public int getNombreCopies() {
        return nombreCopies;
    }

    public void setNombreCopies(int nombreCopies) {
        this.nombreCopies = nombreCopies;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
