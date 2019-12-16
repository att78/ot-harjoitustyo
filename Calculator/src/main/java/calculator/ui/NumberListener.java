/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ui;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

/**
 * Käyttäjän antaman syötteen funktionlaskussa validointiin tarkoitettu luokka.
 *
 * @author tallbera
 */
public class NumberListener implements ChangeListener<String> {

    TextField textField;

    /**
     * Listenerin konstruktori
     * @param textField metodi saa parametrina käyttäjän tekstikenttään
     * kirjoittaman syötteen
     */
    public NumberListener(TextField textField) {
        this.textField = textField;

    }

    /**
     * Käyttäjän antaman syötteen tarkistus. Käyttää getComparison()-metodia
     * apunaan.
     *
     * @param observable String-muotoinen Observable-olio
     * @param oldValue vanha syöte
     * @param newValue uusi syöte
     */
    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue,
            String newValue) {
        if (!newValue.matches(getComparison())) {
            textField.setText(oldValue);
        }
    }

    /**
     * Tarkistetaan onko uusi syöte regexin mukainen.
     *
     * @return Stringin, joka on halutun regexin mukainen
     */
    protected String getComparison() {

        return "(-)?\\d*(\\.\\d*)?";
    }

}
