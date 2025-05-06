package org.exemple.service;

import org.example.ScientificCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMultiplyAndDivide {
    private ScientificCalculator operation;
    private double valorUm;
    private double valorDois;

    //Fase de Setup
    @BeforeEach
    public void setUp() {
        //Arrange - preparação de dados
        operation= new ScientificCalculator();
        valorUm = 38;
        valorDois = 25;
    }

    @Test
    public void testMultiply_Should_Return_Result() {
        double actual = operation.multiply(valorUm, valorDois);
        var expected = 950;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testDivide_Should_Return_Result() {
        double actual = operation.divide(valorUm, valorDois);
        var expected = 1.52;
        Assertions.assertEquals(expected, actual,  0.0001);
    }
    @AfterEach
    public void tearDown() {
        operation= null;
    }
}
