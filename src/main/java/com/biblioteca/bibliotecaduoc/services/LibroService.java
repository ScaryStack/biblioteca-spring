package com.biblioteca.bibliotecaduoc.services;

import com.biblioteca.bibliotecaduoc.model.Libro;
import com.biblioteca.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String deleteLibro(int id){
        libroRepository.eliminar(id);
        return "Producto eliminado";
    }

    public int totalLibros(){
        return libroRepository.obtenerLibros().size();
    }

    //accion que deberia hacer el modelo
    public int totalLibrosV2(){
        return libroRepository.totalLibros();
    }

    public Libro getLibroIsbn(String isbn){
        return libroRepository.buscarPorIsbn(isbn);
    }

    public List<Libro> getLibroAnio(int fechaPublicacion){
        return libroRepository.totalLibrosPorAnio(fechaPublicacion);
    }

    public List<Libro> getLibroAutor(String autor){
        return libroRepository.totalLibrosPorAutor(autor);
    }

    public Libro getLibroAntiguo(){
        return libroRepository.libroMasAntiguo();
    }
}
