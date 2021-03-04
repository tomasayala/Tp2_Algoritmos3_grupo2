package Modelo.lapiz;//package com.company;

import Modelo.coordenas.Coordenada;
import Modelo.tablero_dibujo.SectorDibujo;
import javafx.scene.layout.GridPane;

public class EstadoLapizArriba extends EstadoLapiz{
    @Override
    public int dibujarLineaSobreElTablero(Coordenada desde, Coordenada hasta, SectorDibujo tableroDeDibujo){
        //No dibuja
        return 0;
    }

    public void setGrid(GridPane grilla){
    }

    @Override
    public void dibujarSobreLaGrilla(Coordenada desde, Coordenada hasta) {

    }
}