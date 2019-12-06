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
public class MatrixTest {
    
    public MatrixTest() {
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
    public void toStringTest(){
        ArrayList<Double> values  = new ArrayList();
        values.add(1.0);
        values.add(2.0);
        Vector v = new Vector(values);
        ArrayList<Vector> vectors = new ArrayList();
        vectors.add(v);
        vectors.add(v);
        Matrix matrix = new Matrix(vectors);
        String answer = matrix.toString();
        assertEquals(answer, v.toString()+"\n"+v.toString());        
        
    }


}
