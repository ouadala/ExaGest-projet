package com.example.Exagest.entities;
import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@ToString
@Table(name = "examen")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Examen implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_Examen")
    private Long id;
    @Column(nullable = false,length = 50)
    private LocalDate dateAjout;
    @Column(nullable = false,length = 50)
    private LocalDate dateModife;
    @Column(nullable = false,length = 50)
    private boolean Statut;
    @ManyToOne
    @JoinColumn(name = "idCycleTypeExam")
    private CycleTypeExamen cycleTypeExamen;
    @ManyToOne
    @JoinColumn(name = "ideleve")
    private Eleve eleve;
    @ManyToOne
    @JoinColumn(name = "idparamMat")
    private ParametrageExam parametrageExam;
    @ManyToOne
    @JoinColumn(name = "idenrollement")
    private Enrolement enrolement;

}