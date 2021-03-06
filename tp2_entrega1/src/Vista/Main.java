package Vista;


import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import Vista.configuradores.*;
import Vista.sprites.Character;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage window) throws Exception{
        TableroAlgoritmos tablero = new TableroAlgoritmos();
        window.setTitle("AlgoBlocks");


        Insets margen = new Insets(10,10,10,10);
        HBox topMenu = new HBox();
        ConfiguradorTopMenu configuradorTopMenu = new ConfiguradorTopMenu();
        configuradorTopMenu.configurarHbox(topMenu, margen);

        ListView< String> leftMenu = new ListView<>();
        ConfiguradorLeftMenu configuradorLeftMenu = new ConfiguradorLeftMenu();
        configuradorLeftMenu.configurarListView(leftMenu, tablero);

        GridPane mapa = new GridPane();
        ConfiguradorMapa configuradorMapa = new ConfiguradorMapa();
        configuradorMapa.configurarGridPane(mapa);
        mapa.setMinSize(20, 20);

        Image imagen = new Image("Vista/sprites/fondo.jpg");
        BackgroundImage image = new BackgroundImage(imagen, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(1000, 600, false, false, false, false));
        Background background = new Background(image);

        VBox rightMenu = new VBox();
        ConfiguradorRightMenu configuradorRightMenu= new ConfiguradorRightMenu();
        configuradorRightMenu.configurarVBox(rightMenu, tablero, configuradorLeftMenu, mapa);

        HBox bottomMenu = new HBox(5);
        ConfiguradorBottomMenu configuradorBottomMenu = new ConfiguradorBottomMenu();
        configuradorBottomMenu.configurarHbox( bottomMenu, tablero, configuradorLeftMenu);

        Character lapiz = new Character(mapa);
        tablero.setCharacter(lapiz);
        tablero.setGrid(mapa);

        BorderPane layout = new BorderPane();
        layout.setBackground(background);
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
        layout.setLeft(leftMenu);
        layout.setCenter(mapa);
    }

    public static void main(String[] args) {
        launch(args);
    }
    // Mostrar los bloques, hay que mostrar el tablero y el personaje
}
