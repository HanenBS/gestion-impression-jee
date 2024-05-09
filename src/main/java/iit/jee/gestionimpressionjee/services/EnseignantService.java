package iit.jee.gestionimpressionjee.services;
import iit.jee.gestionimpressionjee.models.Enseignant;

public class EnseignantService {

    public boolean validerDemandeTirage(Enseignant enseignant, String matiere, String documentPDF, String dateHeureRetrait, int nombreCopies) {
        if (nombreCopies <= 0 || nombreCopies > enseignant.getNombreEtudiantsGroupe()) {
            return false;
        }
        return true;
    }

    public boolean envoyerDocumentPDF(String documentPDF) {
        return true;
    }

}
