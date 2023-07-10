package com.example.Exagest.controller;

import com.example.Exagest.Service.AttributionMatiereService;
import com.example.Exagest.Service.InscriptionService;
import com.example.Exagest.entities.AttributionMatiere;
import com.example.Exagest.entities.Inscription;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/AttributionMat")
public class AttributionMatiereController {
    private final AttributionMatiereService attributionMatiereService;

    public AttributionMatiereController(AttributionMatiereService attributionMatiereService) {
        this.attributionMatiereService = attributionMatiereService;
    }

    @PostMapping("/creeAttribution")
    AttributionMatiere ajouterAttr(@RequestBody AttributionMatiere attributionMatiere){
        return attributionMatiereService.addattMat(attributionMatiere);
    }
    @PutMapping("/editAttribu/{id}")
    AttributionMatiere modifAttr(@PathVariable("id") Long id, @RequestBody AttributionMatiere attributionMatiere){
        return attributionMatiereService.editattMat(id,attributionMatiere);
    }

    @GetMapping("/getAllAttriMatAnn")
    List<AttributionMatiere> attrmat(){
        return attributionMatiereService.listattributionMatAnne();
    }

    @GetMapping("/getAllAttPerExam/{id}")
    List<AttributionMatiere> attrMatPerEx( @PathVariable("id") Long idEx){
        return attributionMatiereService.listattributionMatExam(idEx);
    }

//    @GetMapping("/getAllAttriMatExam")
//    List<AttributionMatiere> attriexam(){
//        return attributionMatiereService.listattributionMatExam();
//    }


    @GetMapping("/getAllAttriMatMatie")
    List<AttributionMatiere> attrimat(){
        return attributionMatiereService.listattributionMatMatiere();
    }





    @DeleteMapping("/suppAttri/{id}")
    String suppInsc(@PathVariable("id") Long id){
        attributionMatiereService.deletattMat(id);
        return "Attribution matiere supprimer avec succès";
    }
}
