/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.matrix;

import java.util.ArrayDeque;

/**
 *
 * @author tallbera
 */
public class MatrixProduct {
    
    Matrix matrixA;
    Matrix matrixB;
    ArrayDeque<Double> results = new ArrayDeque();
    
    //matrix B should be changed columns to rows in order to make effective calculations
   //   
    // uups. Gotta think, what to do next
    public MatrixProduct(Matrix matrixA, Matrix matrixB){
        this.matrixA=matrixA;
        this.matrixB=matrixB;
    
    }
    
       
    
    
    
    
}
