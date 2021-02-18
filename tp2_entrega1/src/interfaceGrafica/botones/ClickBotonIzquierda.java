package interfaceGrafica.botones;

import bloque.bloqueMovimiento.BloqueMovimientoDerecha;
import bloque.bloqueMovimiento.BloqueMovimientoIzquierda;
import coordenadas.Coordenada;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import tableroDeAlgoritmos.TableroAlgoritmos;


public class ClickBotonIzquierda implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    public ClickBotonIzquierda(TableroAlgoritmos tableroAlgoritmos){
        secuencia = tableroAlgoritmos;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Muevo personaje hacia la izquierda");
        Coordenada inicio = secuencia.getPersonaje().getCoordenada();
        secuencia.agregarProximoBloqueAEjecutar(new BloqueMovimientoIzquierda());
        secuencia.getPersonaje().getLapiz().dibujarLinea(inicio, secuencia.getPersonaje().getCoordenada());
    }
}
