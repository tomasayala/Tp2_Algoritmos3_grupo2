package sample;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Hello World");

        VBox layout = new VBox();
        Button boton = new Button();
        Button boton2 = new Button();
        boton.setText("Prueba 1");
        boton2.setText("Prueba 2");
        // Esta clase implemneta el handler, action event. Dentro de esta clase se ve que se hace
        boton2.setOnAction(new ClickBoton());
        boton.setOnAction(e -> System.out.println("Estas usando un lambda"));
        layout.getChildren().addAll(boton, boton2);

        window.setScene(new Scene(layout, 300, 275));
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    // Mostrar los bloques, hay que mostrar el tablero y el personaje
}
