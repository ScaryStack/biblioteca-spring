package com.biblioteca.bibliotecaduoc.repository;


import com.biblioteca.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository

public class LibroRepository {

    //Arreglo que guarda libros
    private List<Libro> listaLibros = new ArrayList<>();

    //Metodo que retorna lista de libros
    public List<Libro> obtenerLibros() {
        return listaLibros;
    }
}
