/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.vectors;

import java.util.ArrayList;
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
public class VectorTest {

    public VectorTest() {
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

    @Test
    public void vectorStringTest() {
        String values = "1,2,3";
        Vector v = new Vector(values);
        ArrayList<Double> listedValues = new ArrayList();
        listedValues.add(1.0);
        listedValues.add(2.0);
        listedValues.add(3.0);
        assertEquals(listedValues, v.getValues());

    }

    @Test
    public void vectorLength() {
        ArrayList<Double> values = new ArrayList();
        values.add(1.0);
        values.add(1.0);
        values.add(1.0);
        values.add(1.0);

        Vector v = new Vector(values);
        double result = v.vectorLength(v);
        assertTrue(result == 2);
    }

    @Test
    public void vectorToHistory() {
        Vector v = new Vector("1,1,1,1");
        v.vectorLength(v);
        assertEquals("Length of vector " + v.toString() + " is " + 2.0, v.toHistory(v));

    }

}
