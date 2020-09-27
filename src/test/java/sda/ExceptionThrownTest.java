package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExceptionThrownTest {

    @Test
    void myExceptionIsThrown(){

        Assertions.assertDoesNotThrow(() -> {
            throwExeption();

        });
    }

    public static void throwExeption() throws MyException {
        throw new MyException();

    }

    private static class MyException extends Exception{}

}
