package interfaceGrafica.botones;

import modelo.bloque.bloqueDeRepeticion.BloqueDeRepeticion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import modelo.tableroDeAlgoritmos.TableroAlgoritmos;

public class ClickBotonRepeticion implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    TextField input;
    public ClickBotonRepeticion(TableroAlgoritmos tableroAlgoritmos, TextField numero){
        secuencia = tableroAlgoritmos;
        input = numero;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        int repeticiones = Integer.parseInt(input.getText());
        System.out.println("Agrego un modelo.bloque de repeticion");
        secuencia.agregarProximoBloqueAEjecutar(new BloqueDeRepeticion(repeticiones));
    }
}
