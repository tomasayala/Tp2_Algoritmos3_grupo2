package personaje.test_movimientos;

import direccion.DireccionArriba;
import junit.framework.TestCase;
import personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class PersonajeTestMoverDireccionHaciaArriba extends TestCase {

    public void testMoverDireccion() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        DireccionArriba direccion = new DireccionArriba();
        int y_viejo = personaje.getCoordenada().getY();

        personaje.moverDireccion(direccion);

        assertEquals( y_viejo +1, personaje.getCoordenada().getY());
    }
}