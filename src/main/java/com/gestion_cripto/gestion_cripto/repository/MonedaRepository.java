package com.gestion_cripto.gestion_cripto.repository;

import com.gestion_cripto.gestion_cripto.entity.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonedaRepository extends JpaRepository<Moneda, Long> {
}
