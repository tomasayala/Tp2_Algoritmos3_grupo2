package bloque.bloqueMovimiento;

import direccion.DireccionAbajo;
import direccion.DireccionArriba;

public class BloqueMovimientoAbajo extends BloqueMovimiento {

    public BloqueMovimientoAbajo(){
        this.direccion = new DireccionAbajo();
        this.direcccionOpuesta = new DireccionArriba();
    }


}
