package com.example.Exagest.Service;

import com.example.Exagest.entities.TypeExamen;

import java.util.List;

public interface TypeExamenService {
    TypeExamen addtypeExamen(TypeExamen typeExamen);
    TypeExamen edittypeExamen( Long id);
    String deletetypeExamen(Long id);
    List<TypeExamen> listtypeExamen();
}