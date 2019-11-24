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

    //numbers are given before list 
    public Vector(ArrayList<Double> values) {
        this.values = values;

    }

    public ArrayList<Double> getValues() {
        return values;
    }

}
