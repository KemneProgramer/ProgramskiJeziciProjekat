package com.nemanjamarjanovic.ispitpj.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Entity(name = "tim")
    @NoArgsConstructor
    @Getter
    @Setter
    public class Tim {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "tim_id")
        private Integer tim_id;


        @Column(nullable = false, unique = true)
        private String imetima;

        @OneToMany(mappedBy = "tim")
        private Set<Igrac> igraci;
}
