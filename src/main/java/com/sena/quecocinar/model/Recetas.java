package com.sena.quecocinar.model;

import com.sena.quecocinar.enums.Comida;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Recetas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    
    private String nombre;
    private String ingredientes;
    private String preparacion;
    private int tiempo;
    private String dificultad;

    @Enumerated(EnumType.STRING)
    @Column (name = "tipo")
    private Comida tipo;



}
