package tablero_dibujo;

import coordenadas.Coordenada;
import linea.Linea;

import java.awt.*;

// Tal vez tenga que ser un Singleton

public class SectorDibujo {
    // Guardar las lineas que se dibujan en una lista o un Array?
    private List coleccionLineas;
    private Coordenada coordenadaPersonaje;

    public void moverPersonaje( Coordenada unaCoordenada){
        this.coordenadaPersonaje = unaCoordenada;
    }
    public void mostrarLinea(Linea unaLinea){

    }


}
