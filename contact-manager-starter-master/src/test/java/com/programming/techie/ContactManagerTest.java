package com.programming.techie;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.*;

class ContactManagerTest {

    ContactManager contactManager;

    @BeforeAll
    static void setupAll(){
        System.out.println("Should print before all tests");
    }

    @BeforeEach
    void setup(){
        contactManager = new ContactManager();
    }

    @Test
    void shouldCreateContact(){
        contactManager.addContact("John","Doe","0555984984");
        Assertions.assertFalse(contactManager.getAllContacts().isEmpty());
        Assertions.assertEquals(1,contactManager.getAllContacts().size());
    }
    @RepeatedTest(value = 3,
            name = "Repeating {currentRepetition} of {totalRepetitions}") // Repite el método tantas veces como le indiquemos
    void repetir(){
        System.out.println("Test a repetir");

    }

    @AfterEach
    void tearDown(){
        System.out.println("Should execute after each test");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("Should be executed at the end of the test");
    }
    @Test
    @DisabledOnOs(value = OS.WINDOWS, disabledReason = "It's disabled on windows")
    void f(){
        System.out.println("Disabled on windows");
    }

    @Test
    @DisabledOnOs(value = OS.LINUX, disabledReason = "It's disabled on linux")
    void d(){
        System.out.println("Disabled on linux");
    }

}