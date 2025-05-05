package com.biblioteca.bibliotecaduoc.repository;

import com.biblioteca.bibliotecaduoc.model.Prestamo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PrestamoRepository {
    private List<Prestamo> listaPrestamos = new ArrayList<>();

    //Metodo que retorna lista de prestamos
    public List<Prestamo> obtenerPrestamo() {
        return listaPrestamos;
    }

    //Guarda prestamo en arreglo
    public Prestamo guardar(Prestamo prest) {
        listaPrestamos.add(prest);
        return prest;
    }

    //Busqueda de prestamo por id
    public Prestamo buscarPorId(int id) {
        for (Prestamo prestamo : listaPrestamos) {
            if (prestamo.getId_prestamo() == id){
                return prestamo;
            }
        }
        return null;
    }

    //Metodo de actualizacion de prestamo
    public Prestamo actualizar(Prestamo prest) {
        int id = 0;
        int idPosicion = 0;

        for (int i = 0; i < listaPrestamos.size(); i++) {
            if (listaPrestamos.get(i).getId_prestamo() == prest.getId_prestamo()){
                id = prest.getId_prestamo();
                idPosicion = i;
            }
        }

        Prestamo prestamo1 = new Prestamo();
        prestamo1.setId_prestamo(id);
        prestamo1.setId_libro(prest.getId_libro());
        prestamo1.setRun_solicitante(prest.getRun_solicitante());
        prestamo1.setFecha_solicitud(prest.getFecha_solicitud());
        prestamo1.setFecha_entrega(prest.getFecha_entrega());
        prestamo1.setCantidad_dias(prest.getCantidad_dias());
        prestamo1.setMultas(prest.getMultas());

        listaPrestamos.add(idPosicion, prestamo1);
        return prestamo1;
    }

    //Metodo eliminar prestamos
    public void eliminar(int id) {

        Prestamo prestamo= buscarPorId(id);
        if (prestamo != null){
            listaPrestamos.remove(prestamo);
        }
    }
}
