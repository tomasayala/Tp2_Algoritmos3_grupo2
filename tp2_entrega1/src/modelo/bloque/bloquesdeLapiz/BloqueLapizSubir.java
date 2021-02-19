package modelo.bloque.bloquesdeLapiz;

import modelo.bloque.Bloque;
import modelo.personaje.Personaje;

public class BloqueLapizSubir implements Bloque {
    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        personaje.subirLapiz();
    }
    //Faltan las pruebas
    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje){
        personaje.bajarLapiz();
    }
}
