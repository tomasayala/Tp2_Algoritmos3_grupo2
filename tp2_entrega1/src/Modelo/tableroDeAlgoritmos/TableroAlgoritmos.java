package Modelo.tableroDeAlgoritmos;

import Modelo.bloque.Bloque;
import Modelo.bloque.bloqueSecuencial.BloqueSecuencial;
import Modelo.bloque.bloqueSecuencial.bloqueDeInversion.BloqueDeInversion;
import Modelo.bloque.bloqueSecuencial.bloqueDeRepeticion.BloqueDeRepeticion;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoAbajo;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoArriba;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoDerecha;
import Modelo.bloque.bloqueMovimiento.BloqueMovimientoIzquierda;
import Modelo.bloque.bloqueSecuenciaGuardada.BloqueSecuenciaGuardada;
import Modelo.bloque.bloquesdeLapiz.BloqueLapizBajar;
import Modelo.bloque.bloquesdeLapiz.BloqueLapizSubir;
import Modelo.lapiz.Lapiz;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;
import Vista.sprites.Character;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

import java.sql.Time;
import java.util.ArrayList;
import java.util.HashMap;

public class TableroAlgoritmos{
    private Personaje personaje;
    private SectorDibujo tableroDeDibujo;
    private ArrayList <Bloque> secuenciaAEjeutar;
    private HashMap <String, Bloque> bloquesDisponibles;
    private ArrayList <BloqueSecuencial> bloquesSecuenciales;

    public TableroAlgoritmos(){
        this.tableroDeDibujo = new SectorDibujo();
        this.personaje = new Personaje(tableroDeDibujo);
        this.secuenciaAEjeutar = new ArrayList <Bloque>();
        this.bloquesSecuenciales = new ArrayList<BloqueSecuencial>();
        this.bloquesDisponibles = new HashMap<>();
        this.agregarBloquesBasicos(this.bloquesDisponibles);
    }

    private void agregarBloquesBasicos(HashMap<String, Bloque> bloquesDisponibles) {
        bloquesDisponibles.put( "Arriba", new BloqueMovimientoArriba());
        bloquesDisponibles.put( "Abajo", new BloqueMovimientoAbajo());
        bloquesDisponibles.put( "Derecha", new BloqueMovimientoDerecha());
        bloquesDisponibles.put( "Izquierda", new BloqueMovimientoIzquierda());
        bloquesDisponibles.put( "Subir Lapiz", new BloqueLapizSubir());
        bloquesDisponibles.put( "Bajar Lapiz", new BloqueLapizBajar());
        bloquesDisponibles.put( "Repetir x2", new BloqueDeRepeticion(2));
        bloquesDisponibles.put( "Repetir x3", new BloqueDeRepeticion(3));
        bloquesDisponibles.put( "Inversion", new BloqueDeInversion());
    }

    // Encontrar la forma en la que la interfaz grafica le manda al tablero que modelo.bloque tiene que agregar
    public void agregarProximoBloqueAEjecutar( Bloque nuevoBloque){
        if(!bloquesSecuenciales.isEmpty()) {
            bloquesSecuenciales.get(bloquesSecuenciales.size() - 1).agregarBloque(nuevoBloque);
        } else {
            secuenciaAEjeutar.add(nuevoBloque);
        }
    }

    public void agregarBloqueSecuencial(BloqueSecuencial bloque){
        agregarProximoBloqueAEjecutar(bloque);
        bloquesSecuenciales.add(bloque);
    }

    public void limpiarSecuencia(){
        secuenciaAEjeutar.clear();
    }

    public void cerrarSecuencia(){
        if(!bloquesSecuenciales.isEmpty()) {
            bloquesSecuenciales.remove(bloquesSecuenciales.size() - 1);
        }
    }

    public void ejecutarSecuencia(){
        for( Bloque bloque: secuenciaAEjeutar) {
            bloque.ejecutarInstruccionSobrePersonaje(personaje);
            personaje.getCharacter().moverPersonaje(personaje.getCoordenada().getY(), personaje.getCoordenada().getX());
            }
    }

    public BloqueSecuenciaGuardada guardarAlgoritmo(String nombreAlgortimo){
        BloqueSecuenciaGuardada algoritmoAGuardar = new BloqueSecuenciaGuardada(secuenciaAEjeutar, nombreAlgortimo);
        return algoritmoAGuardar;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public Lapiz getLapiz(){return this.personaje.getLapiz();}

    public void setCharacter(Character character){
        this.personaje.setCharacter(character);
    }

    public void setGrid(GridPane grid){
        this.getPersonaje().setGrid(grid);
    }

    public Boolean listaSecuencialesIsVacio(){
        return bloquesSecuenciales.isEmpty();
    }
}
