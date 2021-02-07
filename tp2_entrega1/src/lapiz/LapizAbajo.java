package lapiz;//package com.company;

import coordenadas.Coordenada;
import linea.Linea;

public class LapizAbajo extends Lapiz{
    public int dibujarLinea(Coordenada desde, Coordenada hasta){
        Linea linea = new Linea(desde, hasta);
        // Le pasa al tablero de Dibujo la linea que tiene que dibujar
        System.out.println("---");
        return 1;
    }
}