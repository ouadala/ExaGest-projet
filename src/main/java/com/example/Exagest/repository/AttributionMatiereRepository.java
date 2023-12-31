package com.example.Exagest.repository;

import com.example.Exagest.entities.AttributionMatiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AttributionMatiereRepository extends JpaRepository<AttributionMatiere,Long > {
    @Query("SELECT a FROM AttributionMatiere a ORDER BY a.annee.id ASC ")
    List<AttributionMatiere> listattributionMatAnne();

    @Query("SELECT a FROM AttributionMatiere a ORDER BY a.examen.libele ")
    List<AttributionMatiere> listattributionMatExam();

    @Query("SELECT a FROM AttributionMatiere a ORDER BY a.matiere.libele ")
    List<AttributionMatiere> listattributionMatMatiere();

    @Query("SELECT  a FROM AttributionMatiere a WHERE a.examen.id =:idEx")
    List<AttributionMatiere> listAttMAtPereExam(@Param("idEx") Long id);

    @Query("SELECT  a FROM AttributionMatiere a WHERE a.examen.ecole.id = ?1 and a.examen.id = ?2")
    List<AttributionMatiere> getAttMatByEcolConnAndExamen(Long idEcole,Long idExamen);
    @Query("SELECT  a FROM AttributionMatiere a WHERE a.examen.ecole.id = ?1")
    List<AttributionMatiere> getAttMatByEcolConn(Long idEcole);


}
