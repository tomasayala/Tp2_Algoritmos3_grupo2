package bloque.bloquesdeLapiz.test;

import bloque.bloquesdeLapiz.BloqueLapizSubir;
import junit.framework.TestCase;
import lapiz.LapizArriba;
import personaje.Personaje;

public class BloqueLapizSubirTest extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje() {
        Personaje personaje = new Personaje();
        BloqueLapizSubir bloque = new BloqueLapizSubir();

        personaje.bajarLapiz();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertTrue( personaje.getLapiz() instanceof LapizArriba);
    }
}