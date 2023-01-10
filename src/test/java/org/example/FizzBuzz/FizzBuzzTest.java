package org.example.FizzBuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    /**
     * Arrange (Preparar)
     * Act (Actuar)
     * Assert (Afirmar)
     */
    @Test
    public void number_divisible_by_three() {
        assertEquals(fizzBuzz.isDivisible(3), "Fizz");
    }

    @Test
    public void number_divisible_by_five() {
        assertEquals(fizzBuzz.isDivisible(5), "Buzz");
    }

    @Test
    public void number_divisible_by_three_and_five(){
        assertEquals(fizzBuzz.isDivisible(15), "FizzBuzz");
    }

    @Test
    public void number_other_case(){
        assertEquals(fizzBuzz.isDivisible(8), "8");
    }
}