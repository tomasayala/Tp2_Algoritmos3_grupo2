package bloque.bloquesdeLapiz;

import bloque.Bloque;
import personaje.Personaje;

public class BloqueLapizSubir implements Bloque {
    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        personaje.subirLapiz();
    }
}
