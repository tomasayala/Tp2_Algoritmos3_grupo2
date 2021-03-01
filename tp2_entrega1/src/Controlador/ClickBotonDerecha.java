package Controlador;

import Modelo.coordenas.Coordenada;
import Vista.configuradores.ConfiguradorLeftMenu;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoDerecha;

public class ClickBotonDerecha implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    ConfiguradorLeftMenu leftMenu;
    public ClickBotonDerecha(TableroAlgoritmos tableroAlgoritmos, ConfiguradorLeftMenu configuradorLeftMenu){
        secuencia = tableroAlgoritmos;
        leftMenu = configuradorLeftMenu;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Muevo personaje hacia la derecha");
        Coordenada inicio = secuencia.getPersonaje().getCoordenada();
        secuencia.agregarProximoBloqueAEjecutar(new BloqueMovimientoDerecha());
        secuencia.getPersonaje().getLapiz().dibujarLinea(inicio, secuencia.getPersonaje().getCoordenada());
        leftMenu.agregarProximoBloque("Derecha");
    }
}
