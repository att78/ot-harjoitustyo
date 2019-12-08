/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.matrix;

import calculator.vectors.ScalarProduct;
import calculator.vectors.Vector;
import java.util.ArrayDeque;
import java.util.ArrayList;

/**
 *
 * @author tallbera
 */
public class MatrixProduct {

    private Matrix matrixA;
    private Matrix matrixB;
    private ArrayList<Vector> results = new ArrayList();

    //matrix B should be changed columns to rows in order to make effective calculations
    //   
    // uups. Gotta think, what to do next
    public MatrixProduct(Matrix matrixA, Matrix matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;

    }

    public ArrayList<Vector> calculateMatrixProduct() {

        for (int i = 0; i < matrixA.getMatrix().size(); i++) {
            ArrayList<Double> vector = new ArrayList();
            for (int j = 0; j < matrixA.getMatrix().get(0).getValues().size(); j++) {
                ScalarProduct sc = new ScalarProduct(matrixA.getMatrix().get(i), matrixB.getMatrix().get(j));
                sc.scalarProduct();
                //calculation of vectors here
                double result = sc.getScaProduct();
                vector.add(result);
            }
            //missing parts vectors mustbeadded to results
            Vector rowVector = new Vector(vector);
            results.add(rowVector);
        }
        //should it be void?
        return results;

    }

    public String toString() {

        Matrix answer = new Matrix(results);
        return answer.toString();
    }

}
