package com.gestion_cripto.gestion_cripto.controller;

import com.gestion_cripto.gestion_cripto.entity.Pais;
import com.gestion_cripto.gestion_cripto.service.PaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PaisController {

    @Autowired
    PaisService paisService;

    @GetMapping("/paises")
    private List<Pais> getPaises(){
        return paisService.getPaises();
    }
}
