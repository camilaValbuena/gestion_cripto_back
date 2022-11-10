package com.gestion_cripto.gestion_cripto.service;

import com.gestion_cripto.gestion_cripto.entity.User;
import com.gestion_cripto.gestion_cripto.entity.UsuarioPais;
import com.gestion_cripto.gestion_cripto.repository.UsuarioPaisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioPaisService {

    @Autowired
    UsuarioPaisRepository usuarioPaisRepository;

    public List<UsuarioPais> getUsuarioPais() {
        List<UsuarioPais> usuarioPais = new ArrayList<UsuarioPais>();
        usuarioPais.addAll(usuarioPaisRepository.findAll());
        return usuarioPais;
    }

    public Optional<UsuarioPais> getUserid(UsuarioPais usuarioPais){
        return usuarioPaisRepository.findById(usuarioPais.getIdpais());
    }
}
