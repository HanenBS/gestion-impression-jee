package iit.jee.gestionimpressionjee.models;

public class Matiere {
    private int id;
    private String nom;

    // Constructeur
    public Matiere(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    // Getters et Setters
    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
