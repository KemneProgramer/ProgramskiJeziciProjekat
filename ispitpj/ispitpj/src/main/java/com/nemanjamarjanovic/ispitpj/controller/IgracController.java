package com.nemanjamarjanovic.ispitpj.controller;


import com.nemanjamarjanovic.ispitpj.entity.Igrac;
import com.nemanjamarjanovic.ispitpj.service.IgracService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/igrac")
@RequiredArgsConstructor
@CrossOrigin
public class IgracController {

    private final IgracService service;

    @GetMapping
    public List<Igrac> getAllIgraci() {
        return service.getAllIgraci();

    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Igrac> getIgracById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getIgracById(id));
    }

    @GetMapping(path = "/brojdresa/{brojdresa}")
    public ResponseEntity<Igrac> getIgracBybrojdresa(@PathVariable Integer brojdresa) {
        return ResponseEntity.of(service.getIgracByBrojDresa(brojdresa));
    }
}
