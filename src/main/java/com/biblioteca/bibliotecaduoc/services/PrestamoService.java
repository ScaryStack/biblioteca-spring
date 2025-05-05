package com.biblioteca.bibliotecaduoc.services;

import com.biblioteca.bibliotecaduoc.model.Prestamo;
import com.biblioteca.bibliotecaduoc.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {
    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> getPrestamos() {
        return prestamoRepository.obtenerPrestamo();
    }

    public Prestamo savePrestamo(Prestamo prestamo) {
        return prestamoRepository.guardar(prestamo);
    }

    public Prestamo getPrestamo(int id) {
        return prestamoRepository.buscarPorId(id);
    }

    public Prestamo updatePrestamo(Prestamo prestamo) {
        return prestamoRepository.actualizar(prestamo);
    }

    public String deletePrestamo(int id) {
        prestamoRepository.eliminar(id);
        return "Prestamo eliminado";
    }
}
