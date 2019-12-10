/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ui;

import javafx.scene.control.TextField;

/**
 * Käyttäjän antaman syötteen validointi skalaaritulossa. Yläluokka on
 * NumberListener
 *
 * @author tallbera
 */
public class VectorListener extends NumberListener {

    /**
     *Valvoo käyttäjän kirjaamaa syötettä
     * @param textField Käyttäjän kirjaama syöte
     */
    public VectorListener(TextField textField) {
        super(textField);
    }

    /**
     *
     * @return palauttaa vektori-muotoisuutta jäjilttelevän regexin
     */
    @Override
    protected String getComparison() {

        return "((-)?(\\d{1,}\\.{0,1}\\d*)?,?)*";
    }

}
