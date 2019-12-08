/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.function1;

/**
 *
 * @author tallbera
 */
public class Function {

    double y;
    double x;
    double c;

    // both y and x should not be allowed to be zero
    public Function(double y, double x, double c) {
        this.y = y;
        this.x = x;
        this.c = c;

    }

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

    public String toString() {

        double solve1 = solveXatYAxis();
        double solve2 = solveYatXAxis();

        String answer = "At Y-axis x-value is " + solve1 + " and at X-axis y-value is " + solve2;

        return answer;
    }

}
