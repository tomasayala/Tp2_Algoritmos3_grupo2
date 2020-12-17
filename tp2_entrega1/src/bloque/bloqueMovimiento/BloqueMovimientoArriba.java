package bloque.bloqueMovimiento;

import direccion.DireccionArriba;
import personaje.Personaje;

public class BloqueMovimientoArriba extends BloqueMoviemiento{

    public  BloqueMovimientoArriba(){
        this.direccion = new DireccionArriba();
    }

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        personaje.moverDireccion(direccion);
    }
}
