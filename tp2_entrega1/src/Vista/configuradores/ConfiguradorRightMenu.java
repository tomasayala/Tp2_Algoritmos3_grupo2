package Vista.configuradores;

import Controlador.*;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

import java.awt.*;
import java.util.ArrayList;

public class ConfiguradorRightMenu {
    private Image image = new Image("Vista/sprites/boton.png");
    int numero = 6;
    public void configurarVBox(VBox rightMenu, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu, GridPane grid) {
        ArrayList<Button> botones = new ArrayList<>();
        this.crearBotonesMenuDerecho(botones, tablero, rightMenu, configuradorLeftMenu, grid);

        rightMenu.setSpacing(10);
        for (Button boton : botones) {
            rightMenu.getChildren().add(boton);
        }
    }

    private void crearBotonesMenuDerecho(ArrayList<Button> botones, TableroAlgoritmos tablero, VBox rightMenu, ConfiguradorLeftMenu configuradorLeftMenu, GridPane grid) {
        this.crearBotonArriba(botones, tablero, configuradorLeftMenu);
        this.crearBotonAbajo(botones, tablero, configuradorLeftMenu);
        this.crearBotonDerecha(botones, tablero, configuradorLeftMenu);
        this.crearBotonIzquierda(botones, tablero, configuradorLeftMenu);
        this.crearBotonSubirLapiz(botones, tablero, configuradorLeftMenu);
        this.crearBotonBajarLapiz(botones, tablero, configuradorLeftMenu, grid);
        this.crearBotonClose(botones, tablero, rightMenu);
        this.crearBotonRepetir2Veces(botones, tablero, numero, rightMenu, configuradorLeftMenu);
        this.crearBotonRepetir3Veces(botones, tablero, numero, rightMenu, configuradorLeftMenu);
        this.botonInvertirBotones(botones, tablero, numero, rightMenu, configuradorLeftMenu);
    }

    private void crearBotonArriba(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(50, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button botonArriba = new Button("Arriba");
        botonArriba.setBackground(background);
        botonArriba.setOnAction(new ClickBotonArriba(tablero, configuradorLeftMenu));
        botones.add(botonArriba);
    }

    private void crearBotonAbajo(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(50, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button botonAbajo = new Button("Abajo");
        botonAbajo.setBackground(background);
        botonAbajo.setOnAction(new ClickBotonAbajo(tablero, configuradorLeftMenu));
        botones.add(botonAbajo);
    }

    private void crearBotonDerecha(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(60, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button botonDerecha = new Button("Derecha");
        botonDerecha.setBackground(background);
        botonDerecha.setOnAction(new ClickBotonDerecha(tablero, configuradorLeftMenu));
        botones.add(botonDerecha);
    }

    private void crearBotonIzquierda(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(70, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button botonIzquierda = new Button("Izquierda");
        botonIzquierda.setBackground(background);
        botonIzquierda.setOnAction(new ClickBotonIzquierda(tablero, configuradorLeftMenu));
        botones.add(botonIzquierda);
    }

    private void crearBotonSubirLapiz(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(80, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button botonSubirLapiz = new Button("Subir Lapiz");
        botonSubirLapiz.setBackground(background);
        botonSubirLapiz.setOnAction(new ClickSubirLapiz(tablero, configuradorLeftMenu));
        botones.add(botonSubirLapiz);
    }

    private void crearBotonBajarLapiz(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu, GridPane grid) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(80, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button botonBajarLapiz = new Button("Bajar Lapiz");
        botonBajarLapiz.setBackground(background);
        botonBajarLapiz.setOnAction(new ClickBajarLapiz(tablero, configuradorLeftMenu, grid));
        botones.add(botonBajarLapiz);
    }

    private void crearBotonRepetir2Veces(ArrayList<Button> botones, TableroAlgoritmos tablero, int numero, VBox rightMenu, ConfiguradorLeftMenu configuradorLeftMenu) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(80, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button botonRepetir2veces = new Button("Repetir x 2");
        botonRepetir2veces.setBackground(background);
        botonRepetir2veces.setOnAction(new ClickBotonRepeticion(tablero, 2, numero, rightMenu, configuradorLeftMenu));
        botones.add(botonRepetir2veces);
    }

    private void crearBotonRepetir3Veces(ArrayList<Button> botones, TableroAlgoritmos tablero, int numero, VBox rightMenu, ConfiguradorLeftMenu configuradorLeftMenu) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(80, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button botonRepetir3veces = new Button("Repetir x 3");
        botonRepetir3veces.setBackground(background);
        botonRepetir3veces.setOnAction(new ClickBotonRepeticion(tablero, 3, numero, rightMenu, configuradorLeftMenu));
        botones.add(botonRepetir3veces);
    }

    private void botonInvertirBotones(ArrayList<Button> botones, TableroAlgoritmos tablero, int numero, VBox rightMenu, ConfiguradorLeftMenu configuradorLeftMenu) {
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(100, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button botonInvertirBloques = new Button("Invertir Bloques");
        botonInvertirBloques.setBackground(background);
        botonInvertirBloques.setOnAction(new ClickBotonInversion(tablero, numero, rightMenu, configuradorLeftMenu));
        botones.add(botonInvertirBloques);
    }

    private void crearBotonClose(ArrayList<Button> botones, TableroAlgoritmos tablero, VBox rightMenu){
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER ,new BackgroundSize(40, 20, false, false, false, false));
        Background background = new Background(backgroundImage);
        Button close = new Button("Close");
        close.setBackground(background);
        botones.add(close);
        close.setOnAction(new ClickBotonClose(tablero, rightMenu, botones.indexOf(close)));
        botones.get(botones.indexOf(close)).setVisible(false);
        numero = botones.indexOf(close);
    }

}

