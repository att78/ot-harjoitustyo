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
 * Matriisitulo lasketaan tässä luokassa
 * @author tallbera
 */
public class MatrixProduct {

    private Matrix matrixA;
    private Matrix matrixB;
    private ArrayList<Vector> results = new ArrayList();

    //matrix B should be changed columns to rows in order to make effective calculations
    //   
    /**
     * Matriisitulon konstruktori     * 
     * @param matrixA Käyttäjän syötteestä muodostettu matriisi
     * @param matrixB Käyttäjän syötteestä muodostettu matriisi
     */
    public MatrixProduct(Matrix matrixA, Matrix matrixB) {

        Vector firstA = matrixA.getMatrix().get(0);
        Vector firstB = matrixB.getMatrix().get(0);

        if (firstA.getValues().size() == firstB.getValues().size()) {
            this.matrixA = matrixA;
            this.matrixB = matrixB;
        }

    }
    

    /**
     * Laskee annetuista matriiseista matriisitulon 
     * @return palauttaa tulokset ArrayListinä
     */
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

    /**
     * Muodostaa String-muotoisen lauseen matriisitulon tuloksista
     * @return String-muotoisen lauseen
     */
    public String toString() {

        Matrix answer = new Matrix(results);
        return answer.toString();
    }

}
