package org.learn;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("When the start Math Utils Test Class Run")
public class MathUtilsTest {

    MathUtils mathUtils;


    @BeforeEach // Allow this method run before each method.
    void init(){
        mathUtils = new MathUtils();
    }

    @Nested
    @DisplayName("Testing add method")
    class AddTest {
        @Test
        @DisplayName("when  add method is testing two positive numbers ")
        void testAddPositive(){
            int expected = 2;
            int actual = mathUtils.add(1, 1);
            assertEquals(expected, actual, "Should return  the right sum");
        }

        @Test
        @DisplayName("When the add method is testing negative numbers")
        void testAddNegative(){
            int expected = -2;
            int actual = mathUtils.add(-1, -1);
            assertEquals(expected, actual, "Should return  the right sum");
        }

    }



    @Test
    @DisplayName("Multiply method")
    void testMultiply(){
//        assertEquals(-1, mathUtils.multiply(-1, -1), "Should return the right product");
        assertAll(
                () -> assertEquals(1, mathUtils.multiply(-1, -1), "Should return the right product"),
                () -> assertEquals(0, mathUtils.multiply(2, 0), "Should return the right product"),
                () -> assertEquals(-2, mathUtils.multiply(-1, 2), "Should return the right product")
        );
    }


//    @EnabledOnOs(OS.LINUX)
    @Test
    @DisplayName("Testing divide method")
    void testDivide(){
        assumeTrue(true); // Is like a condition will stop the method if is fail the assumption.
        assertThrows(
                ArithmeticException.class,
                () -> mathUtils.divide(1 , 0),
                "Divide by zero should throw");
    }


    @Test
    @DisplayName("Testing compute circle area method")
    void testComputeCircleArea(){
        assertEquals(314.1592653589793, mathUtils.computeCircleArea(10), "The compute circle area should find the area of the radios giving.");
    }

    @Test
    @Disabled
    @DisplayName("This method shouldn't be run")
    void testDisabled(){
        fail("This method should be disabled");
    }


//    @BeforeAll
//    void beforeAllInit(){
//        System.out.println("Running before all...");
//    }
//
//    @AfterAll
//    static void cleanUpAll(){
//        System.out.println("Cleaning up after all");
//    }
//
//    @AfterEach // It will be executed when each method finished its test
//    void cleanUp(){
//        System.out.println("Clening up....");
//    }


}
