package Controlador;

import Modelo.bloque.bloqueMovimiento.BloqueMovimientoIzquierda;
import Modelo.coordenas.Coordenada;
import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;


public class ClickBotonIzquierda implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    ConfiguradorLeftMenu leftMenu;
    public ClickBotonIzquierda(TableroAlgoritmos tableroAlgoritmos, ConfiguradorLeftMenu configuradorLeftMenu){
        secuencia = tableroAlgoritmos;
        leftMenu = configuradorLeftMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        Coordenada inicio = secuencia.getPersonaje().getCoordenada();
        secuencia.agregarProximoBloqueAEjecutar(new BloqueMovimientoIzquierda());
        secuencia.getPersonaje().getLapiz().dibujarLinea(inicio, secuencia.getPersonaje().getCoordenada());
        leftMenu.agregarProximoBloque("Izquierda");
    }
}
