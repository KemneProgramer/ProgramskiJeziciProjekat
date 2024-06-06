package com.nemanjamarjanovic.ispitpj.service;


import com.nemanjamarjanovic.ispitpj.entity.Tim;
import com.nemanjamarjanovic.ispitpj.repository.TimRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TimService {

    @Autowired
    private TimRepository timRepository;

    private final TimRepository repository;

    public List<Tim> getAllTimovi(){
        return repository.findAll();
    }


    public Optional<Tim> getTimById(Integer id){
        return repository.findById(id);


    }


    }

