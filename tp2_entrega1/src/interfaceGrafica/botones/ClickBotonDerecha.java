package interfaceGrafica.botones;

import modelo.coordenas.Coordenada;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import modelo.bloque.bloqueMovimiento.BloqueMovimientoDerecha;

public class ClickBotonDerecha implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    public ClickBotonDerecha(TableroAlgoritmos tableroAlgoritmos){
        secuencia = tableroAlgoritmos;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Muevo personaje hacia la derecha");
        Coordenada inicio = secuencia.getPersonaje().getCoordenada();
        secuencia.agregarProximoBloqueAEjecutar(new BloqueMovimientoDerecha());
        secuencia.getPersonaje().getLapiz().dibujarLinea(inicio, secuencia.getPersonaje().getCoordenada());
    }
}
