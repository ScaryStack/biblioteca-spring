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

    //Busqueda de libro por id
    public Libro buscarPorId(int id) {
        for (Libro libro : listaLibros) {
            if (libro.getId() == id){
                return libro;
            }
        }
        return null;
    }

    //Busqueda de libro por isbn
    public Libro buscarPorIsbn(String isbn) {
        for (Libro libro : listaLibros) {
            if (libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }
}
