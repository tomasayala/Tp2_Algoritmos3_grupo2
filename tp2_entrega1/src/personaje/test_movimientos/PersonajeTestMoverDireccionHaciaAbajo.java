package personaje.test_movimientos;

import direccion.DireccionAbajo;
import junit.framework.TestCase;
import personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class PersonajeTestMoverDireccionHaciaAbajo extends TestCase {

    public void testMoverDireccion() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        DireccionAbajo direccion = new DireccionAbajo();
        int y_viejo = personaje.getCoordenada().getY();

        personaje.moverDireccion(direccion);

        assertEquals( y_viejo -1, personaje.getCoordenada().getY());
    }
}

