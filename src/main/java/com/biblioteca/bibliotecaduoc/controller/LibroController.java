package com.biblioteca.bibliotecaduoc.controller;

import com.biblioteca.bibliotecaduoc.model.Libro;
import com.biblioteca.bibliotecaduoc.services.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> listarLibros() {
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }

    @GetMapping("{id}")
    public Libro buscarLibro(@PathVariable int id) {
        return libroService.getLibroId(id);
    }

    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro) {
        //id se usa para verificar que libro actualizar
        return libroService.updateLibro(libro);
    }

    @DeleteMapping("{id}")
    public String eliminarLibro(@PathVariable int id) {
        return libroService.deleteLibro(id);
    }

    @GetMapping("/total")
    public int totalLibrosV2() {
        return libroService.totalLibrosV2();
    }

    @GetMapping("/isbn/{isbn}")
    public Libro buscarLibroIsbn(@PathVariable String isbn) {
        return libroService.getLibroIsbn(isbn);
    }

    @GetMapping("/año/{fechaPublicacion}")
    public List<Libro> buscarLibroFechaPublicacion(@PathVariable int fechaPublicacion) {
        return libroService.getLibroAnio(fechaPublicacion);
    }

    @GetMapping("/autor/{autor}")
    public List<Libro> buscarLibroAutor(@PathVariable String autor) {
        return libroService.getLibroAutor(autor);
    }

    @GetMapping("/antiguo")
    public Libro buscarLibroAntiguo() {
        return libroService.getLibroAntiguo();
    }

    @GetMapping("/nuevo")
    public Libro buscarLibroNuevo() {
        return libroService.getLibroNuevo();
    }

    @GetMapping("/orden")
    public List<Libro> libroOrdenado() {
        return libroService.getLibroOrdenado();
    }
}
