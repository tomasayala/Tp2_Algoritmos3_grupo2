package bloque.bloqueMovimiento;

import direccion.DireccionDerecha;
import direccion.DireccionIzquierda;

public class BloqueMovimientoDerecha extends BloqueMovimiento {

    public BloqueMovimientoDerecha(){
        this.direccion = new DireccionDerecha();
        this.direcccionOpuesta = new DireccionIzquierda();
    }
}
