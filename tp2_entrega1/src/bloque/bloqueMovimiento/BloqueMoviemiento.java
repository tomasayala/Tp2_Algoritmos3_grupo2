package bloque.bloqueMovimiento;

import bloque.Bloque;
import direccion.Direccion;
import personaje.Personaje;

public abstract class BloqueMoviemiento implements Bloque{

    Direccion direccion;

    @Override
    public abstract void ejecutarInstruccionSobrePersonaje(Personaje personaje);

}
