package interfaceGrafica.botones;

import modelo.bloque.bloqueDeInversion.BloqueDeInversion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ClickBotonInversion implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    public ClickBotonInversion(TableroAlgoritmos tableroAlgoritmos){
        secuencia = tableroAlgoritmos;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Agrego un modelo.bloque de inversion");
        secuencia.agregarProximoBloqueAEjecutar(new BloqueDeInversion());
    }
}
