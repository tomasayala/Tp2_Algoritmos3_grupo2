package personaje.test_subir_y_bajar_lapiz;

import junit.framework.TestCase;
import lapiz.LapizAbajo;
import personaje.Personaje;

public class PersonajeTestBajarLapizBajaElLapizDelPersonaje extends TestCase {

    public void testBajarLapiz() {
        Personaje personaje = new Personaje();

        personaje.bajarLapiz();

        assertTrue( personaje.getLapiz() instanceof LapizAbajo);
    }
}