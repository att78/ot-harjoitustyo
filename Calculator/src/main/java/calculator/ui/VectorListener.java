/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ui;

import javafx.scene.control.TextField;

/**
 *
 * @author tallbera
 */
public class VectorListener extends NumberListener {

    public VectorListener(TextField textField) {
        super(textField);
    }
    
    @Override
    protected String getComparison(){
      
        return "(\\d*(\\.\\d*)?(\\,)?)*";
    }
    
    
    
    
}
