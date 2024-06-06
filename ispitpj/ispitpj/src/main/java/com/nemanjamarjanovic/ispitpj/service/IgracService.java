package com.nemanjamarjanovic.ispitpj.service;

import com.nemanjamarjanovic.ispitpj.entity.Igrac;
import com.nemanjamarjanovic.ispitpj.repository.IgracRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class IgracService {

    private final IgracRepository repository;

    public List<Igrac> getAllIgraci(){
        return repository.findAll();
    }


    public Optional<Igrac> getIgracById(Integer id){
        return repository.findById(id);


    }

    public Optional<Igrac> getIgracByBrojDresa (Integer brojdresa) {
        return repository.findBybrojdresa(brojdresa);
    }

}
