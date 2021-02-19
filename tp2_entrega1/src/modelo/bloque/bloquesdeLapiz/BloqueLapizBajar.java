package modelo.bloque.bloquesdeLapiz;

import modelo.bloque.Bloque;
import modelo.personaje.Personaje;

public class BloqueLapizBajar implements Bloque {
    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        personaje.bajarLapiz();
    }
    //Falta las pruebas
    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje){
        personaje.subirLapiz();
    }
}
