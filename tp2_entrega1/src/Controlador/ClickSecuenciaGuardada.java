package Controlador;

import Modelo.bloque.bloqueSecuenciaGuardada.BloqueSecuenciaGuardada;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class ClickSecuenciaGuardada implements EventHandler<ActionEvent> {
    TableroAlgoritmos tablero;
    BloqueSecuenciaGuardada block;
    public ClickSecuenciaGuardada(TableroAlgoritmos tableroAlgoritmos, BloqueSecuenciaGuardada bloque){
        tablero = tableroAlgoritmos;
        block = bloque;
    }
    public void handle(ActionEvent actionEvent) {
        System.out.println("Agrego Bloque Guardado");
        tablero.agregarProximoBloqueAEjecutar(block);
    }
}
