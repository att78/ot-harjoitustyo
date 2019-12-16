/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.function1;

/**
 * Luokka laskee 1. asteen funktion leikkauskohdat y- ja x- akselin suhteen.
 *
 * @author tallbera
 *
 */
public class Function {

    private double y;
    private double x;
    private double c;

    // both y and x should not be allowed to be zero
    /**
     * Konstruktori ottaa sisäänsä käyttäjän syötteen
     * @param y Käyttäjän antama syöte
     * @param x Käyttäjän antama syöte
     * @param c Käyttäjän antama syöte
     */
    public Function(double y, double x, double c) {
        this.y = y;
        this.x = x;
        this.c = c;

    }

    /**
     *
     *
     * yhtälön arvon ratkaiseminen y-akselin leikkauskohdassa
     *
     */
    public double solveXatYAxis() {

        double multiplier;

        if (y > 0) {
            multiplier = 1 / y;

        } else if (y < 0) {
            multiplier = -1 / y;
        } else {
            multiplier = 1;
        }

        double xCalc = x * multiplier;
        double cCalc = c * multiplier;

        //at Y-Axis y is zero;
        double result = cCalc / xCalc;
        return result;
    }

    /**
     * Yhtälön arvon ratkaiseminen x-akselin leikkauskohdassa
     */
    public double solveYatXAxis() {
        double multiplier;

        if (x > 0) {
            multiplier = 1 / x;

        } else if (x < 0) {
            multiplier = -1 / x;
        } else {
            multiplier = 1;
        }

        double yCalc = y * multiplier;
        double cCalc = c * multiplier;

        double result = cCalc / yCalc;
        return result;
    }

    /**
     * Yhtälön toString-metodi antaa vastauksen käyttäjän antamilla arvoilla. Vastaus näytetään tässä muodossa.
     * @return palauttaa käyttäjälle functionpage:ssa vastauksena näytettävän
     * tuloksen
     */
    public String toString() {

        double solve1 = solveXatYAxis();
        double solve2 = solveYatXAxis();

        String answer = "At Y-axis x-value is " + solve1 + " and at X-axis y-value is " + solve2;

        return answer;
    }

    /**
     * Tietokantaan tallennattavan tiedon muodostaa tämä metodi
     * @return palauttaa History-tietokantataan talletettavat tiedot
     */
    public String toHistory() {

        String history = "Y value is " + y + " X value is " + x + " and C value is " + c;
        String answer = toString();
        String total = history + "\n" + answer + "\n";

        return total;
    }

}
