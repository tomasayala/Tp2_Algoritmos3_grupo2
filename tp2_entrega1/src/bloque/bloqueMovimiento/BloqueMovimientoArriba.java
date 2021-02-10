package bloque.bloqueMovimiento;

import direccion.DireccionAbajo;
import direccion.DireccionArriba;

public class BloqueMovimientoArriba extends BloqueMovimiento {

    public  BloqueMovimientoArriba(){
        this.direccion = new DireccionArriba();
        this.direcccionOpuesta = new DireccionAbajo();
    }

}
