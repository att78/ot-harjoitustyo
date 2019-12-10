/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.function1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tallbera
 */
public class FunctionTest {

    public FunctionTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void YWhenXIsZero() {

        Function function = new Function(1, 1, 0);
        double result = function.solveYatXAxis();
        double zero = 0;
        assertTrue(result == zero);

        Function function2 = new Function(1, -1, 1);
        double result2 = function2.solveYatXAxis();
        assertTrue(result2 == 1);

        Function function3 = new Function(1, 0, 1);
        double result3 = function3.solveYatXAxis();
        assertTrue(result3 == 1);

    }

    @Test
    public void XWhenYIsZero() {

        Function function = new Function(1, 1, 0);

        double result = function.solveXatYAxis();
        double zero = 0;
        assertTrue(result == zero);

        Function function2 = new Function(-1, 1, 1);
        double result2 = function2.solveXatYAxis();
        assertTrue(result2 == 1);

        Function function3 = new Function(0, 1, 1);
        double result3 = function3.solveXatYAxis();
        assertTrue(result3 == 1);

    }

    @Test
    public void toStringTest() {
        Function function = new Function(1, 1, 0);
        double resultX = function.solveXatYAxis();
        double resultY = function.solveYatXAxis();

        assertEquals(function.toString(), "At Y-axis x-value is " + resultX + " and at X-axis y-value is " + resultY);

    }

    @Test
    public void toHistoryTest() {
        Function function = new Function(1, 1, 0);
        double resultX = function.solveXatYAxis();
        double resultY = function.solveYatXAxis();

        assertEquals(function.toHistory(), "Y value is " + 1.0 + " X value is " + 1.0 + " and C value is " + 0.0 + "\n" + function.toString() + "\n");

    }

}
