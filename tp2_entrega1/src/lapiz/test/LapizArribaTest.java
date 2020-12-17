package lapiz.test;

import junit.framework.TestCase;
import lapiz.LapizArriba;

public class LapizArribaTest extends TestCase {

    public void testDibujarLinea() {
        LapizArriba lapizArriba = new LapizArriba();

        assertEquals( lapizArriba.dibujarLinea(), 0); // Con proposito de testeos el mensaje devuelve 0
    }
}