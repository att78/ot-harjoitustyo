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
import calculator.function1.Function;
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
        BorderPane view = new BorderPane();
        BorderPane viewMain = frontPage(view);
        view.setCenter(viewMain);
        Scene scene = new Scene(view);
        window.setScene(scene);
        window.setTitle("Function Calculator");
        window.show();
    }

    public BorderPane frontPage(BorderPane view) {
        Button function1 = new Button("Simple Function");
        BorderPane viewMain = new BorderPane();
        viewMain.setPrefSize(400, 400);
        viewMain.setTop(new Label("List of available operations"));
        viewMain.setCenter(function1);
        function1.setOnAction((event) -> view.setCenter(functionPage(view)));
        return viewMain;
    }

    public BorderPane functionPage(BorderPane view) {

        BorderPane viewFunction = new BorderPane();
        Button main = new Button("Back to Main");
        Label yLabel = new Label("Give y:");
        TextField yValue = new TextField();
        yValue.setMaxWidth(200);
        Label xLabel = new Label("Give x:");
        TextField xValue = new TextField();
        xValue.setMaxWidth(200);        
        Label cLabel = new Label("Give c:");
        TextField cValue = new TextField();
        cValue.setMaxWidth(200);
        Button solve = new Button("Solve x and y");
        Label solution = new Label("");
        VBox functionInput = new VBox();
        functionInput.getChildren().add(yLabel);
        functionInput.getChildren().add(yValue);
        functionInput.getChildren().add(xLabel);
        functionInput.getChildren().add(xValue);
        functionInput.getChildren().add(cLabel);
        functionInput.getChildren().add(cValue);
        functionInput.getChildren().add(solve);
        functionInput.getChildren().add(solution);

        solve.setOnAction((event) -> {
            double givenY = Double.parseDouble(yValue.getText());
            double givenX = Double.parseDouble(xValue.getText());
            double givenC = Double.parseDouble(cValue.getText());
            Function f = new Function(givenY, givenX, givenC);
            String answer = f.toString();
            solution.setText(answer);
        });

        functionInput.setSpacing(10);

        viewFunction.setPrefSize(400, 400);
        viewFunction.setBottom(main);
        viewFunction.setCenter(functionInput);

        main.setOnAction((event) -> view.setCenter(frontPage(view)));
        return viewFunction;
    }

    public static void main(String[] args) {
        launch(UI.class);
    }

}
