package bloque.bloqueMovimiento.test;

import bloque.bloqueMovimiento.BloqueMovimientoIzquierda;
import junit.framework.TestCase;
import personaje.Personaje;

public class BloqueMovimientoIzquierdaTestMueveUnPersonajeALaIzquierda extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje(){
        Personaje personaje = new Personaje();
        BloqueMovimientoIzquierda bloque = new BloqueMovimientoIzquierda();
        int x_viejo = personaje.getCoordenada().getX();


        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals( x_viejo -1, personaje.getCoordenada().getX());

    }

}