package personaje.test_movimientos;

import coordenadas.Coordenada;
import direccion.DireccionDerecha;
import junit.framework.TestCase;
import personaje.Personaje;

public class PersonajeTestMoverHaciaLaDerechaConUnLapizLevantadoNoDibujaUnaLinea extends TestCase {

    public void testMoverDireccion() {
        Personaje personaje = new Personaje();
        DireccionDerecha direccionDerecha = new DireccionDerecha();
        int x_coordenada_vieja = personaje.getCoordenada().getX();

        personaje.moverDireccion( direccionDerecha);

        Coordenada coordenada_nueva = personaje.getCoordenada();
        assertEquals( x_coordenada_vieja+1,  coordenada_nueva.getX());
    }
}