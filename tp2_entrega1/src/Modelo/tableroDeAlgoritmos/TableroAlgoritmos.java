package Modelo.tableroDeAlgoritmos;

import Modelo.bloque.Bloque;
import Modelo.bloque.bloqueSecuenciaGuardada.BloqueSecuenciaGuardada;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;

import java.util.ArrayList;

public class TableroAlgoritmos{
    private Personaje personaje;
    private SectorDibujo tableroDeDibujo;
    private ArrayList <Bloque> secuenciaAEjeutar;
    private ArrayList <Bloque> bloquesDisponibles;

    public TableroAlgoritmos(){
        this.tableroDeDibujo = new SectorDibujo();
        this.personaje = new Personaje(tableroDeDibujo);
        this.secuenciaAEjeutar = new ArrayList <Bloque>();
        this.bloquesDisponibles = new ArrayList<Bloque>();
    }

    // Encontrar la forma en la que la interfaz grafica le manda al tablero que modelo.bloque tiene que agregar
    public void agregarProximoBloqueAEjecutar( Bloque nuevoBloque){
        secuenciaAEjeutar.add(nuevoBloque);
    }

    public void ejecutarSecuencia(){
        for( Bloque bloque: secuenciaAEjeutar)
            bloque.ejecutarInstruccionSobrePersonaje(personaje);
    }

    // Posiblemente hacer que devuelva el modelo.bloque del algoritmo que se guardo?
    public void guardarAlgoritmo(String nombreAlgoritmo){
        BloqueSecuenciaGuardada algoritmoAGuardar = new BloqueSecuenciaGuardada(secuenciaAEjeutar, nombreAlgoritmo);
        // Posiblemente borrar la secuencia que estaba para ejecutar
        bloquesDisponibles.add(algoritmoAGuardar);
    }

    public Personaje getPersonaje() {
        return personaje;
    }
}
