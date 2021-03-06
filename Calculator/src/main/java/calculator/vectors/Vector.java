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
     * Tähän konstruktoriin annetaan vektorin arvot ArrayListillä
     *
     * @param values Vektorin arvot suoraan annettuna
     */
    public Vector(ArrayList<Double> values) {
        this.values = values;

    }

    /**
     * Konstrukoti, joka toimii käyttäjän syötteen pohjalta.
     *
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
    public double vectorLength(Vector v) {

        ScalarProduct length = new ScalarProduct(v, v);
        length.scalarProduct();
        double result = length.getScaProduct();
        double answer = Math.sqrt(result);

        return answer;
    }

    // vektorin tostring
    /**
     * Vektorin toString-metodi, jota käytetään vektorin esittämiseen oikeasa
     * muodossa.
     *
     * @return palauttaa vektorin arvot. Metodia käytetään skalaaritulon
     * vastauksessa ja vektorien tallentamisessa History-tietokantaan
     */
    public String toString() {

        String answer = this.values.toString();

        return answer;
    }

    /**
     * Metodi huolehtii tiedon palauttamisesta esitettävässä muodossa.
     *
     * @param v metodille annetaan parametrina vektori, jonka tiedot halutaan.
     * @return palauttaa näytettävän ja talletettavan String-muotoisen
     * esityksen.
     */
    public String toHistory(Vector v) {

        double length = v.vectorLength(v);
        String answer = "Length of vector " + v.toString() + " is " + length;
        return answer;
    }

}
