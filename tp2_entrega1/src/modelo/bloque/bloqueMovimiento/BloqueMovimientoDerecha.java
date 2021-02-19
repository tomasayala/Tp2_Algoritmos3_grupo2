package modelo.bloque.bloqueMovimiento;

import modelo.direccion.DireccionDerecha;
import modelo.direccion.DireccionIzquierda;

public class BloqueMovimientoDerecha extends BloqueMovimiento {

    public BloqueMovimientoDerecha(){
        this.direccion = new DireccionDerecha();
        this.direcccionOpuesta = new DireccionIzquierda();
    }
}
