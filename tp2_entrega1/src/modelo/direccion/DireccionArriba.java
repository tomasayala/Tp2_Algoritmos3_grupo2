package modelo.direccion;//package com.company;

//import package.Direccion;
import modelo.coordenas.Coordenada;
//package coordenadas;

public class DireccionArriba extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverArriba();
    }
}
