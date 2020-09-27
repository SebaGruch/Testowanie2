package sda;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonAssertJTest {

    @Test
    void personTest(){
        // arrange
        final var jan = new PersonTest.Person("Jan", "Kowalski");
        // act
        final var fullName = jan.getFullName();

        // assert
                Assertions.assertThat(fullName)
                .as("Full name should be name + space + last name")
                .startsWith("Jan")
                .contains(" ")
                .endsWith("Kowalski");


    }

}
