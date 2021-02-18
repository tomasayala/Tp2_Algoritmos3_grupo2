package interfaceGrafica.botones;

import bloque.bloqueDeRepeticion.BloqueDeRepeticion;
import coordenadas.Coordenada;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import tableroDeAlgoritmos.TableroAlgoritmos;

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
        System.out.println("Agrego un bloque de repeticion");
        secuencia.agregarProximoBloqueAEjecutar(new BloqueDeRepeticion(repeticiones));
    }
}
