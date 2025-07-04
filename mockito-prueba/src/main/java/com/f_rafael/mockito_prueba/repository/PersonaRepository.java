package com.f_rafael.mockito_prueba.repository;

import com.f_rafael.mockito_prueba.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {

    public Optional<Persona> findByNombres(String nombres);
}
