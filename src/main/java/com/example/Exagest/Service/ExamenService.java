package com.example.Exagest.Service;

import com.example.Exagest.entities.Ecole;
import com.example.Exagest.entities.Examen;
import com.example.Exagest.models.TauxReussiteParEcole;
import com.example.Exagest.requests.EnrolementRequestModel;

import java.util.HashMap;
import java.util.List;

public interface ExamenService {
    Examen addexamen(EnrolementRequestModel enrolementRequestModel);
    Examen editexamen( Long id,Examen examen);
    String deleteexamen(Long id);
    List<Examen> listEcol();

    List<Examen> listAnnee();

    List<Examen> listExameLib();


    Examen findByIdOfExam(Long id);
    List<Examen> listExamPerEcol(Long id);

//    Examen setExamen(Long id);

    boolean setCurrentExamToActif(Long idExamen,Long idEcol);

    Examen setExamFalse(Long id);

    List<Examen> listExamAucoursDuneAnee(Long id);

    List<TauxReussiteParEcole> calculateTotalInscribedAndPassed(Long idsession, Long idexamen);

//    List<Object[]>  obtenirTauxReussiteParEcole();
}
