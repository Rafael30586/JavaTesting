package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @BeforeEach // Este método se ejecuta antes de cada método del test
    void ejecutarseAntes(){
        System.out.println("Hola");
    }

    @DisplayName("Fiftynine should return F") // Esta anotación permite darle un nombre más claro al método
    @Test
    void fiftyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F',grader.determineLetterGrade(59));
    }

    @Test
    void sixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.determineLetterGrade(69));
    }

    @Test
    void seventyNineShouldReturnC(){
        var grader = new Grader();
        assertEquals('C',grader.determineLetterGrade(79));
    }

    @Test
    void eightyNineShouldReturnB(){
        var grader = new Grader();
        assertEquals('B',grader.determineLetterGrade(89));
    }

    @Test
    void ninetyNineShouldReturnA(){
        var grader = new Grader();
        assertEquals('A',grader.determineLetterGrade(99));
    }

    @Test
    void negativeOneShouldReturnIllegalArguemntException(){
        var grader = new Grader();

        assertThrows(IllegalArgumentException.class,
                () -> {
            grader.determineLetterGrade(-1);
                });
    }

}