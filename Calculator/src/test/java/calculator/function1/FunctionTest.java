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
    public void YWhenXIsZero(){
    
        Function function =new Function(1,1,0);
        
        double result=function.solveYatXAxis();
        double zero = 0;
        
        assertTrue(result==zero);
           
    }
    
    @Test
    public void XWhenYIsZero(){
        
    Function function =new Function(1,1,0);
        
        double result=function.solveXatYAxis();
        double zero = 0;
        
        assertTrue(result==zero);
               
    }
    
}
