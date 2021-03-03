package Controlador;

import Modelo.bloque.bloquesdeLapiz.BloqueLapizSubir;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.lapiz.Lapiz;

public class ClickSubirLapiz implements EventHandler<ActionEvent> {

    TableroAlgoritmos tablero;
    ConfiguradorLeftMenu leftMenu;

    public ClickSubirLapiz(TableroAlgoritmos tableroAlgoritmos, ConfiguradorLeftMenu configuradorLeftMenu){
        tablero = tableroAlgoritmos;
        leftMenu = configuradorLeftMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        tablero.agregarProximoBloqueAEjecutar(new BloqueLapizSubir());
        leftMenu.agregarProximoBloque("Subir Lapiz");
    }
}
