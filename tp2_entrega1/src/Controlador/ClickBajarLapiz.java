package Controlador;

import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.lapiz.Lapiz;
import javafx.scene.layout.GridPane;

public class ClickBajarLapiz implements EventHandler<ActionEvent> {

    Lapiz lapiz;
    ConfiguradorLeftMenu leftMenu;
    GridPane grilla;

    public ClickBajarLapiz(Lapiz unLapiz, ConfiguradorLeftMenu configuradorLeftMenu, GridPane grid){
        lapiz = unLapiz;
        leftMenu = configuradorLeftMenu;
        grilla = grid;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        lapiz.bajarLapiz();
        lapiz.setGrid(grilla);
        leftMenu.agregarProximoBloque("Bajar Lapiz");
    }
}
