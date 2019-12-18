/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.matrix;

import calculator.vectors.Vector;
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
public class MatrixProductTest {

    public MatrixProductTest() {
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
    public void matrixProductCorrect() {
        Vector v = new Vector("1.0,2.0,3.0");
        Matrix m = new Matrix();
        m.addVector(v);
        m.addVector(v);
        MatrixProduct mm = new MatrixProduct(m, m);
        mm.calculateMatrixProduct();
        ArrayList<Vector> results = mm.getResults();
        Matrix mmResults = new Matrix(results);

        Matrix compare = new Matrix();
        compare.addVector(new Vector("14.0,14.0"));
        compare.addVector(new Vector("14.0,14.0"));

        assertEquals(compare.toString(), mmResults.toString());

    }

}
