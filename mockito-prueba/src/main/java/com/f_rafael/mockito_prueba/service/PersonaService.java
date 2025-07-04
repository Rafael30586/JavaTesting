package com.f_rafael.mockito_prueba.service;

import com.f_rafael.mockito_prueba.model.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    public Optional<Persona> findById(Long id);
    public List<Persona> findAll();
    public Persona save(Persona persona);
    public void deleteById(Long id);
    public Persona update(Persona persona);
    public Optional<Persona> findByNombres(String nombres);
}
