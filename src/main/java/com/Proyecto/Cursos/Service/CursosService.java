package com.Proyecto.Cursos.Service;

import com.Proyecto.Cursos.Model.Cursos;
import com.Proyecto.Cursos.Repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursosService {
    @Autowired
    CursosRepository cursosRepository;
    public String agregarCursos(Cursos cursos){
        cursosRepository.save(cursos);
        return "Registro agregado";
    }
    public String ListarCursos(){
        String output = "";
        for (Cursos cursos : cursosRepository.findAll()) {
            output += "Nombre: " + cursos.getNombre() + "\n";
            output += "Descripcion: " + cursos.getDescripcion() + "\n";
            output += "id" + cursos.getIdCursos()+"\n";
        } if (output != ""){
            return "No hay cursos";
        }else{
            return output;
        }
    }

    public String obtenerCurso(int id){
        String output = "";
        for (Cursos cursos : cursosRepository.findAll()) {
            output += "Nombre: " + cursos.getNombre() + "\n";
            output += "Descripcion: " + cursos.getDescripcion() + "\n";
            output += "id" + cursos.getIdCursos()+"\n";
        }if (output != ""){
            return "No hay cursos";
        }else{
            return output;
        }
    }

    public String eliminarCurso(int id){
        String output = "";
        for (Cursos cursos : cursosRepository.findAll()) {
            output += "Nombre: " + cursos.getNombre() + "\n";
            output += "Descripcion: " + cursos.getDescripcion() + "\n";
            output += "id" + cursos.getIdCursos()+"\n";
        }if (output != ""){
            return "No hay cursos";
        }else{
            return output;
        }
    }

    public String actualizarCurso(int id, Cursos cursos){
        String output = "";
        for (Cursos curso : cursosRepository.findAll()) {
            output += "Nombre: " + curso.getNombre() + "\n";
            output += "Descripcion: " + curso.getDescripcion() + "\n";
            output += "id" + curso.getIdCursos()+"\n";
        }if (output != ""){
            return "No hay cursos";
        }else{
            return output;
        }
    }





































}
