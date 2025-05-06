package org.exemple.service;

import org.example.ScientificCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDivideByZero {
    private double valor;
    private ScientificCalculator divideByZero;

    @BeforeEach
    public void setUp() {
        divideByZero = new ScientificCalculator();
        valor = 34;
    }
    @Test
    public void testDivideByZero_ShouldReturnException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            divideByZero.divide(valor, 0 );
        });
    }
}
