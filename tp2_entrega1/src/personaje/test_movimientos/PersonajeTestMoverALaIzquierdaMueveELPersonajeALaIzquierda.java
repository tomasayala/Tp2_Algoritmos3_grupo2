package personaje.test_movimientos;

import direccion.DireccionIzquierda;
import junit.framework.TestCase;
import personaje.Personaje;

public class PersonajeTestMoverALaIzquierdaMueveELPersonajeALaIzquierda extends TestCase {

    public void testMoverDireccion() {
        Personaje personaje = new Personaje();
        DireccionIzquierda direccion = new DireccionIzquierda();
        int x_coordenada_vieja = personaje.getCoordenada().getX();

        personaje.moverDireccion(direccion);

        assertEquals( x_coordenada_vieja -1, personaje.getCoordenada().getX());
    }
}