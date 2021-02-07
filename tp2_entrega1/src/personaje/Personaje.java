package personaje;//package tp2.1;

import coordenadas.Coordenada;
import direccion.Direccion;
import lapiz.Lapiz;
import lapiz.LapizAbajo;
import lapiz.LapizArriba;

public class Personaje{
     private Lapiz lapiz;
     private Coordenada coordenada;
    public Personaje(){
        this.lapiz = new LapizArriba();
        this.coordenada = new Coordenada();
    }
    public void bajarLapiz(){
        this.lapiz = new LapizAbajo();
    }

    public void subirLapiz(){
        this.lapiz = new LapizArriba();
    }

    public void moverDireccion(Direccion unaDireccion){
        Coordenada vieja = this.getCoordenada();
        unaDireccion.aplicarMovimiento(this.coordenada);
        // Mandarle al sector para que mueva el personaje
        // Armar una posible excepcion aca por si el personaje no se mueve por X motivo
        this.lapiz.dibujarLinea(vieja, this.coordenada);
    }

    //Este mensaje fue creado con fines de testeo
    public Coordenada getCoordenada() {
        return this.coordenada;
    }

    //Este mensjae fue creado con fines de testeo
    public Lapiz getLapiz() {
        return this.lapiz;
    }
}

