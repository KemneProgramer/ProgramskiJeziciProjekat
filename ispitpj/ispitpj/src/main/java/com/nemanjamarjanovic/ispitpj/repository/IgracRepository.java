package com.nemanjamarjanovic.ispitpj.repository;

import com.nemanjamarjanovic.ispitpj.entity.Igrac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IgracRepository extends JpaRepository<Igrac, Integer> {

Optional<Igrac> findBybrojdresa(Integer brojdresa);

}
