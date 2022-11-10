package com.gestion_cripto.gestion_cripto.service;

import com.gestion_cripto.gestion_cripto.entity.Pais;
import com.gestion_cripto.gestion_cripto.repository.PaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaisService {

    @Autowired
    PaisRepository paisRepository;

    public List<Pais> getPaises(){
        List<Pais> pais1 = new ArrayList<Pais>();
        pais1.addAll(paisRepository.findAll());
        return pais1;
    }
}
