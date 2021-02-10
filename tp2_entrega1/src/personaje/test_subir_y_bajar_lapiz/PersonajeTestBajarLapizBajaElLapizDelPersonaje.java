package personaje.test_subir_y_bajar_lapiz;

import junit.framework.TestCase;
import lapiz.EstadoLapizAbajo;
import personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class PersonajeTestBajarLapizBajaElLapizDelPersonaje extends TestCase {

    public void testBajarLapiz() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);

        personaje.bajarLapiz();

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizAbajo);
    }
}