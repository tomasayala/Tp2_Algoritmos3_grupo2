package Vista.configuradores;

import Controlador.*;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.*;

import java.util.ArrayList;

public class ConfiguradorRightMenu {
    private Image lista = new Image("Vista/sprites/boton.png");
    private BackgroundImage backgroundImage = new BackgroundImage(lista, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT);
    private Background fondo = new Background(backgroundImage);
    int numero = 6;
    public void configurarVBox(VBox rightMenu, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu, GridPane grid) {
        ArrayList<Button> botones = new ArrayList<>();
        this.crearBotonesMenuDerecho(botones, tablero, rightMenu, configuradorLeftMenu, grid);

        rightMenu.setSpacing(10);
        rightMenu.setAlignment(Pos.TOP_CENTER);
        for (Button boton : botones) {
            boton.setBackground(fondo);
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
        Button botonArriba = new Button("Arriba");
        botonArriba.setOnAction(new ClickBotonArriba(tablero, configuradorLeftMenu));
        botones.add(botonArriba);
    }

    private void crearBotonAbajo(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        Button botonAbajo = new Button("Abajo");
        botonAbajo.setOnAction(new ClickBotonAbajo(tablero, configuradorLeftMenu));
        botones.add(botonAbajo);
    }

    private void crearBotonDerecha(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        Button botonDerecha = new Button("Derecha");
        botonDerecha.setOnAction(new ClickBotonDerecha(tablero, configuradorLeftMenu));
        botones.add(botonDerecha);
    }

    private void crearBotonIzquierda(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        Button botonIzquierda = new Button("Izquierda");
        botonIzquierda.setOnAction(new ClickBotonIzquierda(tablero, configuradorLeftMenu));
        botones.add(botonIzquierda);
    }

    private void crearBotonSubirLapiz(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu) {
        Button botonSubirLapiz = new Button("Subir Lapiz");
        botonSubirLapiz.setOnAction(new ClickSubirLapiz(tablero, configuradorLeftMenu));
        botones.add(botonSubirLapiz);
    }

    private void crearBotonBajarLapiz(ArrayList<Button> botones, TableroAlgoritmos tablero, ConfiguradorLeftMenu configuradorLeftMenu, GridPane grid) {
        Button botonBajarLapiz = new Button("Bajar Lapiz");
        botonBajarLapiz.setOnAction(new ClickBajarLapiz(tablero, configuradorLeftMenu, grid));
        botones.add(botonBajarLapiz);
    }

    private void crearBotonRepetir2Veces(ArrayList<Button> botones, TableroAlgoritmos tablero, int numero, VBox rightMenu, ConfiguradorLeftMenu configuradorLeftMenu) {
        Button botonRepetir2veces = new Button("Repetir x 2");
        botonRepetir2veces.setOnAction(new ClickBotonRepeticion(tablero, 2, numero, rightMenu, configuradorLeftMenu));
        botones.add(botonRepetir2veces);
    }

    private void crearBotonRepetir3Veces(ArrayList<Button> botones, TableroAlgoritmos tablero, int numero, VBox rightMenu, ConfiguradorLeftMenu configuradorLeftMenu) {
        Button botonRepetir2veces = new Button("Repetir x 3");
        botonRepetir2veces.setOnAction(new ClickBotonRepeticion(tablero, 3, numero, rightMenu, configuradorLeftMenu));
        botones.add(botonRepetir2veces);
    }

    private void botonInvertirBotones(ArrayList<Button> botones, TableroAlgoritmos tablero, int numero, VBox rightMenu, ConfiguradorLeftMenu configuradorLeftMenu) {
        Button botonInvertirBloques = new Button("Invertir Bloques");
        botonInvertirBloques.setOnAction(new ClickBotonInversion(tablero, numero, rightMenu, configuradorLeftMenu));
        botones.add(botonInvertirBloques);
    }

    private void crearBotonClose(ArrayList<Button> botones, TableroAlgoritmos tablero, VBox rightMenu){
        Button close = new Button("Close");
        botones.add(close);
        close.setOnAction(new ClickBotonClose(tablero, rightMenu, botones.indexOf(close)));
        botones.get(botones.indexOf(close)).setVisible(false);
        numero = botones.indexOf(close);
    }

}

