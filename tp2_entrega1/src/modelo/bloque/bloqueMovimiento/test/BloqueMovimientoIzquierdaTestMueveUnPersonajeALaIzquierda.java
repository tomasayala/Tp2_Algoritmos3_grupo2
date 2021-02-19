package modelo.bloque.bloqueMovimiento.test;

import modelo.bloque.bloqueMovimiento.BloqueMovimientoIzquierda;
import junit.framework.TestCase;
import modelo.personaje.Personaje;
import modelo.tablero_dibujo.SectorDibujo;

public class BloqueMovimientoIzquierdaTestMueveUnPersonajeALaIzquierda extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje(){
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        BloqueMovimientoIzquierda bloque = new BloqueMovimientoIzquierda();
        int x_viejo = personaje.getCoordenada().getX();


        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals( x_viejo -1, personaje.getCoordenada().getX());

    }

}