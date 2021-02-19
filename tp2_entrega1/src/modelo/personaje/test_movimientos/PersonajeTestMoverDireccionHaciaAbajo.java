package modelo.personaje.test_movimientos;

import modelo.direccion.DireccionAbajo;
import junit.framework.TestCase;
import modelo.personaje.Personaje;
import modelo.tablero_dibujo.SectorDibujo;

public class PersonajeTestMoverDireccionHaciaAbajo extends TestCase {

    public void testMoverDireccion() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        DireccionAbajo direccion = new DireccionAbajo();
        int y_viejo = personaje.getCoordenada().getY();

        personaje.moverDireccion(direccion);

        assertEquals( y_viejo -1, personaje.getCoordenada().getY());
    }
}

