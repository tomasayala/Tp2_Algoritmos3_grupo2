package Controlador;

import Modelo.bloque.bloqueMovimiento.BloqueMovimientoArriba;
import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import Modelo.coordenas.Coordenada;

public class ClickBotonArriba implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    ConfiguradorLeftMenu leftMenu;
    public ClickBotonArriba(TableroAlgoritmos tableroAlgoritmos, ConfiguradorLeftMenu configuradorLeftMenu){
        secuencia = tableroAlgoritmos;
        leftMenu = configuradorLeftMenu;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        Coordenada inicio = secuencia.getPersonaje().getCoordenada();
        secuencia.agregarProximoBloqueAEjecutar(new BloqueMovimientoArriba());
        secuencia.getPersonaje().getLapiz().dibujarLinea(inicio, secuencia.getPersonaje().getCoordenada());
        leftMenu.agregarProximoBloque("Arriba");
    }
}
