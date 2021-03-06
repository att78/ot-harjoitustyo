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
public class ScalarProductTest {

    public ScalarProductTest() {
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
    public void scalar() {

        ArrayList<Double> valuesA = new ArrayList();
        valuesA.add(1.0);
        valuesA.add(1.0);
        valuesA.add(1.0);
        ArrayList<Double> valuesB = new ArrayList();
        valuesB.add(2.0);
        valuesB.add(2.0);
        valuesB.add(2.0);

        Vector a = new Vector(valuesA);
        Vector b = new Vector(valuesB);
        ScalarProduct s = new ScalarProduct(a, b);
        double result = 0;
        s.scalarProduct();
        result = s.getScaProduct();
        assertTrue(result == 6.0);
        assertTrue(s.getScaProduct() == 6.0);
        assertTrue(s.toString().equals("ScalarProduct of " + a.toString() + " and " + b.toString() + " is " + s.getScaProduct()));
    }

}
