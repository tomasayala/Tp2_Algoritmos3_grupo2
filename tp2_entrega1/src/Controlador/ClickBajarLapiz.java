package Controlador;

import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.lapiz.Lapiz;

public class ClickBajarLapiz implements EventHandler<ActionEvent> {

    Lapiz lapiz;
    ConfiguradorLeftMenu leftMenu;

    public ClickBajarLapiz(Lapiz unLapiz, ConfiguradorLeftMenu configuradorLeftMenu){
        lapiz = unLapiz;
        leftMenu = configuradorLeftMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent){
        lapiz.bajarLapiz();
        leftMenu.agregarProximoBloque("Bajar Lapiz");
    }
}
