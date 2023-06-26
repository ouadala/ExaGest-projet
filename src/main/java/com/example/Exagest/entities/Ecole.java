package com.example.Exagest.entities;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@ToString
@Table(name = "ecole")
@NoArgsConstructor
@AllArgsConstructor
public class Ecole implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_ecole")
    private Long id;

    @Column(nullable = false)
    private String NomEcole;

    @Column(nullable = false ,length = 100)
    private String Adresse;

    @Column(nullable = false,length = 100)
    private int Telephone;

    @Column(nullable = false,length = 100,unique = true)
    private String Email;

    @Column(nullable = false)
    private String ficheStatut;

    @Column(nullable = false)
    private boolean Statut;

    @Column(nullable = false,length = 100)
    private String Matricule;

    @Column(nullable = false)
    private LocalDate addDate;

    @Column(nullable = false)
    private LocalDate updateDate;

    @ManyToOne
    @JoinColumn(name = "idcycle")
    private Cycle cycle;


}
