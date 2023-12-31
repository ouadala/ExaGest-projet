package com.example.Exagest.Service;

import com.example.Exagest.entities.Moyenne;

import java.util.List;

public interface MoyenneService {
    Moyenne addmoyenne(Moyenne moyenne);

    Moyenne editmoyenne( Long id,Moyenne moyenne);

    String deletemoyenne(Long id);

    List<Moyenne> listIns();

    List<Moyenne> listExam();

    List<Moyenne> listSess();

    List<Moyenne> moyennePerExamLorsSessforAllEcol(Long idExamen,Long idSession);


    List<Moyenne> moyennePerExamLorsSessforUneEcol(Long idExamen,Long idSession,Long idEcole);

     void calculerMoyenne(Long idExamen, Long idInscription, Long idSession);


    void genererMoyenne(Long idExamen, Long idSession);

    Moyenne findByIdOfMoy(Long id);

    List<Moyenne>  listAll(Long id, Long id2);

    public String attrMention(Double moyenne);

    List<Moyenne>listMoyenneExamParEcole(Long idExamen, Long idSession,Long ecole);


}
