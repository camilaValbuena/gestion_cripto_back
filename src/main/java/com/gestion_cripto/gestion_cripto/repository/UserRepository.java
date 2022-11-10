package com.gestion_cripto.gestion_cripto.repository;

import com.gestion_cripto.gestion_cripto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {//Se indica a que clase va a pertenecer y el tipo id que tiene la clase

}
