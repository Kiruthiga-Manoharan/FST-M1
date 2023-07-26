package example;

import example.Calculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition")
    public void testAdd1(){
        //calculator.add(1,2)==3
        assertEquals(calculator.add(1,2),3);
    }
    @Test
    @DisplayName("Multiplication")
    public void testMultiply1(){
        //calculator.multiply(4,5)==20
        assertEquals(calculator.multiply(4,5),20);
    }

}
