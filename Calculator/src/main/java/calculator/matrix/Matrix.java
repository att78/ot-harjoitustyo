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
 * Tämä luokkaa muodostaa matriisitulossa käytettävän matriisin
 *
 * @author tallbera
 */
public class Matrix {

    ArrayList<Vector> matrix;

    /**
     * tyhjä konstruktori käyttäjän syötettä varten.
     */
    public Matrix() {

    }

    //every vector on the list must be same length and it should be checked
    /**
     * Testauksessa käytetty konstruktori
     *
     * @param matrix valmis lista vektoreita
     */
    public Matrix(ArrayList<Vector> matrix) {

        this.matrix = matrix;
//       
    }

    /**
     * Tämä metodi palauttaa matriisin vektorit listana
     *
     * @return Arraylistin, joka sisältää vektorit
     */
    public ArrayList<Vector> getMatrix() {
        return matrix;
    }

    /**
     * Tämä metodi lisää matriisiin vektorin
     *
     * @param v Käyttäjän syötteestä muodostettu vektori
     */
    public void addVector(Vector v) {
        //if same length
        if (matrix.isEmpty()) {
            matrix.add(v);
        } else if (matrix.get(0).getValues().size() == v.getValues().size()) {
            matrix.add(v);
        }

    }

    /**
     * Metodi muodostaa matriisia kuvaavan Stringin käymällä vektorit läpi ja
     * lisäämällä vielä loppuun yhden rivivaihdon
     *
     * @return
     */
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
