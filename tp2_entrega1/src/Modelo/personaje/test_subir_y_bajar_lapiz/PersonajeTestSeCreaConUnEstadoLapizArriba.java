package Modelo.personaje.test_subir_y_bajar_lapiz;

import junit.framework.TestCase;
import Modelo.lapiz.EstadoLapizArriba;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;

public class PersonajeTestSeCreaConUnEstadoLapizArriba extends TestCase {

    public void testSubirLapiz() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizArriba);
    }
}