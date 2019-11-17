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

    String name;
    double y;
    double x;
    double c;
    double resultY;
    double resultX;

    public Function(double y, double x, double c) {
        this.y = y;
        this.x = x;
        this.c = c;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        resultX=result;
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
        
        double yCalc=y*multiplier;
        double cCalc= c*multiplier;
        
        double result= cCalc/yCalc;
        resultY=result;
        return result;
    }
    
    public String toString(){
        
        double solve1= solveXatYAxis();
        double solve2= solveYatXAxis();
        
        String answer= "at Y-axis x-value is "+resultX+" and at X-axis y-value is "+resultY;
        
        return answer;
    }
    

}