package direccion;//package com.company;

//import package direccion;
import coordenadas.Coordenada; //package.Coordenada;

public class DireccionIzquierda extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverIzquierda();
    }
}
