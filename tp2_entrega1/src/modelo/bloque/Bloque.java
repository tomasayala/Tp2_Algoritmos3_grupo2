package modelo.bloque;

import modelo.personaje.Personaje;

public  interface Bloque {
      void ejecutarInstruccionSobrePersonaje(Personaje personaje);
      //Faltan las pruebas
      void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje);
}
