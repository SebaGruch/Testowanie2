package sda;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    void checkFullNameTest(){
        // arrange
        final var jan = new Person("Jan", "Kowalski");
        // act
        final var fullName = jan.getFullName();
        Assertions.assertAll(
                () -> Assertions.assertTrue(fullName.startsWith("Jan"),
                        "Jan Should be at start of string"),
                () -> Assertions.assertTrue(fullName.contains(" "),
                        "Whitespace should be in the middle od name and last name"),
                () -> Assertions.assertTrue(fullName.endsWith("Kowalski"),
                        "Kowalski should be at the end of full name")

        );

    }

    private static class Person{
        private String name;
        private String lastName;

        private Person(String name, String lastName){
            this.name = name;
            this.lastName = lastName;

        }
        private String getFullName(){
            return name + " " + lastName;
        }

    }
}
