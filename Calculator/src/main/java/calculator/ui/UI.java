/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ui;

/**
 *
 * @author tallbera
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UI extends Application {

    @Override
    public void start(Stage window) {

        Button function1 = new Button("Simple Function");
        VBox list = new VBox();
        list.setSpacing(10);
        list.getChildren().add(function1);

        BorderPane viewMain = new BorderPane();
        viewMain.setPrefSize(400, 400);
        viewMain.setTop(new Label("List of available operations"));
        viewMain.setCenter(function1);
        //viewMain.setLeft(list);

        BorderPane viewFunction = new BorderPane();
        Button main = new Button("Back to Main");
        Label yLabel =new Label("Give y:");
        TextField yValue = new TextField();
        yValue.setMaxWidth(200);
        Label xLabel = new Label("Give x:");
        TextField xValue = new TextField();
        xValue.setMaxWidth(200);
        Label cLabel = new Label("Give c:");
        TextField cValue = new TextField();
        cValue.setMaxWidth(200);
        VBox functionInput = new VBox();
        
        functionInput.getChildren().add(yLabel);
        functionInput.getChildren().add(yValue);
        functionInput.getChildren().add(xLabel);
        functionInput.getChildren().add(xValue);
        functionInput.getChildren().add(cLabel);
        functionInput.getChildren().add(cValue);
        functionInput.setSpacing(10);
        

        viewFunction.setPrefSize(400, 400);
        viewFunction.setBottom(main);
        viewFunction.setCenter(functionInput);
        
        BorderPane view =new BorderPane();
        
        function1.setOnAction((event) -> view.setCenter(viewFunction));
        main.setOnAction((event) -> view.setCenter(viewMain));
        
        view.setCenter(viewMain);
        
        
        Scene scene = new Scene(view);

        window.setScene(scene);
        window.setTitle("Function Calculator");
        window.show();
    }

    public static void main(String[] args) {
        launch(UI.class);
    }

}
