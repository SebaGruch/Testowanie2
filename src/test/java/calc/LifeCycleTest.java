package calc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LifeCycleTest {

    private final Calculator calculator = new Calculator();

    @Test
    void testSum(){
        Assertions.assertEquals(4, calculator.sum(2,2));
    }
    @Test
    void testSum2(){
        Assertions.assertEquals(4, calculator.sum(2,2));
    }

    @Test
    void testSum3(){
        Assertions.assertEquals(4, calculator.sum(2,2));
    }
}
