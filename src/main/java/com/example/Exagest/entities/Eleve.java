package com.example.Exagest.entities;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Setter @Getter @ToString @Table(name = "eleve")
@NoArgsConstructor @AllArgsConstructor
public class Eleve implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Eleve")
    private Long id;

    @Column(nullable = false,length = 100)
    private String Nom;

    @Column(nullable = false,length = 100)
    private String Prenom;
    @Column(nullable = false)
    private Date date_naissance;

    @Column(nullable = false,length = 50,unique = true)
    private int contactParent;

    @Column(nullable = false)
    private LocalDate addDate;

    @Column(nullable = false)
    private LocalDate updateDate;


}
