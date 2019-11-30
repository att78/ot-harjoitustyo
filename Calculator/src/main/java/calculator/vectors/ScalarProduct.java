/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.vectors;

/**
 *
 * @author tallbera
 */
public class ScalarProduct {

    private double scaProduct;
    Vector a;
    Vector b;

    //vector size must be checked either before constructor or in constructor
    public ScalarProduct(Vector a, Vector b) {
        if (a.getValues().size() == b.getValues().size()) {
            this.a = a;
            this.b = b;
        }
    }

    public void scalarProduct() {

        for (int i = 0; i < a.getValues().size(); i++) {
            scaProduct += (a.getValues().get(i) * b.getValues().get(i));

        }
    }

    public double getScaProduct() {
        return scaProduct;
    }

    public Vector getA() {
        return a;
    }

    public Vector getB() {
        return b;
    }
    
    public String toString(){
    
        
    String answer = "ScalarProduct of " +this.a.toString()+" and "+this.b.toString()+" is "+scaProduct;
     return answer;
    }
    

}
