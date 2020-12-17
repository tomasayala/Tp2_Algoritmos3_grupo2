package personaje.test_movimientos;

import direccion.DireccionAbajo;
import junit.framework.TestCase;
import personaje.Personaje;

public class PersonajeTestMoverDireccionHaciaAbajo extends TestCase {

    public void testMoverDireccion() {
        Personaje personaje = new Personaje();
        DireccionAbajo direccion = new DireccionAbajo();
        int y_viejo = personaje.getCoordenada().getY();

        personaje.moverDireccion(direccion);

        assertEquals( y_viejo -1, personaje.getCoordenada().getY());
    }
}

