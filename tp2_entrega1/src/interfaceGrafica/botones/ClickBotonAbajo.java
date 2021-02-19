package interfaceGrafica.botones;

import modelo.bloque.bloqueMovimiento.BloqueMovimientoAbajo;
import modelo.coordenas.Coordenada;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ClickBotonAbajo implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    public ClickBotonAbajo(TableroAlgoritmos tableroAlgoritmos){
        secuencia = tableroAlgoritmos;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Muevo personaje hacia abajo");
        Coordenada inicio = secuencia.getPersonaje().getCoordenada();
        secuencia.agregarProximoBloqueAEjecutar(new BloqueMovimientoAbajo());
        secuencia.getPersonaje().getLapiz().dibujarLinea(inicio, secuencia.getPersonaje().getCoordenada());
    }
}
