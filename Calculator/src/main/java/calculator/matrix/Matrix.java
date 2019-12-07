/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.matrix;

import calculator.vectors.Vector;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author tallbera
 */
public class Matrix {

    ArrayList<Vector> matrix;

    //every vector on the list must be same length and it should be checked
    public Matrix(ArrayList<Vector> matrix) {
//        int min = matrix.get(0).getValues().size();
//        int max = matrix.get(0).getValues().size();
//        for (Vector v : matrix) {
//            if (max < v.getValues().size()) {
//                max = v.getValues().size();
//            }
//            if (min > v.getValues().size()) {
//                min = v.getValues().size();
//            }
//        }
//        if (min == max) {
            this.matrix = matrix;
//        } else {
//            ArrayList<Double> zero = new ArrayList();
//            zero.add(0.0);
//            Vector v = new Vector(zero);
//            this.matrix.add(v);
//        }
    }

    public ArrayList<Vector> getMatrix() {
        return matrix;
    }

    public String toString() {

        String result = "";
        int vectorsAmount = this.matrix.size();

        for (int i = 0; i < vectorsAmount - 1; i++) {
            result += matrix.get(i).toString() + "\n";

        }
        result += matrix.get(vectorsAmount - 1).toString();

        return result;
    }

}
