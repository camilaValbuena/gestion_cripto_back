package com.gestion_cripto.gestion_cripto.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "pais")
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idpais", nullable = false, unique = true)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

}