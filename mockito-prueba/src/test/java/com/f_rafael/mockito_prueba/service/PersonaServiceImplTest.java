package com.f_rafael.mockito_prueba.service;

import com.f_rafael.mockito_prueba.model.Persona;
import com.f_rafael.mockito_prueba.repository.PersonaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonaServiceImplTest {

    @Mock
    private PersonaRepository repository;
    @InjectMocks
    private PersonaServiceImpl service;

    /*
    @BeforeEach
    public void setup(){
        // PersonaRepository mock = Mockito.mock(PersonaRepository.class); Esta es una alternativa a la utilización de la anotación Mock
        service = new PersonaServiceImpl(repository);
    }*/

    @Test
    public void dadaPersonaCreadaEsperamosUnObjetopPersona(){
        Persona esperada = new Persona(1L,32361730L,"Fernando_Rafael", "Alvarez");
        Persona personaParaGuardar = new Persona();
        personaParaGuardar.setDni(32361730L);
        personaParaGuardar.setNombres("Fernando_Rafael");
        personaParaGuardar.setApellidos("Alvarez");
        Mockito
                .when(repository
                        .save(personaParaGuardar))
                .thenReturn(esperada);

        final Persona resultado = service.save(personaParaGuardar);
        Assertions.assertEquals(esperada.getId(),resultado.getId());
        Assertions.assertEquals(esperada.getDni(),resultado.getDni());
        Assertions.assertEquals(esperada.getNombres(),resultado.getNombres());
        Assertions.assertEquals(esperada.getApellidos(),resultado.getApellidos());
        Assertions.assertEquals(esperada,resultado);

    }
}
