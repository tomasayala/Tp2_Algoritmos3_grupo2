package bloque.bloquesdeLapiz.test;

import bloque.bloquesdeLapiz.BloqueLapizBajar;
import junit.framework.TestCase;
import lapiz.EstadoLapizAbajo;
import personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class BloqueLapizBajarTestLeBajaElLapizAUnPersonaje extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        BloqueLapizBajar bloque = new BloqueLapizBajar();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizAbajo);

    }
}