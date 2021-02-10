package lapiz.test;

import coordenadas.Coordenada;
import junit.framework.TestCase;
import lapiz.EstadoLapizAbajo;
import lapiz.Lapiz;
import personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class LapizTestEstadoBajado extends TestCase {
    private SectorDibujo tablero = new SectorDibujo();
    private Personaje personaje = new Personaje(tablero);

    public void testUnLapizNoSeCreaConEstadoBajado(){
        Lapiz lapiz = new Lapiz(tablero);

        assertNotSame( new EstadoLapizAbajo(), lapiz.getEstado());
    }

    public void testUnPersonajeSeCreaConUnLapizQueNoEstaBajado(){
        Lapiz lapiz = personaje.getLapiz();

        assertNotSame( new EstadoLapizAbajo(), lapiz.getEstado());
    }

    public void testDibujarConUnLapizBajadoDibujaUnaLinea(){
        Lapiz lapiz = new Lapiz(tablero);
        Coordenada c1 = new Coordenada();
        Coordenada c2 = new Coordenada(1,2);
        lapiz.bajarLapiz();

        assertEquals(1, lapiz.dibujarLinea(c1,c2));
    }

}