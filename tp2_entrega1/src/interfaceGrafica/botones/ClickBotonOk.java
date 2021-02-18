package interfaceGrafica.botones;

import bloque.bloqueDeInversion.BloqueDeInversion;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import tableroDeAlgoritmos.TableroAlgoritmos;

public class ClickBotonOk implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    TextField input;
    int repes;
    public ClickBotonOk(TableroAlgoritmos tableroAlgoritmos, TextField text){
        secuencia = tableroAlgoritmos;
        input = text;
    }

    public int getRepes(){
        return repes;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        repes = Integer.parseInt(input.getText());
    }
}