package modelo.bloque.bloqueSecuenciaGuardada.test;

import modelo.bloque.Bloque;
import modelo.bloque.bloqueDeInversion.BloqueDeInversion;
import modelo.bloque.bloqueDeRepeticion.BloqueDeRepeticion;
import modelo.bloque.bloqueMovimiento.BloqueMovimientoAbajo;
import modelo.bloque.bloqueMovimiento.BloqueMovimientoArriba;
import modelo.bloque.bloqueMovimiento.BloqueMovimientoDerecha;
import modelo.bloque.bloqueMovimiento.BloqueMovimientoIzquierda;
import modelo.bloque.bloqueSecuenciaGuardada.BloqueSecuenciaGuardada;
import junit.framework.TestCase;
import modelo.personaje.Personaje;
import modelo.tablero_dibujo.SectorDibujo;

import java.util.ArrayList;

public class BloqueSecuenciaGuardadaTest extends TestCase {

    SectorDibujo tablero =  new SectorDibujo();
    Personaje personaje = new Personaje(tablero);
    ArrayList <Bloque> secuenciaAGuardar= new ArrayList<Bloque>();

    public void testConstructorDeBloqueSecuenciaGuardadaSeConstruyeConLaCantidadDeBloquesQueHabiaDentroDeLaSecunciaInicial(){
        secuenciaAGuardar.add(new BloqueMovimientoArriba());
        BloqueSecuenciaGuardada algoritmoGuardado = new BloqueSecuenciaGuardada( secuenciaAGuardar, "prueba");

        assertEquals(1, algoritmoGuardado.tamanioAlgoritmo());
    }

    public void testConstructorDelBloqueSecuendciaGuardadaConstruyeConElNombrePasado(){
        secuenciaAGuardar.add(new BloqueMovimientoArriba());
        BloqueSecuenciaGuardada algoritmo2 = new BloqueSecuenciaGuardada( secuenciaAGuardar, "Hola Mundo");

        assertEquals("Hola Mundo", algoritmo2.getNombre());
    }

    public void testSeEjecutanCorrectamenteUnaInstruccionesGuardadasDentroDelBloqueEnElEjeY(){
        secuenciaAGuardar.add(new BloqueMovimientoArriba());
        BloqueSecuenciaGuardada ejeY = new BloqueSecuenciaGuardada(secuenciaAGuardar, "Eje y");

        ejeY.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(1, personaje.getCoordenada().getY());
    }

    public void testSeEjecutanCorrectamenteUnaInstruccionGuardadaDentroDelBloqueEnELEjeX(){
        secuenciaAGuardar.add(new BloqueMovimientoDerecha());
        BloqueSecuenciaGuardada ejeX = new BloqueSecuenciaGuardada( secuenciaAGuardar, "Eje x");

        ejeX.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(1, personaje.getCoordenada().getX());
    }

    public void testSeEjecutaLaInstruccionOpuestaALaQueEstaGuardadaDentroDelBloque(){
        secuenciaAGuardar.add(new BloqueMovimientoAbajo());
        BloqueSecuenciaGuardada invertidoY = new BloqueSecuenciaGuardada(secuenciaAGuardar, "Invertido eje Y");

        invertidoY.ejecutarInstruccionOpuestaSobrePersonaje(personaje);

        assertEquals(1, personaje.getCoordenada().getY());
    }

    public void testSeEjecutaLaSecuenciaVariasVecesCuandoEstaGuardadaDentroDeUnBloqueDeRepeticion(){
        BloqueDeRepeticion ciclo = new BloqueDeRepeticion(2);
        secuenciaAGuardar.add(new BloqueMovimientoIzquierda());
        BloqueSecuenciaGuardada moverseizquierda = new BloqueSecuenciaGuardada(secuenciaAGuardar, "izquierda x 2");

        ciclo.agregarBloque(moverseizquierda);

        ciclo.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(-2, personaje.getCoordenada().getX());
    }

    public void testSeEjecutaLaInstruccionOpuestaALaGuardadaCuandoSeEstaDentroDeUnBloqueDeInversion(){
        BloqueDeInversion inversion = new BloqueDeInversion();
        secuenciaAGuardar.add(new BloqueMovimientoArriba());
        BloqueSecuenciaGuardada moverseArriba = new BloqueSecuenciaGuardada(secuenciaAGuardar, "moverseArriba");

        inversion.agregarBloque(moverseArriba);
        inversion.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(-1, personaje.getCoordenada().getY());
    }

    public void testSeEjecutaUnAlgoritmoGuardadaQueContieneUnCicloExitosamente(){
        BloqueDeRepeticion ciclo = new BloqueDeRepeticion(2);
        ciclo.agregarBloque(new BloqueMovimientoArriba());
        secuenciaAGuardar.add(new BloqueMovimientoArriba());
        secuenciaAGuardar.add(ciclo);
        BloqueSecuenciaGuardada moverseConCiclo = new BloqueSecuenciaGuardada(secuenciaAGuardar, "moverse 3 veces arriba");

        moverseConCiclo.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(3, personaje.getCoordenada().getY());
    }

    public void testSeEjecutaUnAlgoritmoGuardadoQueContieneUnBloqueDeInversion(){
        BloqueDeInversion invertido = new BloqueDeInversion();
        invertido.agregarBloque(new BloqueMovimientoArriba());
        invertido.agregarBloque(new BloqueMovimientoArriba());
        secuenciaAGuardar.add( new BloqueMovimientoArriba());
        secuenciaAGuardar.add(invertido);
        BloqueSecuenciaGuardada algoritmo = new BloqueSecuenciaGuardada(secuenciaAGuardar, "Un paso adelaante, dos atras");

        algoritmo.ejecutarInstruccionSobrePersonaje(personaje);

        assertEquals(-1, personaje.getCoordenada().getY());
    }


}