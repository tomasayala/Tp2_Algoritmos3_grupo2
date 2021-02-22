package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.ArrayList;

public class ConfiguradorRightMenu {
    public void configurarVBox(VBox rightMenu) {
        ArrayList<Button> botones = new ArrayList<>();
        this.crearBotonesMenuDerecho(botones);

        rightMenu.setSpacing(10);
        rightMenu.setAlignment(Pos.TOP_CENTER);
        for (Button boton : botones) {
            rightMenu.getChildren().add(boton);
        }
    }

    private void crearBotonesMenuDerecho(ArrayList<Button> botones) {
        this.crearBotonArriba(botones);
        this.crearBotonAbajo(botones);
        this.crearBotonDerecha(botones);
        this.crearBotonIzquierda(botones);
        this.crearBotonSubirLapiz(botones);
        this.crearBotonBajarLapiz(botones);
        this.crearBotonRepetir2Veces(botones);
        this.crearBotonRepetir3Veces(botones);
        this.botonInvertirBotones(botones);
    }

    private void crearBotonArriba(ArrayList<Button> botones) {
        Button botonArriba = new Button("Arrbia");
        //botonArriba.setOnAction();
        botones.add(botonArriba);
    }

    private void crearBotonAbajo(ArrayList<Button> botones) {
        Button botonAbajo = new Button("Abajo");
        //botonAbajo.setOnAction();
        botones.add(botonAbajo);
    }

    private void crearBotonDerecha(ArrayList<Button> botones) {
        Button botonDerecha = new Button("Derecha");
        //botonDerecha.setOnAction();
        botones.add(botonDerecha);
    }

    private void crearBotonIzquierda(ArrayList<Button> botones) {
        Button botonIzquierda = new Button("Izquierda");
        //botonIzquierda.setOnAction();
        botones.add(botonIzquierda);
    }

    private void crearBotonSubirLapiz(ArrayList<Button> botones) {
        Button botonSubirLapiz = new Button("Subir Lapiz");
        //botonSubirLapiz.setOnAction();
        botones.add(botonSubirLapiz);
    }

    private void crearBotonBajarLapiz(ArrayList<Button> botones) {
        Button botonBajarLapiz = new Button("Bajar Lapiz");
        //botonBajarLapiz.setOnAction();
        botones.add(botonBajarLapiz);
    }

    private void crearBotonRepetir2Veces(ArrayList<Button> botones) {
        Button botonRepetir2veces = new Button("Repetir x 2");
        //botonRepetir2veces.setOnAction();
        botones.add(botonRepetir2veces);
    }

    private void crearBotonRepetir3Veces(ArrayList<Button> botones) {
        Button botonRepetir2veces = new Button("Repetir x 3");
        //botonRepetir2veces.setOnAction();
        botones.add(botonRepetir2veces);
    }

    private void botonInvertirBotones(ArrayList<Button> botones) {
        Button botonInvertirBloques = new Button("Invertir Bloques");
        //botonInvertirBloques.setOnAction();
        botones.add(botonInvertirBloques);
    }

}

