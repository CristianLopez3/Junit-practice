package org.learn;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MathUtilsTest {

    MathUtils mathUtils;


    @BeforeAll
    void beforeAllInit(){
        System.out.println("Running before all...");
    }

    @AfterAll
    static void cleanUpAll(){
        System.out.println("Cleaning up after all");
    }

    @BeforeEach // Allow this method run before each method.
    void init(){
        mathUtils = new MathUtils();
    }

    @AfterEach // It will be executed when each method finished its test
    void cleanUp(){
        System.out.println("Clening up....");
    }

    @Test
    void testAdd(){
        int expected = 2;
        int actual = mathUtils.add(1, 1);
        assertEquals(expected, actual, "The add method should add two numbers");
    }

    @Test
    void testDivide(){
        assertThrows(
                ArithmeticException.class,
                () -> mathUtils.divide(1 , 0),
                "Divide by zero should throw");
    }

    @Test
    void testComputeCircleArea(){
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "The compute circle area should find the area of the radios giving.");
    }



}
