package calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    final Calculator calc = new Calculator();

    @Test
    void sumTest() {
        Assertions.assertEquals(4, calc.sum(2, 2));
    }

    @Test
    void subtractionTest() {
        Assertions.assertEquals(0, calc.subtraction(2, 2));
    }

    @Test
    void divisionTest() {
        Assertions.assertEquals(2, calc.division(2, 1));
    }

    @Test
    void multiplicationTest() {
        Assertions.assertEquals(4, calc.multiplication(2, 2));
    }

    @Test
    void arithmeticExceptionIsThrownWhenTriesToDivideByZero(){
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calc.division(2, 0);
        });
        }
    }
