package modelo.bloque.bloqueMovimiento;

import modelo.direccion.DireccionAbajo;
import modelo.direccion.DireccionArriba;

public class BloqueMovimientoAbajo extends BloqueMovimiento {

    public BloqueMovimientoAbajo(){
        this.direccion = new DireccionAbajo();
        this.direcccionOpuesta = new DireccionArriba();
    }


}
