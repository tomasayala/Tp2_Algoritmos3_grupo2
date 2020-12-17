package personaje.test_movimientos;

import direccion.DireccionArriba;
import junit.framework.TestCase;
import personaje.Personaje;

public class PersonajeTestMoverDireccionHaciaArriba extends TestCase {

    public void testMoverDireccion() {
        Personaje personaje = new Personaje();
        DireccionArriba direccion = new DireccionArriba();
        int y_viejo = personaje.getCoordenada().getY();

        personaje.moverDireccion(direccion);

        assertEquals( y_viejo +1, personaje.getCoordenada().getY());
    }
}