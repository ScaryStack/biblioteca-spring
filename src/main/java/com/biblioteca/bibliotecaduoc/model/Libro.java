package com.biblioteca.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //genera getters, setters, toString, equals, hashCode y un constructor con los campos requeridos
@AllArgsConstructor //genera constructor que incluye todos los campos de la clase como parámetros.
@NoArgsConstructor //genera constructor sin argumentos.


public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;

}
