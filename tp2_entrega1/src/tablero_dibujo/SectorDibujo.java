package tablero_dibujo;

import coordenadas.Coordenada;
import linea.Linea;

import java.util.ArrayList;

// Tal vez tenga que ser un Singleton

public class SectorDibujo {
    // Guardar las lineas que se dibujan en una lista o un Array?
    private ArrayList coleccionLineas;
    private Coordenada coordenadaPersonaje;
    public SectorDibujo(){
        this.coleccionLineas = new ArrayList();
        this.coordenadaPersonaje = new Coordenada();
    }

    //public void setCoordenadaPersonaje(Coordenada unaCoordenada){ this.coordenadaPersonaje = unaCoordenada;}
    public void moverPersonaje(Coordenada unaCoordenada){
        this.coordenadaPersonaje = unaCoordenada;
    }

    //La funcion devuelve el numero de elementos en la lista con proposito de testeo

    public void agregarLinea(Linea unaLinea){
        coleccionLineas.add( unaLinea);
    }

    public int cantidadDeLineasDibujadas(){
        return coleccionLineas.size();
    }

    // Funcion con fines de testeo
    public Coordenada getCoordenadaPersonaje() {
        return coordenadaPersonaje;
    }
}
