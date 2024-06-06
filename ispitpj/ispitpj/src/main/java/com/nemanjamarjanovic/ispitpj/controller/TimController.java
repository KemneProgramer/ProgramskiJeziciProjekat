package com.nemanjamarjanovic.ispitpj.controller;


import com.nemanjamarjanovic.ispitpj.entity.Tim;
import com.nemanjamarjanovic.ispitpj.service.TimService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tim")
@RequiredArgsConstructor
@CrossOrigin
public class TimController {

    private final TimService service;

    @GetMapping
    public List<Tim> getAllTimovi() {
        return service.getAllTimovi();

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Tim> getTimById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getTimById(id));
    }


    }
