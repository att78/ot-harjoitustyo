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
import calculator.History;
import calculator.function1.Function;
import calculator.vectors.ScalarProduct;
import calculator.vectors.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    History history;

    @Override
    public void start(Stage window) {
        try {
            history = new History();
        } catch (Exception ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }

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
        Button scalarPro = new Button("ScalarProduct");
        Button matrixPro = new Button("MatrixProduct");
        Button history = new Button("History");
        VBox list = new VBox();
        BorderPane viewMain = new BorderPane();
        list.getChildren().add(new Label("List of operations:"));
        list.getChildren().add(function1);
        list.getChildren().add(scalarPro);
        list.getChildren().add(matrixPro);
        list.getChildren().add(history);
        viewMain.setPrefSize(400, 400);
        viewMain.setCenter(list);

        function1.setOnAction((event) -> view.setCenter(functionPage(view)));
        scalarPro.setOnAction((event) -> view.setCenter(scalarPage(view)));
        matrixPro.setOnAction((event) -> view.setCenter(matrixPage(view)));
        history.setOnAction((event) -> view.setCenter(historyPage(view)));

        return viewMain;
    }

    public BorderPane functionPage(BorderPane view) {

        BorderPane viewFunction = new BorderPane();
        Button main = new Button("Back to Main");
        Label yLabel = new Label("Give y:");
        TextField yValue = new TextField();
        yValue.setMaxWidth(200);

        yValue.textProperty().addListener(new NumberListener(yValue));

        Label xLabel = new Label("Give x:");
        TextField xValue = new TextField();
        xValue.setMaxWidth(200);
        xValue.textProperty().addListener(new NumberListener(xValue));

        Label cLabel = new Label("Give c:");
        TextField cValue = new TextField();
        cValue.setMaxWidth(200);
        cValue.textProperty().addListener(new NumberListener(cValue));

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
            history.add(answer);
        });

        functionInput.setSpacing(10);

        viewFunction.setPrefSize(400, 400);
        viewFunction.setBottom(main);
        viewFunction.setCenter(functionInput);

        main.setOnAction((event) -> view.setCenter(frontPage(view)));
        return viewFunction;
    }

    public BorderPane scalarPage(BorderPane view) {
        BorderPane scalar = new BorderPane();
        scalar.setPrefSize(400, 400);
        TextField vector1 = new TextField();
        vector1.setMaxWidth(200);
        vector1.textProperty().addListener(new VectorListener(vector1));

        TextField vector2 = new TextField();
        vector2.setMaxWidth(200);
        vector2.textProperty().addListener(new VectorListener(vector2));

        Button main = new Button("Back to Main");
        Button solve = new Button("Solve");
        Label solution = new Label();
        VBox content = new VBox();
        content.getChildren().add(new Label("Give vectors in form 1,2,3" + "\n"));
        content.getChildren().add(new Label("First Vector"));
        content.getChildren().add(vector1);
        content.getChildren().add(new Label("Second Vector"));
        content.getChildren().add(vector2);
        content.getChildren().add(solve);
        content.getChildren().add(solution);
        content.getChildren().add(main);
        scalar.setCenter(content);
        solve.setOnAction((event) -> {
            Vector vectorFirst = new Vector(vector1.getText());
            Vector vectorSecond = new Vector(vector2.getText());
            ScalarProduct sc = new ScalarProduct(vectorFirst, vectorSecond);
            sc.scalarProduct();
            String answer = sc.toString();
            solution.setText(answer);
            history.add(answer);

        });

        main.setOnAction((event) -> view.setCenter(frontPage(view)));
        return scalar;
    }

    public BorderPane matrixPage(BorderPane view) {
        BorderPane matrixPro = new BorderPane();
        Button main = new Button("Back to Main");
        VBox content = new VBox();
        content.getChildren().add(main);
        matrixPro.setCenter(content);

        main.setOnAction((event) -> view.setCenter(frontPage(view)));

        return matrixPro;
    }

    public BorderPane historyPage(BorderPane view) {
        BorderPane historyPane = new BorderPane();
        Button showHistory = new Button("Show History");
        Label hist = new Label("");
        VBox content = new VBox();
        Button main = new Button("Back to Main");
        content.getChildren().add(showHistory);
        content.getChildren().add(hist);
      
        historyPane.setCenter(content);
        historyPane.setBottom(main);

        main.setOnAction((event) -> view.setCenter(frontPage(view)));
        showHistory.setOnAction((event) -> {
            String answer = history.list().toString();
            hist.setText(answer);
        });

        return historyPane;
    }

}
