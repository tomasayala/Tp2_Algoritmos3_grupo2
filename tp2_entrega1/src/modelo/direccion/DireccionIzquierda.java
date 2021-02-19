package modelo.direccion;//package com.company;

//import package direccion;
import modelo.coordenas.Coordenada; //package.Coordenada;

public class DireccionIzquierda extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverIzquierda();
    }
}
