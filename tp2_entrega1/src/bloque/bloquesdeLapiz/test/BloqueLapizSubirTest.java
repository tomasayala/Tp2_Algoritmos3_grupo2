package bloque.bloquesdeLapiz.test;

import bloque.bloquesdeLapiz.BloqueLapizSubir;
import junit.framework.TestCase;
import lapiz.EstadoLapizArriba;
import personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class BloqueLapizSubirTest extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        BloqueLapizSubir bloque = new BloqueLapizSubir();

        personaje.bajarLapiz();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizArriba);
    }
}