package com.Proyecto.Cursos.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cursos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idCursos;
    private String nombre;
    private String descripcion;
}
