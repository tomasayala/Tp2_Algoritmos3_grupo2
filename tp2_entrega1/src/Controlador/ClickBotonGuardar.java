package Controlador;

import Modelo.bloque.Bloque;
import Modelo.bloque.bloqueSecuenciaGuardada.BloqueSecuenciaGuardada;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import Vista.configuradores.guardarNombre;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.ArrayList;

public class ClickBotonGuardar implements EventHandler<ActionEvent> {
    TableroAlgoritmos tablero;
    String nombre;
    HBox menu;
    public ClickBotonGuardar(TableroAlgoritmos tableroAlgoritmos, HBox bottomMenu){
        tablero = tableroAlgoritmos;
        menu = bottomMenu;
    }


    private void display(){
        VBox layout = new VBox();
        TextField input = new TextField();
        input.setPromptText("Nombre");
        input.setMaxWidth(100);
        Button guardar = new Button("Guardar");
        Scene escena = new Scene(layout, 300, 200);
        Stage ventana = new Stage();
        guardar.setOnAction(new guardarNombre(input, ventana));
        layout.getChildren().addAll(input, guardar);
        layout.setAlignment(Pos.CENTER);
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.setScene(escena);
        ventana.showAndWait();
        nombre = input.getText();
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Guardo Secuencia actual");
        this.display();
        BloqueSecuenciaGuardada bloque = tablero.guardarAlgoritmo(nombre);
        Button nuevo = new Button(nombre);
        nuevo.setOnAction(new ClickSecuenciaGuardada(tablero, bloque));
        menu.getChildren().add(nuevo);
    }
}