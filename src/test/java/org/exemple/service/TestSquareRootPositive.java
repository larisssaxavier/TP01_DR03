package org.exemple.service;

import org.example.ScientificCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSquareRootPositive {
    private double positiveNumber;
    private double negativeNumber;
    private ScientificCalculator squareRoot;

    @BeforeEach
    public void setUp() {
        squareRoot = new ScientificCalculator();
        positiveNumber = 225;
        negativeNumber = -81;
    }
    @Test
    public void testSquareRoot_HappyPath() {
        double actual = squareRoot.squareRoot(positiveNumber);
        var expected = 15;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSquareRootNegative() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            squareRoot.squareRoot(negativeNumber);});
    }
}
