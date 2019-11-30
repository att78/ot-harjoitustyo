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
 *
 * @author tallbera
 */
public class NumberListener implements ChangeListener<String> {

    TextField textField;

    public NumberListener(TextField textField) {
        this.textField = textField;

    }

    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue,
            String newValue) {
        if (!newValue.matches(getComparison())) {
            textField.setText(oldValue);
        }
    }
    
    protected String getComparison(){
      
        return "\\d*(\\.\\d*)?";
    }
    
    

}
