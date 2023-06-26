package com.example.Exagest.entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Setter
@Getter
@ToString
@Table(name = "section")
@NoArgsConstructor
@AllArgsConstructor

public class Session implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_section")
    private Long id;

    @Column(nullable = false,length = 100)
    private String libele;

    @Column(nullable = false)
    private LocalDate addDate;

    @Column(nullable = false)
    private LocalDate updateDdate;
}
