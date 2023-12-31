import org.junit.jupiter.api.*;

import java.rmi.AccessException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll() {
        System.out.println("BeforeAll is executed.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("AfterAll is executed.");
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("BeforeEach is Executed");
    }
    @AfterEach
    void tearDownEach(){
        System.out.println("AfterEach is Executed");
    }

    @Test
    void add() {
        int actual = Calculator.add(2,3);
        assertEquals(4, actual, "Test failed.");
    }

    @Test
    void testCase1(){
//        System.out.println("Test Case 1");
        fail("Not implemented yet.");
    }
    @Test
    void testCase2(){
        System.out.println("Test Case 2");
        assertEquals("add", Calculator.operator);
        assertTrue(Calculator.operator.equals("add"));
    }
    @Test
    void testCase3(){
        System.out.println("Test Case 3");
        assertArrayEquals(new int[]{1,2,3}, new int[]{1,2,3}, "Arrays are not same");
    }
    @Test
    void testCase4(){
        System.out.println("Test Case 4");

        String nullString = null;
        String notNull = "Cydeo";

        assertNull(nullString);
        assertNotNull(notNull);
    }
    @Test
    void testCase5(){
        System.out.println("Test Case 5");


        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();

        assertSame(c1,c2);
        assertNotSame(c1,c3);

    }

    @Test
    void add2() {
        System.out.println("Add2 test case");
        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(3,2));
    }
    @Test
    void add3() {
        System.out.println("Add3 test case");
        assertThrows(AccessException.class, () -> Calculator.add2(3,2));
    }
    @Test
    void add4() {
        System.out.println("Add4 test case");
        assertThrows(IllegalArgumentException.class, () -> Calculator.add2(2,3));
    }
}