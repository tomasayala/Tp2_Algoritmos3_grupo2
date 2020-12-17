package bloque.bloquesdeLapiz;

import bloque.Bloque;
import personaje.Personaje;

public class BloqueLapizBajar implements Bloque {
    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        personaje.bajarLapiz();
    }
}
