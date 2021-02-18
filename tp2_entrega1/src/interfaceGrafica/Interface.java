package interfaceGrafica;

import interfaceGrafica.botones.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import tableroDeAlgoritmos.TableroAlgoritmos;

public class  Interface extends Application {

    private void moverBoton(Button boton, int y, int x){
         boton.setTranslateX(x);
         boton.setTranslateY(y);
    }

    @Override
    public void start(Stage window) throws Exception{
        TableroAlgoritmos tableroAlgoritmos = new TableroAlgoritmos();
        //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Hello World");

        VBox layout = new VBox();
        Button arribaCLapiz = new Button("Arriba");
        Button arribaSLapiz = new Button("Arriba");
        Button abajoCLapiz = new Button("Abajo");
        Button abajoSLapiz = new Button("Abajo");
        Button derechaSLapiz = new Button("Derecha");
        Button derechaCLapiz = new Button("Derecha");
        Button izquierdaSLapiz = new Button("Izquierda");
        Button izquierdaCLapiz = new Button("Izquierda");
        Button botonPlay = new Button("Play");
        Button repetir = new Button("Loop");
        Button inversion = new Button("Inversion");
        TextField repeticiones = new TextField(" ");

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
        repeticiones.setTranslateX(860);
        repeticiones.setTranslateY(55);
        repeticiones.setMaxWidth(20);

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

        layout.getChildren().addAll(arribaCLapiz, arribaSLapiz, botonPlay, abajoCLapiz, abajoSLapiz, izquierdaCLapiz, izquierdaSLapiz, derechaCLapiz, derechaSLapiz, repeticiones, repetir, inversion);

        window.setScene(new Scene(layout, 1000, 850));
        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    // Mostrar los bloques, hay que mostrar el tablero y el personaje
}