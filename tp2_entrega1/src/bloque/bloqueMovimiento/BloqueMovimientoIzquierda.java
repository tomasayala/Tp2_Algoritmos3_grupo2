package bloque.bloqueMovimiento;

import direccion.DireccionDerecha;
import direccion.DireccionIzquierda;

public class BloqueMovimientoIzquierda extends BloqueMovimiento {

    public BloqueMovimientoIzquierda(){
        this.direccion = new DireccionIzquierda();
        this.direcccionOpuesta = new DireccionDerecha();
    }

}
