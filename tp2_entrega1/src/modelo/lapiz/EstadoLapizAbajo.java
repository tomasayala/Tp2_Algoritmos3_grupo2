package modelo.lapiz;//package com.company;

import modelo.coordenas.Coordenada;
import modelo.linea.Linea;
import tablero_dibujo.SectorDibujo;

public class EstadoLapizAbajo extends EstadoLapiz{
    @Override
    public int dibujarLineaSobreElTablero(Coordenada desde, Coordenada hasta, SectorDibujo tableroDeDibujo){
        Linea linea = new Linea(desde, hasta);
        tableroDeDibujo.agregarLinea(linea);
        System.out.println("---");
        return 1;
    }
}