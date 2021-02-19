package modelo.personaje.test_subir_y_bajar_lapiz;

import junit.framework.TestCase;
import modelo.lapiz.EstadoLapizArriba;
import modelo.personaje.Personaje;
import modelo.tablero_dibujo.SectorDibujo;

public class PersonajeTestSeCreaConUnEstadoLapizArriba extends TestCase {

    public void testSubirLapiz() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizArriba);
    }
}