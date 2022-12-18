package com.paginaprueba.backprueba.repository;

import com.paginaprueba.backprueba.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RPersona extends JpaRepository<Persona, Long> {//esto trae todas las funciones del CRUD
}
