package linea;

import coordenadas.Coordenada;
import junit.framework.TestCase;

public class LineaConstructorTest extends TestCase {
    public void testConstructor(){
        Coordenada inicio = new Coordenada();
        Coordenada fin = new Coordenada();
        fin.moverDerecha();
        Linea linea = new Linea(inicio, fin);

        assertEquals( inicio, linea.getInicio());
        assertEquals( fin, linea.getFin());
    }



}