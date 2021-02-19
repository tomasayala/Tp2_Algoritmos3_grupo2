package modelo.bloque.bloqueDeInversion.test;

import modelo.bloque.bloqueDeInversion.BloqueDeInversion;
import modelo.bloque.bloqueDeRepeticion.BloqueDeRepeticion;
import modelo.bloque.bloqueMovimiento.BloqueMovimientoArriba;
import modelo.bloque.bloqueMovimiento.BloqueMovimientoIzquierda;
import modelo.bloque.bloquesdeLapiz.BloqueLapizSubir;
import junit.framework.TestCase;
import modelo.lapiz.EstadoLapizAbajo;
import modelo.personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class bloqueDeInversionTest extends TestCase {
    SectorDibujo tablero = new SectorDibujo();
    Personaje personaje = new Personaje(tablero);

    public void testBloqueDeInversionMueveCorrectamenteAlPersonajeEjeY(){
        int posY = -1;
        BloqueDeInversion bloque = new BloqueDeInversion();

        bloque.agregarBloque(new BloqueMovimientoArriba());

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(posY, personaje.getCoordenada().getY());
    }

    public void testBloqueDeInversionMueveCorrectamenteAlPersonajeEjeX(){
        int posX = 1;
        BloqueDeInversion bloque = new BloqueDeInversion();

        bloque.agregarBloque(new BloqueMovimientoIzquierda());

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(posX, personaje.getCoordenada().getX());
    }

    public void testBloqueDeInversionDentroDeOtroMueveDeManeraCorrectaAlPersonaje(){
        BloqueDeInversion invertido = new BloqueDeInversion();
        BloqueDeInversion bloque = new BloqueDeInversion();

        bloque.agregarBloque(new BloqueMovimientoArriba());

        invertido.agregarBloque(bloque);

        invertido.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(1, personaje.getCoordenada().getY());
    }

    public void testBloqueDeInversionDentroDeBloqueDeRepeticionSeEjecutaCorrectamente(){
        BloqueDeInversion bloque = new BloqueDeInversion();
        BloqueDeRepeticion loop = new BloqueDeRepeticion(3);

        bloque.agregarBloque(new BloqueMovimientoArriba());
        bloque.agregarBloque(new BloqueMovimientoIzquierda());
        loop.agregarBloque(bloque);

        loop.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(-3, personaje.getCoordenada().getY());
        assertEquals(3, personaje.getCoordenada().getX());
    }

    public void testBloqueDeInversionInvierteUnLapizCorrecamente(){
        BloqueDeInversion bloque = new BloqueDeInversion();

        bloque.agregarBloque(new BloqueLapizSubir());

        bloque.ejecutarInstruccionSobrePersonaje(personaje);

        assertTrue( personaje.getLapiz().getEstado() instanceof EstadoLapizAbajo);
    }
}
