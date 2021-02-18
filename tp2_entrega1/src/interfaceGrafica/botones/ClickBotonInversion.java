package interfaceGrafica.botones;

import bloque.bloqueDeInversion.BloqueDeInversion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import tableroDeAlgoritmos.TableroAlgoritmos;

public class ClickBotonInversion implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    public ClickBotonInversion(TableroAlgoritmos tableroAlgoritmos){
        secuencia = tableroAlgoritmos;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Agrego un bloque de inversion");
        secuencia.agregarProximoBloqueAEjecutar(new BloqueDeInversion());
    }
}
