package interfaceGrafica.configuradores;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ConfiguradorInterface {
    ConfiguradorBotones configuradorbotones;
    ConfiguradorTextField configuradorTextField;
    ConfiguradorLabels configuradorLabels;
    public ConfiguradorInterface(){
        this.configuradorbotones = new ConfiguradorBotones();
        this.configuradorTextField = new ConfiguradorTextField();
        this.configuradorLabels = new ConfiguradorLabels();
    }
    public void configurarVbox(VBox layout, TableroAlgoritmos tableroAlgoritmos){
        TextField repeticiones = new TextField(" ");
        configuradorTextField.configurarPosiciones(repeticiones);

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
        Button ok = new Button("ok");
        Label dibujo = new Label("Movimiento\n con dibujo");
        Label movimiento = new Label("Movimiento\n sin dibujo");

        configuradorbotones.configuararPosicionBotones(arribaCLapiz, arribaSLapiz, abajoCLapiz, abajoSLapiz, derechaCLapiz, derechaSLapiz, izquierdaCLapiz, izquierdaSLapiz, botonPlay, repetir, inversion, ok);
        configuradorbotones.configuararAcciones(arribaCLapiz, arribaSLapiz, abajoCLapiz, abajoSLapiz, derechaCLapiz, derechaSLapiz, izquierdaCLapiz, izquierdaSLapiz, botonPlay, repetir, inversion, tableroAlgoritmos, repeticiones, ok);
        configuradorLabels.configurarPosiciones(dibujo, movimiento);

        layout.getChildren().addAll(arribaCLapiz, arribaSLapiz, botonPlay, abajoCLapiz, abajoSLapiz, izquierdaCLapiz, izquierdaSLapiz, derechaCLapiz, derechaSLapiz, repeticiones, repetir, inversion, ok, dibujo, movimiento);
    }
}
