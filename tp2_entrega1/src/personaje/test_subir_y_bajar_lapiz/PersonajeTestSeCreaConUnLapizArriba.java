package personaje.test_subir_y_bajar_lapiz;

import junit.framework.TestCase;
import lapiz.LapizArriba;
import personaje.Personaje;

public class PersonajeTestSeCreaConUnLapizArriba extends TestCase {

    public void testSubirLapiz() {
        Personaje personaje = new Personaje();

        assertTrue( personaje.getLapiz() instanceof LapizArriba);
    }
}