package modelo.personaje.test_movimientos;

import modelo.coordenas.Coordenada;
import modelo.direccion.DireccionDerecha;
import junit.framework.TestCase;
import modelo.personaje.Personaje;
import modelo.tablero_dibujo.SectorDibujo;

public class PersonajeTestMoverHaciaLaDerechaConUnLapizLevantadoNoDibujaUnaLinea extends TestCase {

    public void testMoverDireccion() {
        SectorDibujo tablero = new SectorDibujo();
        Personaje personaje = new Personaje(tablero);
        DireccionDerecha direccionDerecha = new DireccionDerecha();
        int x_coordenada_vieja = personaje.getCoordenada().getX();

        personaje.moverDireccion( direccionDerecha);

        Coordenada coordenada_nueva = personaje.getCoordenada();
        assertEquals( x_coordenada_vieja+1,  coordenada_nueva.getX());
    }
}