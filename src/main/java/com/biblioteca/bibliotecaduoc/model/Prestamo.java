package com.biblioteca.bibliotecaduoc.model;

import com.biblioteca.bibliotecaduoc.model.Libro;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {

    //contador para incremento
    private static int contadorId = 1;

    private int id_prestamo = contadorId++;
    private int id_libro;
    private String run_solicitante;
    private Date fecha_solicitud;
    private Date fecha_entrega;
    private int cantidad_dias;
    private int multas;

    public void setMultas(int multas) {
        this.multas = Math.max(multas, 0);
    }

}
