package sample;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Hello World");
/*
        VBox layout = new VBox();
        Button boton = new Button();
        Button boton2 = new Button();
        boton.setText("Prueba 1");
        boton2.setText("Prueba 2");
        // Esta clase implemneta el handler, action event. Dentro de esta clase se ve que se hace
        boton2.setOnAction(new ClickBoton());
        boton.setOnAction(e -> System.out.println("Estas usando un lambda"));
        layout.getChildren().addAll(boton, boton2);
*/
        Insets margen = new Insets(10,10,10,10);
        HBox topMenu = new HBox();
        ConfiguradorTopMenu configuradorTopMenu = new ConfiguradorTopMenu();
        configuradorTopMenu.configurarHbox(topMenu, margen);

        VBox rightMenu = new VBox();
        ConfiguradorRightMenu configuradorRightMenu= new ConfiguradorRightMenu();
        configuradorRightMenu.configurarVBox(rightMenu);


        HBox bottomMenu = new HBox(5);
        ConfiguradorBottomMenu configuradorBottomMenu = new ConfiguradorBottomMenu();
        configuradorBottomMenu.configurarHbox( bottomMenu);

        ListView< String> leftMenu = new ListView<>();
        ConfiguradorLeftMenu configuradorLeftMenu = new ConfiguradorLeftMenu();
        configuradorLeftMenu.configurarListView(leftMenu);

        GridPane mapa = new GridPane();
        ConfiguradorMapa configuradorMapa = new ConfiguradorMapa();
        configuradorMapa.configurarGridPane(mapa);

        BorderPane layout = new BorderPane();
        this.settearLayout(layout, topMenu, rightMenu, bottomMenu, mapa, leftMenu , margen);

        window.setScene(new Scene(layout, 1000, 600));
        window.show();
    }


    private void settearLayout(BorderPane layout, HBox topMenu, VBox rightMenu, HBox bottomMenu, GridPane mapa, ListView<String> leftMenu, Insets margen) {
        BorderPane.setAlignment(topMenu, Pos.TOP_CENTER);
        BorderPane.setMargin(topMenu, margen);
        BorderPane.setAlignment(rightMenu, Pos.CENTER);
        BorderPane.setMargin(rightMenu, margen);
        BorderPane.setAlignment( bottomMenu, Pos.TOP_LEFT);
        BorderPane.setMargin(bottomMenu, margen);
        BorderPane.setAlignment(mapa, Pos.CENTER);
        BorderPane.setMargin(mapa, margen);
        BorderPane.setAlignment(leftMenu, Pos.CENTER);
        BorderPane.setMargin(leftMenu, margen);
        layout.setTop(topMenu);
        layout.setRight(rightMenu);
        layout.setBottom( bottomMenu);
        layout.setCenter(mapa);
        layout.setLeft(leftMenu);
    }

    public static void main(String[] args) {
        launch(args);
    }
    // Mostrar los bloques, hay que mostrar el tablero y el personaje
}
