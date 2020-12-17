package bloque.bloqueMovimiento;

import direccion.DireccionIzquierda;
import personaje.Personaje;

public class BloqueMovimientoIzquierda extends BloqueMoviemiento{

    public BloqueMovimientoIzquierda(){
        this.direccion = new DireccionIzquierda();
    }

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        personaje.moverDireccion(direccion);
    }
}
