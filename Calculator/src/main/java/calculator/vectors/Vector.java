/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.vectors;

import java.util.ArrayList;

/**
 * Käyttäjän syöttämä vektori
 *
 * @author tallbera
 *
 */
public class Vector {

    private ArrayList<Double> values;

    //numbers are given before list
    /**
     * Testauksessa käytetty konstruktori
     * @param values Vektorin arvot suoraan annettuna testauksessa
     */
    public Vector(ArrayList<Double> values) {
        this.values = values;

    }

    /**
     * Konstrukoti, joka toimii käyttäjän syötteen pohjalta.
     * @param numbers Käyttäjän antama syöte
     */
    public Vector(String numbers) {
        ArrayList<Double> listOfNumbers = new ArrayList();
        String[] givenNumbers = numbers.split(",");
        for (int i = 0; i < givenNumbers.length; i++) {
            String n = givenNumbers[i];
            if (n == null) {
                continue;
            }
            double number = Double.parseDouble(n);
            listOfNumbers.add(number);
        }
        this.values = listOfNumbers;
    }

    public ArrayList<Double> getValues() {
        return values;
    }

    // vector length could be calculated with scalarproduct
    /**
     *
     * @return vektorin pituus eli skalaaritulo vektori itsellään kerrottuna
     */
    public double vectorLength() {
        Vector v = new Vector(this.values);
        ScalarProduct length = new ScalarProduct(v, v);
        length.scalarProduct();
        double result = length.getScaProduct();

        return result;
    }

    // vektorin tostring
    /**
     *
     * @return palauttaa vektorin arvot. Metodia käytetään skalaaritulon
     * vastauksessa ja vektorien tallentamisessa History-tietokantaan
     */
    public String toString() {

        String answer = this.values.toString();

        return answer;
    }

}
