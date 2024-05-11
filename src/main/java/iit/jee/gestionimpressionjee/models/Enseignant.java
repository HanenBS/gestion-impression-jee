package iit.jee.gestionimpressionjee.models;

public class Enseignant {

    private String nom;
    private String matiereEnseignee;
    private int nombreEtudiantsGroupe;

    public Enseignant(String nom, String matiereEnseignee, int nombreEtudiantsGroupe) {
        this.nom = nom;
        this.matiereEnseignee = matiereEnseignee;
        this.nombreEtudiantsGroupe = nombreEtudiantsGroupe;
    }

    // Getters et Setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatiereEnseignee() {
        return matiereEnseignee;
    }

    public void setMatiereEnseignee(String matiereEnseignee) {
        this.matiereEnseignee = matiereEnseignee;
    }

    public int getNombreEtudiantsGroupe() {
        return nombreEtudiantsGroupe;
    }

    public void setNombreEtudiantsGroupe(int nombreEtudiantsGroupe) {
        this.nombreEtudiantsGroupe = nombreEtudiantsGroupe;
    }

    // Méthode toString()

    @Override
    public String toString() {
        return "Enseignant{" +
                "nom='" + nom + '\'' +
                ", matiereEnseignee='" + matiereEnseignee + '\'' +
                ", nombreEtudiantsGroupe=" + nombreEtudiantsGroupe +
                '}';
    }
}
