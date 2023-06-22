package com.example.Exagest.Service.Implementation;

import com.example.Exagest.Service.AnneeService;
import com.example.Exagest.entities.Annee;
import com.example.Exagest.entities.Eleve;
import com.example.Exagest.repository.AnneeRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class AnneeServiceImpl implements AnneeService {
private final AnneeRepository anneeRepository;

    public AnneeServiceImpl(AnneeRepository anneeRepository) {
        this.anneeRepository = anneeRepository;
    }

    @Override
    public Annee addAnnee(Annee annee) {
        return anneeRepository.save(annee);
    }

    @Override
    public Annee editAnnee(Long id,Annee annee) {
        Optional<Annee> optionalAnnee = anneeRepository.findById(id);
        if(optionalAnnee.isEmpty()){
            System.out.println("Annee modifié avec succès");
        }
        Annee dbAnnee = optionalAnnee.get();
        dbAnnee.setDateAjout(annee.getDateAjout());
       dbAnnee.setAnneeScolaire(annee.getAnneeScolaire());
       dbAnnee.setLibelleAnnee(annee.getLibelleAnnee());
       dbAnnee.setEleve(annee.getEleve());
       dbAnnee.setExamen(annee.getExamen());
       dbAnnee.setDateModife(annee.getDateModife());
        return anneeRepository.save(dbAnnee);
    }

    @Override
    public String deleteAnnee(Long id) {
        anneeRepository.deleteById(id);
        return "Annee supprimé avec succès";
    }

    @Override
    public List<Annee> listAnnee() {
        return anneeRepository.findAll();
    }
}