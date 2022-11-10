package com.gestion_cripto.gestion_cripto.service;

import com.gestion_cripto.gestion_cripto.entity.Gestoras;
import com.gestion_cripto.gestion_cripto.entity.User;
import com.gestion_cripto.gestion_cripto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void createUser(User user){
        userRepository.save(user);//El servicio recibe el usuario y llama al repotirotio y giarda el usuario
    }

    public List<User> getUser(){
        List<User> users = new ArrayList<User>();
        users.addAll(userRepository.findAll());
        return users;
    }

    public Optional<User> getUserid(User user){
        return userRepository.findById(user.getId());
    }


}
