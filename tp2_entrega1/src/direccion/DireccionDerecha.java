package direccion;//package com.company;

//import package.Direccion;
import coordenadas.Coordenada;// package.Coordenada;

public class DireccionDerecha extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverDerecha();
    }
}
