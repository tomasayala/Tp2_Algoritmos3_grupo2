package Controlador;

import Modelo.bloque.bloqueSecuenciaGuardada.BloqueSecuenciaGuardada;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ClickSecuenciaGuardada implements EventHandler<ActionEvent> {
    TableroAlgoritmos tablero;
    BloqueSecuenciaGuardada block;
    ConfiguradorLeftMenu leftMenu;
    public ClickSecuenciaGuardada(TableroAlgoritmos tableroAlgoritmos, BloqueSecuenciaGuardada bloque, ConfiguradorLeftMenu configuradorLeftMenu){
        tablero = tableroAlgoritmos;
        block = bloque;
        leftMenu = configuradorLeftMenu;
    }
    public void handle(ActionEvent actionEvent) {
        tablero.agregarProximoBloqueAEjecutar(block);
        leftMenu.agregarBloqueGuardado(block.getNombre());
    }
}
