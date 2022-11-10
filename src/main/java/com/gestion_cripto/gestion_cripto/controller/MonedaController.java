package com.gestion_cripto.gestion_cripto.controller;

import com.gestion_cripto.gestion_cripto.entity.Moneda;
import com.gestion_cripto.gestion_cripto.entity.User;
import com.gestion_cripto.gestion_cripto.service.MonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MonedaController {

    @Autowired
    MonedaService monedaService;

    @PostMapping("/monedas")
    private void createMonedas(@RequestBody Moneda moneda){
        monedaService.createMoneda(moneda);
    }

    @GetMapping("/monedas")
    private List<Moneda> getMonedas(){
        return monedaService.getMonedas();
    }
}
