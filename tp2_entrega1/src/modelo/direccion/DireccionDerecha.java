package modelo.direccion;//package com.company;

//import package.Direccion;
import modelo.coordenas.Coordenada;// package.Coordenada;

public class DireccionDerecha extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverDerecha();
    }
}
