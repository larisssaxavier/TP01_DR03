package org.exemple.service;

import org.example.ScientificCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSinAndCos {
    private int valorUm;
    private int valorDois;
    private ScientificCalculator sinAndCos;

    @BeforeEach
    public void setUp() {
        sinAndCos = new ScientificCalculator();
        //Valores em graus
        valorUm = 30;
        valorDois = 60;
    }
    @Test
    public void testSin() {
        double actual = sinAndCos.sin(valorUm);
        double expected = 0.5;
        Assertions.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCos() {
        double actual = sinAndCos.cos(valorDois);
        double expected = 0.5;
        Assertions.assertEquals(expected, actual, 0.001);
    }
}
