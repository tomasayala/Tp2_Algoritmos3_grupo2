package Controlador;

import Modelo.bloque.bloquesdeLapiz.BloqueLapizBajar;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.lapiz.Lapiz;
import javafx.scene.layout.GridPane;

public class ClickBajarLapiz implements EventHandler<ActionEvent> {

    TableroAlgoritmos tablero;
    ConfiguradorLeftMenu leftMenu;
    GridPane grilla;

    public ClickBajarLapiz(TableroAlgoritmos tableroAlgoritmos, ConfiguradorLeftMenu configuradorLeftMenu, GridPane grid){
        tablero = tableroAlgoritmos;
        leftMenu = configuradorLeftMenu;
        grilla = grid;
        if (grilla != null){
            System.out.println("hjbvygu");
        }
    }

    @Override
    public void handle(ActionEvent actionEvent){
        //tablero.getLapiz().bajarLapiz();
       // tablero.setGrid(grilla);
        tablero.agregarProximoBloqueAEjecutar(new BloqueLapizBajar());
        leftMenu.agregarProximoBloque("Bajar Lapiz");
    }
}
