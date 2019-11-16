/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.matrix;

import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author tallbera
 */
public class Matrix {
    
    int rows;
    int columns;
    double[][] matrix;
    ArrayDeque<Double> values = new ArrayDeque();
    
    public Matrix(int rows, int columns){
    
        this.rows=rows;
        this.columns=columns;
        this.matrix= new double[rows][columns];    
    }
    
    //Filling the Matrix with numbers
    //Give the numbers starting from first row and first column and continue filing the first row. 
    public void fillTheMatrix(){
        
        for(int i=0;i<this.rows;i++){
            for(int j=0;j<this.columns;j++){
                values.getFirst();            
            }
        }  
    }
    
    
}
