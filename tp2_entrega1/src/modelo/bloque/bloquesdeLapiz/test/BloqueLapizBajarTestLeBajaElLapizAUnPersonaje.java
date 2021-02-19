package modelo.bloque.bloquesdeLapiz.test;

import modelo.bloque.bloquesdeLapiz.BloqueLapizBajar;
import junit.framework.TestCase;
import modelo.lapiz.EstadoLapizAbajo;
import modelo.personaje.Personaje;
import modelo.tablero_dibujo.SectorDibujo;

public class BloqueLapizBajarTestLeBajaElLapizAUnPersonaje extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        BloqueLapizBajar bloque = new BloqueLapizBajar();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizAbajo);

    }
}