package com.buscarpersonas.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.buscarpersonas.Entity.Profesor;

public interface ProfesorRepository extends JpaRepository<Profesor, String> {
    List<Profesor> findByNombreContainingIgnoreCase(String nombre);

    Profesor findByRut(String rut);
}