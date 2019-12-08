/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculator.matrix.Matrix;
import calculator.matrix.MatrixProduct;
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
    public void matrixProductTest() {
        Vector a = new Vector("1,1");
        Vector b = new Vector("2,2");
        ArrayList<Vector> vectors = new ArrayList();
        vectors.add(a);
        vectors.add(b);
        Matrix matrix = new Matrix(vectors);
        MatrixProduct test = new MatrixProduct(matrix, matrix);
        ArrayList<Vector> results = test.calculateMatrixProduct();
       
        Vector c = new Vector("2,4");
        Vector d = new Vector("4,8");        
        ArrayList<Vector> shouldBe = new ArrayList();
        shouldBe.add(c);
        shouldBe.add(d);
        assertEquals(shouldBe.toString(),results.toString());
        
        
    }

}
