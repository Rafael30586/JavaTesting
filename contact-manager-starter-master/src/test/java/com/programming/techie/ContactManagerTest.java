package com.programming.techie;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

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

    @DisplayName("Phone Number should match the required Format")
    @ParameterizedTest // Tuve que añadir otra dependencia para que esta annotación funcione. Igual para @ValueSource y @CsvSource
    @ValueSource(strings = {"0123456789", "0123456798", "0123456897"})
    public void shouldTestPhoneNumberFormatUsingValueSource(String phoneNumber) {
        contactManager.addContact("John", "Doe", phoneNumber);
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());
    }

    @DisplayName("CSV Source Case - Phone Number should match the required Format")
    @ParameterizedTest
    @CsvSource({"0123456789", "0123456798", "0123456897"}) // csv hace referencia a comma separated value
    public void shouldTestPhoneNumberFormatUsingCSVSource(String phoneNumber) {
        contactManager.addContact("John", "Doe", phoneNumber);
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());
    }


    @DisplayName("Method Source Case - Phone Number should match the required Format")
    @ParameterizedTest
    @MethodSource("phoneNumberList") //Acepta como argumento un método y utiliza lo que dicho método devuelve para el test
    public void shouldTestPhoneNumberFormatUsingMethodSource(String phoneNumber) {
        contactManager.addContact("John", "Doe", phoneNumber);
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());
    }

    private static List<String> phoneNumberList() {
        return Arrays.asList("0123456789", "0123456798", "0123456897");
    }


    @DisplayName("CSV File Source Case - Phone Number should match the required Format")
    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv") // Hay un archivo csv en la carpeta resources con los valores
    public void shouldTestPhoneNumberFormatUsingCSVFileSource(String phoneNumber) {
        contactManager.addContact("John", "Doe", phoneNumber);
        assertFalse(contactManager.getAllContacts().isEmpty());
        assertEquals(1, contactManager.getAllContacts().size());
    }



}