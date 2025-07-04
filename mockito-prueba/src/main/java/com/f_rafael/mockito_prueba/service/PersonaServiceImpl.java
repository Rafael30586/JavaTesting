package com.f_rafael.mockito_prueba.service;

import com.f_rafael.mockito_prueba.model.Persona;
import com.f_rafael.mockito_prueba.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService{


    private PersonaRepository repository;

    @Autowired
    public PersonaServiceImpl(PersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Persona> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Persona> findAll() {
        return repository.findAll();
    }

    @Override
    public Persona save(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Persona update(Persona persona) {
        return repository.save(persona);
    }

    @Override
    public Optional<Persona> findByNombres(String nombres) {
        return repository.findByNombres(nombres);
    }
}
