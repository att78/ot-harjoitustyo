/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.vectors;

import java.util.ArrayList;

/**
 *
 * @author tallbera
 */
public class Vector {
    
    private ArrayList<Double> values;
    private double scaProduct;
    
    //numbers are given before list 
    public Vector(ArrayList<Double> values){
        this.values = values;
    
    }

    public ArrayList<Double> getValues() {
        return values;
    }
    
       
    public void scalarProduct(Vector a, Vector b){
    
        double result =0;
        if(a.getValues().size()==b.getValues().size()){
            for(int i=0; i<a.getValues().size();i++){
                scaProduct =a.getValues().get(i)+b.getValues().get(i);            
            }       
        }else{
            System.out.println("Vectors are different size, cannot be calculated");
        }                
    }
    
    
    
    
    
    
    
}
