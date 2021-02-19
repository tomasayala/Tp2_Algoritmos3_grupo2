package tablero_dibujo.test;

import modelo.direccion.Direccion;
import modelo.direccion.DireccionAbajo;
import junit.framework.TestCase;
import modelo.personaje.Personaje;
import tablero_dibujo.SectorDibujo;

public class SectorDibujoTestMoverPersonajeCuandoSoloRecibeLaDireccion extends TestCase {
    private Direccion direccion = new DireccionAbajo();

    public void testMoverPersonaje(){
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        personaje.moverDireccion( direccion);

        assertEquals( personaje.getCoordenada(), tablero.getCoordenadaPersonaje());
        //Ojo este assert da true por lo tanto los parametros que siempre se pasan son referencias
        //assertSame(personaje.getCoordenada(), tablero.getCoordenadaPersonaje());
    }

    public void testMoverElPersonajeConUnLapizLevantadoNoDibujaUnaLineaEnElSector(){
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        personaje.moverDireccion(direccion);


        assertEquals(0, tablero.cantidadDeLineasDibujadas());
    }

    public  void testMoverElPersonajeConUnLapizBajadoDibujaUnaLineaEnElSector(){
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        personaje.bajarLapiz();
        personaje.moverDireccion(direccion);

        assertEquals( 1, tablero.cantidadDeLineasDibujadas());
    }
}