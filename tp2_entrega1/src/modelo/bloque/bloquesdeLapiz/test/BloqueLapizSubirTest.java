package modelo.bloque.bloquesdeLapiz.test;

import modelo.bloque.bloquesdeLapiz.BloqueLapizSubir;
import junit.framework.TestCase;
import modelo.lapiz.EstadoLapizArriba;
import modelo.personaje.Personaje;
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