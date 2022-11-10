package com.gestion_cripto.gestion_cripto.controller;

import com.gestion_cripto.gestion_cripto.entity.UsuarioPais;
import com.gestion_cripto.gestion_cripto.service.UsuarioPaisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsuarioPaisController {

    @Autowired
    UsuarioPaisService usuarioPaisService;

    @GetMapping("/usuarioPais")
    private List<UsuarioPais> getUsuario(){
        return usuarioPaisService.getUsuarioPais();
    }

    @GetMapping("/userpaisid")
    private Optional<UsuarioPais> getUserPaisId(@RequestBody UsuarioPais usuarioPais){
        return usuarioPaisService.getUserid(usuarioPais);
    }

}
