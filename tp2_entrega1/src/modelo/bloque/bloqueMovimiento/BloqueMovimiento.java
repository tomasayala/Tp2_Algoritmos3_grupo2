package modelo.bloque.bloqueMovimiento;

import modelo.bloque.Bloque;
import modelo.direccion.Direccion;
import modelo.personaje.Personaje;

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
