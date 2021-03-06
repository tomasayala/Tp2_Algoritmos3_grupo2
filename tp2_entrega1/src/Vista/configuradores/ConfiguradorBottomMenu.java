package Vista.configuradores;

import Controlador.ClickBotonGuardar;
import Controlador.ClickBotonPlay;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class ConfiguradorBottomMenu {

    public void configurarHbox(HBox bottomMenu, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        Button botonEjecutarAlgoritmo = new Button("    PLAY    ");
        Button botonGuardarAlgoritmo = new Button("     SAVE    ");
        configurarBotonPlay(botonEjecutarAlgoritmo, tablero, configuradorLeftMenu);
        configurarBotonGuardar(botonGuardarAlgoritmo, tablero, configuradorLeftMenu, bottomMenu);
        bottomMenu.getChildren().addAll(botonEjecutarAlgoritmo, botonGuardarAlgoritmo);
        bottomMenu.setAlignment(Pos.CENTER_RIGHT);
    }

    private void configurarBotonPlay(Button boton, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu){
        boton.setOnAction(new ClickBotonPlay(tablero, configuradorLeftMenu));
        Image lista = new Image("Vista/sprites/botonPlay.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(lista, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(200, 50, false, false, false, false));
        Background fondo = new Background(backgroundImage);
        boton.setBackground(fondo);
    }

    private void configurarBotonGuardar(Button boton, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu, HBox bottomMenu){
        boton.setOnAction(new ClickBotonGuardar(tablero, bottomMenu, configuradorLeftMenu));
        boton.setTextFill(Color.DARKBLUE);
        Image lista = new Image("Vista/sprites/botonGuardar.jpg");
        BackgroundImage backgroundImage = new BackgroundImage(lista, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(170, 50, false, false, false, false));
        Background fondo = new Background(backgroundImage);
        boton.setBackground(fondo);
    }
}
