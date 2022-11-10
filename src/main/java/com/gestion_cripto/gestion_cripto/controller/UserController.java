package com.gestion_cripto.gestion_cripto.controller;

import com.gestion_cripto.gestion_cripto.entity.Pais;
import com.gestion_cripto.gestion_cripto.entity.User;
import com.gestion_cripto.gestion_cripto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user")
    private void createUser(@RequestBody User user){//Cuando el usuario realice una petición post a la url en el cuerpo de la petición, se va a envia run usuario que se
        //enviara com opargumento al metodo crear usuario del servicio
        userService.createUser(user);
    }

    @GetMapping("/user")
    private List<User> getUser(){
        return userService.getUser();
    }

    @GetMapping("/userid")
    private Optional<User> getUserId(@RequestBody User user){
        return userService.getUserid(user);
    }



}
