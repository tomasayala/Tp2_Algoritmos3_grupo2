package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ClickBoton implements EventHandler<ActionEvent> {
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Estas usando una clase con un event Handler");
    }
}
