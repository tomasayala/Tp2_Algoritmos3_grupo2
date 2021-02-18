package interfaceGrafica.configuradores;

import interfaceGrafica.botones.*;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import tableroDeAlgoritmos.TableroAlgoritmos;

public class ConfiguradorBotones {

    private void moverBoton(Button boton, int y, int x){
        boton.setTranslateX(x);
        boton.setTranslateY(y);
    }

    public void configuararPosicionBotones(Button arribaCLapiz, Button arribaSLapiz, Button abajoCLapiz, Button abajoSLapiz, Button derechaCLapiz, Button derechaSLapiz, Button izquierdaCLapiz, Button izquierdaSLapiz, Button botonPlay, Button repetir, Button inversion) {
        moverBoton(arribaCLapiz, 90, 820);
        moverBoton(arribaSLapiz, 64, 920);
        moverBoton(abajoCLapiz, 55, 820);
        moverBoton(abajoSLapiz, 30, 920);
        moverBoton(derechaCLapiz, -3, 815);
        moverBoton(derechaSLapiz, -30, 910);
        moverBoton(izquierdaCLapiz, 85, 815);
        moverBoton(izquierdaSLapiz, 60, 910);
        moverBoton(repetir, 30, 815);
        moverBoton(inversion, 5, 905);
        moverBoton(botonPlay, 300, 870);
    }

    public void configuararAcciones(Button arribaCLapiz, Button arribaSLapiz, Button abajoCLapiz, Button abajoSLapiz, Button derechaCLapiz, Button derechaSLapiz, Button izquierdaCLapiz, Button izquierdaSLapiz, Button botonPlay, Button repetir, Button inversion, TableroAlgoritmos tableroAlgoritmos, TextField repeticiones) {
        arribaSLapiz.setOnAction(new ClickBotonArriba(tableroAlgoritmos));
        arribaCLapiz.setOnAction(new ClickBotonArriba(tableroAlgoritmos));
        abajoSLapiz.setOnAction(new ClickBotonAbajo(tableroAlgoritmos));
        abajoCLapiz.setOnAction(new ClickBotonAbajo(tableroAlgoritmos));
        derechaCLapiz.setOnAction(new ClickBotonDerecha(tableroAlgoritmos));
        derechaSLapiz.setOnAction(new ClickBotonDerecha(tableroAlgoritmos));
        izquierdaCLapiz.setOnAction(new ClickBotonIzquierda(tableroAlgoritmos));
        izquierdaSLapiz.setOnAction(new ClickBotonIzquierda(tableroAlgoritmos));
        botonPlay.setOnAction(new ClickBotonPlay(tableroAlgoritmos));
        repetir.setOnAction(new ClickBotonRepeticion(tableroAlgoritmos, repeticiones));
        inversion.setOnAction(new ClickBotonInversion(tableroAlgoritmos));
    }
}
