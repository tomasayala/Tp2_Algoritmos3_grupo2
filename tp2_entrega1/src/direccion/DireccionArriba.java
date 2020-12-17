package direccion;//package com.company;

//import package.Direccion;
import coordenadas.Coordenada;
//package coordenadas;

public class DireccionArriba extends Direccion{
    public void aplicarMovimiento(Coordenada unaCoordenada){
        unaCoordenada.moverArriba();
    }
}
