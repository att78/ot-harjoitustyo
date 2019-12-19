/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.ui;

/**
 * Graafisen käyttöliittymän rakentava luokka
 *
 * @author tallbera
 */
import calculator.History;
import calculator.function1.Function;
import calculator.matrix.Matrix;
import calculator.matrix.MatrixProduct;
import calculator.vectors.ScalarProduct;
import calculator.vectors.Vector;
import java.util.ArrayList;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UI extends Application {
    
    History history;

    /**
     * Graafisen käyttöliittymän käynnistävä metodi
     *
     * @param window on Stage tyypin-olio joka toimii sovelluksen elementtien
     * kontrolloijana
     */
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

    /**
     * Etusivun rakentava ja muihin osiin linkittävä metodi
     *
     * @param view BorderPane-olio, joka annetaan metodille parametriksi
     * @return Palauttaa etusivun rakentavan BorderPane-olion.
     */
    public BorderPane frontPage(BorderPane view) {
        Button function1 = new Button("Simple Function");
        function1.setPrefWidth(175);
        Button scalarPro = new Button("ScalarProduct");
        scalarPro.setPrefWidth(175);
        Button matrixPro = new Button("MatrixProduct");
        matrixPro.setPrefWidth(175);
        Button history = new Button("History");
        history.setPrefWidth(175);
        Button vectorLength = new Button("VectorLength");
        vectorLength.setPrefWidth(175);
        VBox list = new VBox();
        BorderPane viewMain = new BorderPane();
        list.getChildren().add(new Label("List of operations:"));
        list.getChildren().add(function1);
        list.getChildren().add(scalarPro);
        list.getChildren().add(vectorLength);
        list.getChildren().add(matrixPro);
        list.getChildren().add(history);
        list.setSpacing(5);
        viewMain.setPrefSize(400, 400);
        viewMain.setCenter(list);
        
        function1.setOnAction((event) -> view.setCenter(functionPage(view)));
        scalarPro.setOnAction((event) -> view.setCenter(scalarPage(view)));
        matrixPro.setOnAction((event) -> view.setCenter(matrixPage(view)));
        history.setOnAction((event) -> view.setCenter(historyPage(view)));
        vectorLength.setOnAction((event) -> view.setCenter(vectorPage(view)));
        
        return viewMain;
    }

    /**
     * metodi huolehtii funktio-sivusta
     *
     * @param view metodille parametrina annettava BorderPane-olio
     * @return palauttaa funktionlaskentasivun rakentavan BorderPane-olion
     */
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
        functionInput.setSpacing(5);
        
        solve.setOnAction((event) -> {
            if (yValue.getText().equals("") || yValue.getText().equals(".")) {
                solution.setText("Y-value was not properly given");
            } else if (xValue.getText().equals("") || xValue.getText().equals(".")) {
                solution.setText("X-value was not properly given");
            } else if (cValue.getText().equals("") || cValue.getText().equals(".")) {
                solution.setText("C-value was not properly given");
            } else {
                
                double givenY = Double.parseDouble(yValue.getText());
                double givenX = Double.parseDouble(xValue.getText());
                double givenC = Double.parseDouble(cValue.getText());
                Function f = new Function(givenY, givenX, givenC);
                String answer = f.toString();
                solution.setText(answer);
                String toHistory = f.toHistory();
                history.add(toHistory);
            }
        });
        
        functionInput.setSpacing(10);
        
        viewFunction.setPrefSize(400, 400);
        viewFunction.setBottom(main);
        viewFunction.setCenter(functionInput);
        
        main.setOnAction((event) -> view.setCenter(frontPage(view)));
        return viewFunction;
    }

    /**
     * metodi huolehtii skalaaritulon rakentavasta sivusta
     *
     * @param view metodin sisäänottama BorderPane-olio
     * @return palauttaa skalaaritulolle tarkoitetun BorderPane-olion
     */
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
        content.setSpacing(5);
        scalar.setCenter(content);
        solve.setOnAction((event) -> {
            try {
                Vector vectorFirst = new Vector(vector1.getText());
                Vector vectorSecond = new Vector(vector2.getText());
                ScalarProduct sc = new ScalarProduct(vectorFirst, vectorSecond);
                sc.scalarProduct();
                String answer = sc.toString();
                solution.setText(answer);
                history.add(answer);
            } catch (Exception e) {
                solution.setText("Wrong input");
            }
            
        });
        
        main.setOnAction((event) -> view.setCenter(frontPage(view)));
        return scalar;
    }

    /**
     * matriisitulon UIssa käsittelevä metodi
     *
     * @param view metodin sisäänottama BorderPane-olio
     * @return palautta matriisitulo-näkymän rakentavan BorderPane-olion
     */
    public BorderPane matrixPage(BorderPane view) {
        
        ArrayList<Vector> rowVectors = new ArrayList();
        ArrayList<Vector> columnVectors = new ArrayList();
        
        BorderPane matrixPro = new BorderPane();
        Label info = new Label("Matrixes are given as vectors");
        Label firstMatrix = new Label("Rows for first Matrix");
        Label secondMatrix = new Label("          Columns for second Matrix");
        TextField vector1 = new TextField();
        vector1.setMaxWidth(175);
        vector1.textProperty().addListener(new VectorListener(vector1));
        
        TextField vector2 = new TextField();
        vector2.setMaxWidth(175);
        vector2.textProperty().addListener(new VectorListener(vector2));
        
        Button main = new Button("Back to Main");
        VBox content = new VBox();
        HBox inputLabels = new HBox();
        HBox inputText = new HBox();
        inputLabels.getChildren().add(firstMatrix);
        inputLabels.getChildren().add(new Label("  "));
        inputLabels.getChildren().add(secondMatrix);
        inputText.getChildren().add(vector1);
        inputText.getChildren().add(new Label("  "));
        inputText.getChildren().add(vector2);
        HBox addVectors = new HBox();
        Button addNew = new Button("Add another rowvector");
        Button addNew2 = new Button("Add another columnvector");
        addVectors.getChildren().add(addNew);
        addVectors.getChildren().add(new Label("  "));
        addVectors.getChildren().add(addNew2);
        
        Label inputLeft = new Label("");
        Label inputRight = new Label("");
        HBox inputs = new HBox();
        inputs.getChildren().add(inputLeft);
        inputs.getChildren().add(new Label("                                    "));
        inputs.getChildren().add(inputRight);
        Button result = new Button("Calculate matrixproduct");
        Label showResult = new Label("");
        
        content.getChildren().add(info);
        content.getChildren().add(inputLabels);
        content.getChildren().add(inputText);
        content.getChildren().add(addVectors);
        content.getChildren().add(inputs);
        content.getChildren().add(result);
        content.getChildren().add(showResult);
        content.setSpacing(5);
        matrixPro.setCenter(content);
        matrixPro.setBottom(main);
        
        main.setOnAction((event) -> view.setCenter(frontPage(view)));
        addNew.setOnAction((event) -> {
            try {
                Vector v = new Vector(vector1.getText());
                rowVectors.add(v);
                Matrix m = new Matrix(rowVectors);
                String input = m.toString();
                inputLeft.setText(input);
            } catch (Exception e) {
                inputLeft.setText("Input failed");
            }
            
        });
        addNew2.setOnAction((event) -> {
            try {
                Vector v = new Vector(vector2.getText());
                columnVectors.add(v);
                Matrix m = new Matrix(columnVectors);
                String input = m.toString();
                inputRight.setText(input);
            } catch (Exception e) {
                inputRight.setText("Input failed");
            }
            
        });
        result.setOnAction((event) -> {
            try {
                Matrix rows = new Matrix(rowVectors);
                Matrix columns = new Matrix(columnVectors);
                MatrixProduct mp = new MatrixProduct(rows, columns);
                ArrayList<Vector> calculated = mp.calculateMatrixProduct();
                Matrix endResult = new Matrix(calculated);
                String answer = endResult.toString();
                history.add(answer);
                showResult.setText(answer);
                
                rowVectors.clear();
                columnVectors.clear();
            } catch (Exception e) {
                showResult.setText("MatrixProduct could not be calculated");
            }
            
        });
        
        return matrixPro;
    }

    /**
     * Metodi hakee tietokannasta historiatiedot history-olion avulla ja näyttää
     * tiedot.
     *
     * @param view metodin sisäänottama BorderPane-olio
     * @return palauttaa historiikin
     */
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
            
            String answer = "";
            for (int i = 0; i < history.list().size(); i++) {
                answer += history.list().get(i) + "\n";
            }
            
            hist.setText(answer);
            
        });
        
        return historyPane;
    }
    
    public BorderPane vectorPage(BorderPane view) {
        BorderPane lengthPane = new BorderPane();
        lengthPane.setPrefSize(400, 400);
        TextField vector1 = new TextField();
        vector1.setMaxWidth(200);
        vector1.textProperty().addListener(new VectorListener(vector1));
        Button result = new Button("Vector length");
        Label solution = new Label("");
        VBox content = new VBox();
        content.getChildren().add(new Label("Give vector in form 1,2,3" + "\n"));
        content.getChildren().add(vector1);
        content.getChildren().add(result);
        content.getChildren().add(solution);
        
        result.setOnAction((event) -> {
            try {
                Vector vectorFirst = new Vector(vector1.getText());
                ScalarProduct sc = new ScalarProduct(vectorFirst, vectorFirst);
                sc.scalarProduct();
                String answer = vectorFirst.toHistory(vectorFirst);
                solution.setText(answer);
                history.add(answer);
            } catch (Exception e) {
                solution.setText("VectorLength could not be calculated.");
                
            }
            
        });
        
        Button main = new Button("Back to Main");
        main.setOnAction((event) -> view.setCenter(frontPage(view)));
        
        lengthPane.setCenter(content);
        lengthPane.setBottom(main);
        
        return lengthPane;
        
    }
    
}
