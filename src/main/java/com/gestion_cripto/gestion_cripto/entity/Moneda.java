package com.gestion_cripto.gestion_cripto.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Table(name = "moneda")
public class Moneda {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idmoneda", nullable = false, unique = true)
    private Long id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "simbolo")
    private String simbolo;

    @Column(name = "tasa_cambio")
    private Double tasa_cambio;
}


