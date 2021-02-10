package bloque.bloqueMovimiento.test;

import bloque.bloqueMovimiento.BloqueMovimientoDerecha;
import junit.framework.TestCase;
import personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class BloqueMovimientoDerechaTestMueveElPersonajeALaDerecha extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje(){
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        BloqueMovimientoDerecha bloque = new BloqueMovimientoDerecha();
        int x_viejo = personaje.getCoordenada().getX();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals( x_viejo +1, personaje.getCoordenada().getX());
    }
}