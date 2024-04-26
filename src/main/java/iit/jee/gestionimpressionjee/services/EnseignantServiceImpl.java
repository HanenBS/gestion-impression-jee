package iit.jee.gestionimpressionjee.services;

import iit.jee.gestionimpressionjee.models.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EnseignantServiceImpl implements EnseignantService {

    @Autowired
    private EnseignantRepository enseignantRepository;

    @Override
    @Transactional
    public void ajouterEnseignant(Enseignant enseignant) {
        enseignantRepository.save(enseignant);
    }

    @Override
    @Transactional
    public void modifierEnseignant(Enseignant enseignant) {
        enseignantRepository.save(enseignant);
    }

    @Override
    @Transactional
    public void supprimerEnseignant(Long id) {
        enseignantRepository.deleteById(id);
    }

    @Override
    public Enseignant getEnseignantById(Long id) {
        return enseignantRepository.findById(id).orElse(null);
    }

    @Override
    public List<Enseignant> getAllEnseignants() {
        return enseignantRepository.findAll();
    }
}