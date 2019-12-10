/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import calculator.ui.UI;

/**
 * CalculatorApplication on koko sovelluksen käynnistävä luokka
 *
 * @author tallbera
 */
public class CalculatorApplication {

    /**
     * Sovellus käynnistyy main metodin alla olevalla kutsulla
     * UI.launch(UI.class)
     *
     * @param args
     */
    public static void main(String[] args) {

        UI.launch(UI.class);

    }

}
