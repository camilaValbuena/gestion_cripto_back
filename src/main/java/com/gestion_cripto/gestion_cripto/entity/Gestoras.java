package com.gestion_cripto.gestion_cripto.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "gestoras")
public class Gestoras {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idgestoras", nullable = false, unique = true)
    private Long id;

    @Column(name = "nombre")
    private String nombre;
}