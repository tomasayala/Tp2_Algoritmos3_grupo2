package Vista.configuradores;

import Controlador.ClickBotonGuardar;
import Controlador.ClickBotonPlay;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class ConfiguradorBottomMenu {

    public void configurarHbox(HBox bottomMenu, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        Hyperlink botonEjecutarAlgoritmo = new Hyperlink();
        Hyperlink botonGuardarAlgoritmo = new Hyperlink();
        configurarBotonPlay(botonEjecutarAlgoritmo, tablero, configuradorLeftMenu);
        configurarBotonGuardar(botonGuardarAlgoritmo, tablero, configuradorLeftMenu, bottomMenu);
        bottomMenu.getChildren().addAll(botonEjecutarAlgoritmo, botonGuardarAlgoritmo);
        bottomMenu.setAlignment(Pos.CENTER_RIGHT);
    }

    private void configurarBotonPlay(Hyperlink boton, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu){
        boton.setOnAction(new ClickBotonPlay(tablero, configuradorLeftMenu));
        Image play = new Image("Vista/sprites/botonPlay.jpg");
        ImageView imageView = new ImageView(play);
        imageView.setFitWidth(100);
        imageView.setFitHeight(30);
        boton.setPrefSize(100, 30);
        boton.setGraphic(imageView);
    }

    private void configurarBotonGuardar(Hyperlink boton, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu, HBox bottomMenu){
        boton.setOnAction(new ClickBotonGuardar(tablero, bottomMenu, configuradorLeftMenu));
        Image guardar = new Image("Vista/sprites/botonGuardar.jpg");
        ImageView imageView = new ImageView(guardar);
        imageView.setFitWidth(100);
        imageView.setFitHeight(30);
        boton.setPrefSize(100, 30);
        boton.setGraphic(imageView);
    }
}
