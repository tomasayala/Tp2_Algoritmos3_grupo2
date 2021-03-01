package Controlador;

import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.ArrayList;

public class ClickBotonGuardar implements EventHandler<ActionEvent> {
    TableroAlgoritmos secuencia;
    ArrayList<>
    public ClickBotonGuardar(TableroAlgoritmos tableroAlgoritmos){
        secuencia = tableroAlgoritmos;
    }
    @Override
    public void handle(ActionEvent actionEvent) {
        System.out.println("Play");
        secuencia.ejecutarSecuencia();
        System.out.println(" Y= "+secuencia.getPersonaje().getCoordenada().getY());
        System.out.println(" X= "+secuencia.getPersonaje().getCoordenada().getX());
        secuencia.limpiarSecuencia();
    }
}