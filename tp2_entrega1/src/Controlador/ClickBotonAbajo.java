package Controlador;

import Modelo.bloque.bloqueMovimiento.BloqueMovimientoAbajo;
import Modelo.coordenas.Coordenada;
import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ClickBotonAbajo implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    ConfiguradorLeftMenu leftMenu;
    public ClickBotonAbajo(TableroAlgoritmos tableroAlgoritmos, ConfiguradorLeftMenu configuradorLeftMenu){
        secuencia = tableroAlgoritmos;
        leftMenu = configuradorLeftMenu;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        Coordenada inicio = secuencia.getPersonaje().getCoordenada();
        secuencia.agregarProximoBloqueAEjecutar(new BloqueMovimientoAbajo());
        secuencia.getPersonaje().getLapiz().dibujarLinea(inicio, secuencia.getPersonaje().getCoordenada());
        leftMenu.agregarProximoBloque("Abajo");
    }
}
