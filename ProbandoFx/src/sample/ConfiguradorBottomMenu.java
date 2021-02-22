package sample;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ConfiguradorBottomMenu {

    public void configurarHbox(HBox bottomMenu) {
        Button botonEjecutarAlgoritmo = new Button("Ejecutar Algoritmo");
        Button botonGuardarAlgoritmo = new Button("Guardar Algoritmo");
        bottomMenu.getChildren().addAll(botonEjecutarAlgoritmo, botonGuardarAlgoritmo);
        bottomMenu.setAlignment(Pos.CENTER_RIGHT);
    }
}
