package com.f_rafael.mockito_prueba.repository;

import com.f_rafael.mockito_prueba.model.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class PersonaRepositoryTest {

    @Autowired
    private PersonaRepository repository;

    @Test
    public void PersonaRepository_Save_ReturnSavedPersona(){
        Persona persona = new Persona(1L,32361730L,"Fernando Rafael","Alvarez");

        Persona savedPersona = repository.save(persona);

        Assertions.assertTrue(savedPersona!=null);
        Assertions.assertTrue(savedPersona.getId()>0);
    }
}
