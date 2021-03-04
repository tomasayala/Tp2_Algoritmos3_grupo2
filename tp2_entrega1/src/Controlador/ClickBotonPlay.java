package Controlador;

import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ClickBotonPlay implements EventHandler<ActionEvent>{
    TableroAlgoritmos secuencia;
    ConfiguradorLeftMenu menu;
    public ClickBotonPlay(TableroAlgoritmos tableroAlgoritmos, ConfiguradorLeftMenu configuradorLeftMenu){
        secuencia = tableroAlgoritmos;
        menu = configuradorLeftMenu;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        secuencia.ejecutarSecuencia();
        menu.limpiarLista();
        secuencia.limpiarSecuencia();
    }
}
