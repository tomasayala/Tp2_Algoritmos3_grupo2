package modelo.personaje.test_subir_y_bajar_lapiz;

import junit.framework.TestCase;
import modelo.lapiz.EstadoLapizArriba;
import modelo.personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class PersonajeTestSubirLapizDevuelveUnLapizLevantado extends TestCase {

    public void testSubirLapiz() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);

        personaje.subirLapiz();

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizArriba);
    }
}