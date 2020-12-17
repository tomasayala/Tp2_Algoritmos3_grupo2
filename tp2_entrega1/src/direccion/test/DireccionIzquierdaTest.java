package direccion.test;

import coordenadas.Coordenada;
import direccion.DireccionIzquierda;
import junit.framework.TestCase;

public class DireccionIzquierdaTest extends TestCase {

    public void testAplicarMovimiento() {
        Coordenada coordenada = new Coordenada();
        DireccionIzquierda direccion =  new DireccionIzquierda();
        int x_viejo = coordenada.getX();

        direccion.aplicarMovimiento(coordenada);

        assertEquals( x_viejo-1, coordenada.getX());
    }
}