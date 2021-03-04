package Modelo.lapiz;//package com.company;


import Modelo.coordenas.Coordenada;
import Modelo.tablero_dibujo.SectorDibujo;
import javafx.scene.layout.GridPane;

public class Lapiz{
      private EstadoLapiz estado;
      private SectorDibujo tablero;

      public Lapiz(SectorDibujo sector){
        this.estado = new EstadoLapizArriba();
        this.tablero = sector;
      }

      public void levantarLapiz(){
            estado = new EstadoLapizArriba();
        }

      public void bajarLapiz(){
            estado = new EstadoLapizAbajo();
        }

        //Devuelve un numero con propositos de testeos

      public int dibujarLinea(Coordenada desde, Coordenada hasta) {
        return this.estado.dibujarLineaSobreElTablero( desde, hasta, tablero);
      }

      //funcion con fines de testeo
      public EstadoLapiz getEstado() {
        return estado;
      }

      public void setGrid(GridPane grid){
          this.estado.setGrid(grid);
      }
}

