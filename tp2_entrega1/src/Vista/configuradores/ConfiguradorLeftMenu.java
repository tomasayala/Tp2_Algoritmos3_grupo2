package Vista.configuradores;

import Modelo.tableroDeAlgoritmos.TableroAlgoritmos;
import javafx.scene.control.ListView;

public class ConfiguradorLeftMenu {
    ListView<String> nombreDeBloques;
    TableroAlgoritmos secuencia;
    public void configurarListView(ListView<String> leftMenu, TableroAlgoritmos tablero) {
        nombreDeBloques = leftMenu;
        secuencia = tablero;
    }

    //Posible nueva funcion para agregar el proximo bloque a ejecutar que contiene el hash map
    public void agregarProximoBloque(String bloque){
        if(secuencia.listaSecuencialesIsVacio()) {
            this.nombreDeBloques.getItems().add(bloque);
        }
    }
    public void agregarBloqueSecuencial(String bloque){
        this.nombreDeBloques.getItems().add(bloque);
    }

    public void agregarBloqueGuardado(String bloque){
        this.nombreDeBloques.getItems().add(bloque);
    }

    public void limpiarLista(){
        nombreDeBloques.getItems().clear();
    }
}
