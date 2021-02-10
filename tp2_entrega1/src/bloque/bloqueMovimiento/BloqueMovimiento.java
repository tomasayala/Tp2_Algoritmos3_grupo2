package bloque.bloqueMovimiento;

import bloque.Bloque;
import direccion.Direccion;
import personaje.Personaje;

public abstract class BloqueMovimiento implements Bloque{

    Direccion direccion;
    Direccion direcccionOpuesta;

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje){
        personaje.moverDireccion(direccion);
    }
    //Falta sus pruebas
    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje){ personaje.moverDireccion(direcccionOpuesta);}
}
