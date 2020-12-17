package lapiz.test;

import junit.framework.TestCase;
import lapiz.LapizAbajo;

public class LapizAbajoTest extends TestCase {

    public void testDibujarLinea() {
        LapizAbajo lapizAbajo = new LapizAbajo();
        // Con propositos de testeos lapiz abajo dibuja una linea por terminal y devuelve 1
        assertEquals( 1, lapizAbajo.dibujarLinea());
    }
}