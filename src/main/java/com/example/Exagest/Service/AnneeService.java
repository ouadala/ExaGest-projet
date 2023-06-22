package com.example.Exagest.Service;

import com.example.Exagest.entities.Annee;

import java.util.List;

public interface AnneeService {
    Annee addAnnee(Annee annee);
    Annee editAnnee( Long id);
    String deleteAnnee(Long id);
    List<Annee> listAnnee();
}