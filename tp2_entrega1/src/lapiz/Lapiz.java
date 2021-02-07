package lapiz;//package com.company;


// Posiblemente pensar patron State para distintos tipos de lapiz, lapiz rojo, azul
/*
    La clase abstracta seria estado y la clase lapiz es concreta. Lo que permite esto es mantener la informacion y cambiar
    el comportamiento con el atributo state


 */

import coordenadas.Coordenada;

/*
      Posible implementacion del patron State para un lapiz

      public class Lapiz{
      EstadoLapiz estado;
      ColorLapiz color;

        public Lapiz(){
        this.estado = new LapizLevantado();
        this.color = new ColorLapizRojo;
        }
        public void setEstado( EstadoLapiz estadoNuevo){
            estado = estadoNuevo;
        }
      }
 */
public abstract class Lapiz{
    // Agregar un atributo de sector de dibujo y el constructor recibe un tablero de Dibujo
    // Dibujar linea recibe dos coordenadas, desde donde y hasta donde se tiene que dibujar la linea
    public abstract int dibujarLinea(Coordenada desde, Coordenada hasta);
}
