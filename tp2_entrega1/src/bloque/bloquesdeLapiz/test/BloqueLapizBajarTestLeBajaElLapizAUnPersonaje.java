package bloque.bloquesdeLapiz.test;

import bloque.bloquesdeLapiz.BloqueLapizBajar;
import junit.framework.TestCase;
import lapiz.LapizAbajo;
import personaje.Personaje;

public class BloqueLapizBajarTestLeBajaElLapizAUnPersonaje extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje() {
        Personaje personaje = new Personaje();
        BloqueLapizBajar bloque = new BloqueLapizBajar();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertTrue( personaje.getLapiz() instanceof LapizAbajo);

    }
}