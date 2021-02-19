package interfaceGrafica.botones;

import modelo.bloque.bloqueMovimiento.BloqueMovimientoArriba;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import modelo.coordenas.Coordenada;

public class ClickBotonArriba implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    public ClickBotonArriba(TableroAlgoritmos tableroAlgoritmos){
        secuencia = tableroAlgoritmos;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Muevo personaje hacia arriba");
        Coordenada inicio = secuencia.getPersonaje().getCoordenada();
        secuencia.agregarProximoBloqueAEjecutar(new BloqueMovimientoArriba());
        secuencia.getPersonaje().getLapiz().dibujarLinea(inicio, secuencia.getPersonaje().getCoordenada());
    }
}
