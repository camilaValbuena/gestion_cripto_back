package com.gestion_cripto.gestion_cripto.service;

import com.gestion_cripto.gestion_cripto.entity.Moneda;
import com.gestion_cripto.gestion_cripto.repository.MonedaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonedaService {

    @Autowired
    MonedaRepository monedaRepository;

    public void createMoneda(Moneda moneda){
        System.out.println(moneda);
        monedaRepository.save(moneda);
    }

    public List<Moneda> getMonedas(){
        List<Moneda> monedas = new ArrayList<Moneda>();
        monedas.addAll(monedaRepository.findAll());
        return monedas;
    }
}
