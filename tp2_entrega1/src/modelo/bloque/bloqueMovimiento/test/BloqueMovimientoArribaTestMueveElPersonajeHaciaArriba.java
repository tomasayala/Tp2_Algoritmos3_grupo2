package modelo.bloque.bloqueMovimiento.test;

import modelo.bloque.bloqueMovimiento.BloqueMovimientoArriba;
import junit.framework.TestCase;
import modelo.personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class BloqueMovimientoArribaTestMueveElPersonajeHaciaArriba extends TestCase {
    public void testEjecutarInstruccionSobrePersonaje(){
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        BloqueMovimientoArriba bloque = new BloqueMovimientoArriba();
        int y_viejo = personaje.getCoordenada().getY();

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals( y_viejo +1, personaje.getCoordenada().getY());
    }

}