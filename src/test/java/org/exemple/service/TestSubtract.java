package org.exemple.service;

import org.example.ScientificCalculator;
import org.junit.jupiter.api.*;

public class TestSubtract {
    private ScientificCalculator subtract;
    private double valorUm;
    private double valorDois;
    private double expected;

    //Fase de Setup
    @BeforeEach
    public void setUp() {
        //Arrange - preparação de dados
        subtract= new ScientificCalculator();
        valorUm = 57;
        valorDois = 5.56;
        expected = 51.44;
    }

    //Fase de Execution e Assertion
    @Test
    public void testSubtract_Should_Return_Result() {
        //Act - Execução do cálculo
        double actual = subtract.subtract(valorUm,valorDois);

        //Assert - Verificação de resultado
        Assertions.assertEquals(expected,actual);
    }

    //Fase de TearDown
    @AfterEach
    public void tearDown() {
        subtract=null;
    }
}
