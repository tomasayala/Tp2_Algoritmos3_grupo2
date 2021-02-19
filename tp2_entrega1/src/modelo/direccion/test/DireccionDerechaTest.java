package modelo.direccion.test;

import modelo.coordenas.Coordenada;
import modelo.direccion.DireccionDerecha;
import junit.framework.TestCase;

public class DireccionDerechaTest extends TestCase {

    public void testAplicarMovimiento() {
        Coordenada coordenada = new Coordenada();
        DireccionDerecha direccionDerecha = new DireccionDerecha();
        int x_viejo = coordenada.getX();

        direccionDerecha.aplicarMovimiento(coordenada);

        assertEquals( x_viejo+1, coordenada.getX());
    }
}