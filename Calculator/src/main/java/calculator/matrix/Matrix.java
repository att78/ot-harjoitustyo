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
    boolean row = false;
    boolean column = false;

    public Matrix(int rows, int columns) {

        this.rows = rows;
        this.columns = columns;
        this.matrix = new double[rows][columns];
    }

    //Filling the Matrix with numbers
    //Give the numbers starting from first row and first column and continue filing the first row. 
    //turha?
    public void fillTheMatrixRowWise() {

        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                values.getFirst();
            }
        }
    }

    public void giveNumbersRowWise(double number) {

        if (column == false) {

            values.add(number);
            row = true;
        }
    }

    public void giveNumbersColumnWise(double number) {

        if (row == false) {
            values.add(number);
            column = true;
        }

    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

}
