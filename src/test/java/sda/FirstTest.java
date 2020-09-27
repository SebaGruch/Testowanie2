package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FirstTest {

    @Test
    void helloTest(){
        Assertions.assertFalse(new Greeter().hello().isEmpty());

        // arrange
        final var greeter = new Greeter();

        // act
        final var msg = greeter.hello();

        // assert
        Assertions.assertFalse(msg.isEmpty());

    }

    private static class Greeter{
        private String hello() {
            return "Hello";

        }
    }

}
