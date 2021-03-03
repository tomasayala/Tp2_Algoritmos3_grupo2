package Modelo.bloque.bloquesdeLapiz;

import Modelo.bloque.Bloque;
import Modelo.personaje.Personaje;


public class BloqueLapizBajar implements Bloque {

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        personaje.bajarLapiz();
        personaje.asignarGrilla();
    }
    //Falta las pruebas
    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje){
        personaje.subirLapiz();
    }
}
