package calc;

import org.junit.jupiter.api.*;

import javax.sound.midi.Soundbank;

public class LifeCycleTest {

 /* private final Calculator calculator = new Calculator();

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
  */

    @BeforeAll
    static void beforeAll(){
        System.out.println("This is called ONCE before all tests");

            }

    @BeforeEach
    void beforeEach(){
        System.out.println("This is called before EACH test");
    }

    @Test
    void test1(){
        System.out.println("1");
    }

    @Test
    void test2(){
        System.out.println("2");
    }

    @Test
    void test3(){
        System.out.println("3");
    }

    @AfterEach
    void afterEach(){
        System.out.println("This is called after EACH test");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("This is called ONCE after all tests");
    }

}
