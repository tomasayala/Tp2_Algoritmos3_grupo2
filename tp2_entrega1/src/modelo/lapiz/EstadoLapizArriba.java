package modelo.lapiz;//package com.company;

import modelo.coordenas.Coordenada;
import modelo.tablero_dibujo.SectorDibujo;

public class EstadoLapizArriba extends EstadoLapiz{
    @Override
    public int dibujarLineaSobreElTablero(Coordenada desde, Coordenada hasta, SectorDibujo tableroDeDibujo){
        //No dibuja
        return 0;
    }
}