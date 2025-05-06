package org.exemple.service;

import org.example.ScientificCalculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ScientificCalculatorTest {
    private double valorDivisao;
    private ScientificCalculator divideByZero;
    private ScientificCalculator operation;
    private double valorUm;
    private double valorDois;
    private int valorUmSinCos;
    private int valorDoisSinCos;
    private ScientificCalculator sinAndCos;
    private double positiveNumber;
    private double negativeNumber;
    private ScientificCalculator squareRoot;
    private ScientificCalculator subtract;
    private double valorUmSub;
    private double valorDoisSub;
    private double expectedSub;

    @BeforeEach
    public void setUp() {
        divideByZero = new ScientificCalculator();
        valorDivisao = 34;
        operation= new ScientificCalculator();
        valorUm = 38;
        valorDois = 25;
        sinAndCos = new ScientificCalculator();
        //Valores em graus
        valorUmSinCos = 30;
        valorDoisSinCos = 60;
        squareRoot = new ScientificCalculator();
        positiveNumber = 225;
        negativeNumber = -81;
        //Arrange - preparação de dados
        subtract= new ScientificCalculator();
        valorUmSub = 57;
        valorDoisSub = 5.56;
        expectedSub = 51.44;
    }

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

    @Test
    public void testDivideByZero_ShouldReturnException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            divideByZero.divide(valorDivisao, 0 );
        });
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
    @Test
    public void testSin() {
        double actual = sinAndCos.sin(valorUmSinCos);
        double expected = 0.5;
        Assertions.assertEquals(expected, actual, 0.001);
    }
    @Test
    public void testCos() {
        double actual = sinAndCos.cos(valorDoisSinCos);
        double expected = 0.5;
        Assertions.assertEquals(expected, actual, 0.001);
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
    //Fase de Execution e Assertion
    @Test
    public void testSubtract_Should_Return_Result() {
        //Act - Execução do cálculo
        double actual = subtract.subtract(valorUmSub,valorDoisSub);

        //Assert - Verificação de resultado
        Assertions.assertEquals(expectedSub,actual);
    }
    @AfterEach
    public void tearDown() {
        operation= null;
        subtract=null;
    }
}
