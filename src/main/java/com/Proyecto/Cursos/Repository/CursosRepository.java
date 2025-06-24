package com.Proyecto.Cursos.Repository;

import com.Proyecto.Cursos.Model.Cursos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursosRepository extends JpaRepository<Cursos,Integer> {
}
