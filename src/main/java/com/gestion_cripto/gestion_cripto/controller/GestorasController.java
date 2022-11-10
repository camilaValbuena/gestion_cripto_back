package com.gestion_cripto.gestion_cripto.controller;

import com.gestion_cripto.gestion_cripto.entity.Gestoras;
import com.gestion_cripto.gestion_cripto.service.GestorasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GestorasController {

    @Autowired
    GestorasService gestorasService;

    @GetMapping("/gestoras")
    private List<Gestoras> getGestoras(){
        return gestorasService.getGestoras();
    }
}
