package personaje.test_subir_y_bajar_lapiz;

import junit.framework.TestCase;
import lapiz.LapizArriba;
import personaje.Personaje;

public class PersonajeTestSubirLapizDevuelveUnLapizLevantado extends TestCase {

    public void testSubirLapiz() {
        Personaje personaje = new Personaje();

        personaje.subirLapiz();

        assertTrue( personaje.getLapiz() instanceof LapizArriba);
    }
}