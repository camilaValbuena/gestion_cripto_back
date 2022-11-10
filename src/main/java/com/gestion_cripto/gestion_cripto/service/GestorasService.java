package com.gestion_cripto.gestion_cripto.service;

import com.gestion_cripto.gestion_cripto.entity.Gestoras;
import com.gestion_cripto.gestion_cripto.repository.GestorasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GestorasService {

    @Autowired
    GestorasRepository gestorasRepository;

    public List<Gestoras> getGestoras(){
        List<Gestoras> gestoras = new ArrayList<Gestoras>();
        gestoras.addAll(gestorasRepository.findAll());
        return gestoras;
    }
}
