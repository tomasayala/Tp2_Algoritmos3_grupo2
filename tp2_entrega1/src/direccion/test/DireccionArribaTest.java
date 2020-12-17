package direccion.test;

import coordenadas.Coordenada;
import direccion.DireccionArriba;
import junit.framework.TestCase;

public class DireccionArribaTest extends TestCase {

    public void testAplicarMovimiento() {
        Coordenada coordenada = new Coordenada();
        DireccionArriba direccionArriba = new DireccionArriba();
        int y_viejo = coordenada.getY();

        direccionArriba.aplicarMovimiento(coordenada);

        assertEquals( y_viejo + 1, coordenada.getY());

    }
}