package Controlador;

import Modelo.bloque.bloqueSecuenciaGuardada.BloqueSecuenciaGuardada;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import Vista.configuradores.ConfiguradorLeftMenu;
import Vista.configuradores.guardarNombre;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ClickBotonGuardar implements EventHandler<ActionEvent> {
    TableroAlgoritmos tablero;
    String nombre;
    HBox menu;
    ConfiguradorLeftMenu leftMenu;
    int retorno = 0;
    public ClickBotonGuardar(TableroAlgoritmos tableroAlgoritmos, HBox bottomMenu, ConfiguradorLeftMenu configuradorLeftMenu){
        tablero = tableroAlgoritmos;
        menu = bottomMenu;
        leftMenu = configuradorLeftMenu;
    }

    private void cancel(Stage venatana){
        retorno = -1;
        venatana.close();
    }


    private int display(){
        VBox layout = new VBox();
        TextField input = new TextField();
        input.setMaxWidth(100);
        Label label = new Label("Elige un nombre para tu bloque:");
        Button guardar = new Button("Guardar");
        Button cancelar = new Button("Cancelar");
        Scene escena = new Scene(layout, 300, 200);
        Stage ventana = new Stage();
        ventana.setTitle("Asignar Nombre");
        guardar.setTranslateY(5);
        cancelar.setTranslateY(10);
        guardar.setOnAction(new guardarNombre(input, ventana));
        cancelar.setOnAction(e -> cancel(ventana));
        layout.getChildren().addAll(label, input, guardar, cancelar);
        layout.setAlignment(Pos.CENTER);
        ventana.initModality(Modality.APPLICATION_MODAL);
        ventana.setScene(escena);
        ventana.showAndWait();
        nombre = input.getText();
        return retorno;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        if(this.display() == 0) {
            BloqueSecuenciaGuardada bloque = tablero.guardarAlgoritmo(nombre);
            Button nuevo = new Button(nombre);
            nuevo.setOnAction(new ClickSecuenciaGuardada(tablero, bloque, leftMenu));
            menu.getChildren().add(nuevo);
        }
        retorno = 0;
    }
}