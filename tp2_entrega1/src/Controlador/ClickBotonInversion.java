package Controlador;

import Modelo.bloque.bloqueSecuencial.bloqueDeInversion.BloqueDeInversion;
import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.scene.layout.VBox;

public class ClickBotonInversion implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    int posicion;
    VBox menu;
    ConfiguradorLeftMenu leftMenu;
    public ClickBotonInversion(TableroAlgoritmos tableroAlgoritmos, int numero, VBox rightMenu, ConfiguradorLeftMenu configuradorLeftMenu){
        secuencia = tableroAlgoritmos;
        menu = rightMenu;
        posicion = numero;
        leftMenu = configuradorLeftMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Agrego un bloque de inversion");
        secuencia.agregarBloqueSecuencial(new BloqueDeInversion());
        menu.getChildren().get(posicion).setVisible(true);
        leftMenu.agregarBloqueSecuencial("Inversion");
    }
}
