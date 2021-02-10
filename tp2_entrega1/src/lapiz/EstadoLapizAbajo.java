package lapiz;//package com.company;

import coordenadas.Coordenada;
import linea.Linea;
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