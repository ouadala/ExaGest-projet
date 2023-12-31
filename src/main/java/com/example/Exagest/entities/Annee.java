package com.example.Exagest.entities;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Setter
@Getter
@ToString
@Table(name = "Annee")
@NoArgsConstructor
@AllArgsConstructor
public class Annee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_annee")
    private Long id;

    @Column(nullable = false)
    private boolean etat;


    @Column(nullable = false)
    private LocalDate dateDebutAcademique;


    @Column(nullable = false)
    private LocalDate dateFinAcademique;


    @Column(nullable = false)
    private LocalDate addDate;

    @Column(nullable = true)
    private LocalDate updateDate;


}
