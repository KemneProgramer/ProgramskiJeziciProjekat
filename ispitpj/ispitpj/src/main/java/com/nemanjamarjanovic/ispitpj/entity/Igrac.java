package com.nemanjamarjanovic.ispitpj.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "igrac")
@NoArgsConstructor
@Getter
@Setter
public class Igrac {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "igrac_id")
    private Integer id;


    @Column(nullable = false)
    private String ime;

    @Column(nullable = false)
    private String prezime;

    @Column(nullable = false, unique = true)
    private Integer brojdresa;

    @Column(nullable = false)
    private LocalDateTime created_at = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name="tim_id")
    private Tim tim;

}
