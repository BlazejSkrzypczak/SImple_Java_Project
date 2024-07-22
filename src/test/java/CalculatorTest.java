package com.example;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {

    @Test
    public void testAdd(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 3;
        int result = calculator.add(a, b);
        assertEquals(8, result, "Zwracana wartość wynosi: " + result);
    }
}
