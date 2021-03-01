package Vista.configuradores;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class guardarNombre implements EventHandler<ActionEvent>{
    TextField text;
    Stage ventana;
    public guardarNombre(TextField texto, Stage window){
        text = texto;
        ventana = window;
    }

    public void handle(ActionEvent actionEvent) {
        ventana.close();
    }
}
