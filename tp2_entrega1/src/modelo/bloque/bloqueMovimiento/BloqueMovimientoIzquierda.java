package modelo.bloque.bloqueMovimiento;

import modelo.direccion.DireccionDerecha;
import modelo.direccion.DireccionIzquierda;

public class BloqueMovimientoIzquierda extends BloqueMovimiento {

    public BloqueMovimientoIzquierda(){
        this.direccion = new DireccionIzquierda();
        this.direcccionOpuesta = new DireccionDerecha();
    }

}
