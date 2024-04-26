package iit.jee.gestionimpressionjee.utils;

import iit.jee.gestionimpressionjee.models.Enseignant;
import iit.jee.gestionimpressionjee.models.Etudiant;
import iit.jee.gestionimpressionjee.models.Matiere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatiereUtils {

    private static final Map<Long, Matiere> matieres = new HashMap<>();

    static {
        // Sample data (replace with actual data population mechanism)
        Matiere m1 = new Matiere(1L, "Mathématiques", new Enseignant(1L, "Prof. Dubois", null));
        Matiere m2 = new Matiere(2L, "Français", new Enseignant(2L, "Mme. Dupont", null));
        matieres.put(m1.getId(), m1);
        matieres.put(m2.getId(), m2);
    }

    public static List<Matiere> getAllMatieres() {
        return new ArrayList<>(matieres.values());
    }

    public static Matiere getMatiereById(Long id) {
        return matieres.get(id);
    }

    public static Matiere createMatiere(Matiere matiere) {
        matieres.put(matiere.getId(), matiere);
        return matiere;
    }

    public static Matiere updateMatiere(Matiere matiere) {
        matieres.put(matiere.getId(), matiere);
        return matiere;
    }

    public static void deleteMatiere(Long id) {
        matieres.remove(id);
    }

    public static List<Etudiant> getEtudiantsByMatiere(Matiere matiere) {
        // Implement logic to retrieve students based on Matiere (replace with actual implementation)
        return new ArrayList<>(); // Replace with actual implementation
    }

    public static void addEtudiantToMatiere(Matiere matiere, Etudiant etudiant) {
        // Implement logic to add student to Matiere (replace with actual implementation)
    }

    public static void removeEtudiantFromMatiere(Matiere matiere, Etudiant etudiant) {
        // Implement logic to remove student from Matiere (replace with actual implementation)
    }

  //  public static Enseignant getEnseignantByMatiere(Matiere matiere) {
  //      return matiere.getEnseignant();
  //  }

   // public static void setEnseignantForMatiere(Matiere matiere, Enseignant enseignant) {
   //     matiere.setEnseignant(enseignant);
//}
}