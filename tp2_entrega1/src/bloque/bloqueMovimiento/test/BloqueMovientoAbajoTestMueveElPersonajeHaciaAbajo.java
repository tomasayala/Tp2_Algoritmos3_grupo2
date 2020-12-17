package bloque.bloqueMovimiento.test;

import bloque.bloqueMovimiento.BloqueMovimientoAbajo;
import junit.framework.TestCase;
import personaje.Personaje;

public class BloqueMovientoAbajoTestMueveElPersonajeHaciaAbajo extends TestCase {

    public void testEjecutarInstruccionSobrePersonaje(){
        Personaje personaje = new Personaje();
        BloqueMovimientoAbajo bloque = new BloqueMovimientoAbajo();
        int y_viejo = personaje.getCoordenada().getY();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals( y_viejo-1, personaje.getCoordenada().getY());
    }

}