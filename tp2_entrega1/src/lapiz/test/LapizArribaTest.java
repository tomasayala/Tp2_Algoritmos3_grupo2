package lapiz.test;

import coordenadas.Coordenada;
import junit.framework.TestCase;
import lapiz.LapizArriba;

public class LapizArribaTest extends TestCase {

    public void testDibujarLinea() {
        LapizArriba lapizArriba = new LapizArriba();
        Coordenada inicio = new Coordenada();
        Coordenada fin = new Coordenada();
        fin.moverDerecha();

        assertEquals( lapizArriba.dibujarLinea(inicio, fin), 0); // Con proposito de testeos el mensaje devuelve 0
    }
}