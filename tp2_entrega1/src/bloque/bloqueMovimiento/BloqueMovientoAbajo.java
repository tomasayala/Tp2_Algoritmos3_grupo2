package bloque.bloqueMovimiento;

import direccion.DireccionAbajo;
import personaje.Personaje;

public class BloqueMovientoAbajo extends BloqueMoviemiento {

    public BloqueMovientoAbajo(){
        this.direccion = new DireccionAbajo();
    }

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        personaje.moverDireccion(direccion);
    }

}
