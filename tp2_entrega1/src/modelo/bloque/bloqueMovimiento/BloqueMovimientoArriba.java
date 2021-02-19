package modelo.bloque.bloqueMovimiento;

import modelo.direccion.DireccionAbajo;
import modelo.direccion.DireccionArriba;

public class BloqueMovimientoArriba extends BloqueMovimiento {

    public  BloqueMovimientoArriba(){
        this.direccion = new DireccionArriba();
        this.direcccionOpuesta = new DireccionAbajo();
    }

}
