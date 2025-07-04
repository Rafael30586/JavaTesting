package com.f_rafael.mockito_prueba.controller;

import com.f_rafael.mockito_prueba.model.Persona;
import com.f_rafael.mockito_prueba.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/personas")
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping("/{id}")
    public Persona findById(@PathVariable Long id){
        Optional<Persona> optional = service.findById(id);

        if(optional.isPresent()){
            return optional.get();
        }else{
            return new Persona(-9999L,-99999L,"sssssss","ssssss");
        }
    }

    @GetMapping
    public ResponseEntity<List<Persona>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        service.deleteById(id);
    }

    @PostMapping
    public ResponseEntity<Persona> save(@RequestBody Persona persona){
        return ResponseEntity.ok(service.save(persona));
    }

    @PutMapping
    public ResponseEntity<Persona> update(@RequestBody Persona persona){
        return ResponseEntity.ok(service.update(persona));
    }

    @GetMapping("/{nombres}")
    public ResponseEntity<Persona> findByNombres(@PathVariable String nombres){
        Optional<Persona> optional = service.findByNombres(nombres);
        if(optional.isPresent()){
            return ResponseEntity.ok(service.findByNombres(nombres).get());
        }else{
            return ResponseEntity.ok(null);
        }

    }

}
