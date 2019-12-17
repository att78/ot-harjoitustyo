/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.vectors;

/**
 * Luokka laskee kahden vektorin skalaaritulon
 *
 * @author tallbera
 */
public class ScalarProduct {

    private double scaProduct;
    private Vector a;
    private Vector b;

    //vector size must be checked either before constructor or in constructor
    /**
     * Muodostaa skalaaritulon kahdesta käyttäjän antamasta vektorista
     *
     * @param a Käyttäjän antama vektori
     * @param b Käyttäjän antama vektori
     */
    public ScalarProduct(Vector a, Vector b) {
        if (a.getValues().size() == b.getValues().size()) {
            this.a = a;
            this.b = b;
        }
    }

    /**
     * laskee skalaaritulon
     */
    public void scalarProduct() {

        for (int i = 0; i < a.getValues().size(); i++) {
            scaProduct += (a.getValues().get(i) * b.getValues().get(i));

        }
    }

    /**
     * palauttaa lasketun skalaaritulon
     *
     * @return palauttaa skalaaritulon
     */
    public double getScaProduct() {
        return scaProduct;
    }

    public Vector getA() {
        return a;
    }

    public Vector getB() {
        return b;
    }

    /**
     * Palauttaa näytettävän vastauksen
     *
     * @return palauttaa näytettävän vastauksen
     */
    public String toString() {
        String answer = "ScalarProduct of " + this.a.toString() + " and " + this.b.toString() + " is " + scaProduct;
        return answer;
    }

}
