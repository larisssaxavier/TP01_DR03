package org.exemple.service;

import org.example.ScientificCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAddition {

    @Test
    public void testAddition_ShouldReturnCorrectResult() {
        var addition = new ScientificCalculator();
        var result = addition.add(3.5, 4.5);
        var sum = 3.5 + 4.5;

        Assertions.assertEquals(sum, result);
    }

    @Test
    public void testAddition_ShouldReturnNegativeResult() {
        var addition = new ScientificCalculator();
        var result = addition.add(-2.9, -8.6);
        var sum = -2.9 + -8.6;
        Assertions.assertEquals(sum, result);
    }
}
