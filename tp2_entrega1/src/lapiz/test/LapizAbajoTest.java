package lapiz.test;

import coordenadas.Coordenada;
import junit.framework.TestCase;
import lapiz.LapizAbajo;

public class LapizAbajoTest extends TestCase {

    public void testDibujarLinea() {
        Coordenada inicio = new Coordenada();
        Coordenada fin = new Coordenada();
        fin.moverDerecha();
        LapizAbajo lapizAbajo = new LapizAbajo();
        // Con propositos de testeos lapiz abajo dibuja una linea por terminal y devuelve 1
        assertEquals( 1, lapizAbajo.dibujarLinea( inicio, fin));
    }
}