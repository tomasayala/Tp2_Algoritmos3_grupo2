package lapiz;//package com.company;


// Posiblemente pensar patron State para distintos tipos de lapiz, lapiz rojo, azul
/*
    La clase abstracta seria estado y la clase lapiz es concreta. Lo que permite esto es mantener la informacion y cambiar
    el comportamiento con el atributo state


 */

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
    public abstract int dibujarLinea();
}
