package bloque.bloqueDeInversion;

import bloque.Bloque;
import personaje.Personaje;

import java.util.ArrayList;

public class BloqueDeInversion implements Bloque {
    private ArrayList conjuntoDeBloques;
    
    public BloqueDeInversion(){
        this.conjuntoDeBloques = new ArrayList();
    }

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        ejecutarInstruccionesOpuestasDelConjuntoDeBloques( conjuntoDeBloques, personaje);
    }
    private void ejecutarInstruccionesOpuestasDelConjuntoDeBloques(
            ArrayList <? extends Bloque> bloquesAInvertir, Personaje personaje){
        for( Bloque bloque: bloquesAInvertir)
            bloque.ejecutarInstruccionOpuestaSobrePersonaje(personaje);
    }

    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje) {
        //ejecutarInstruccionesOpuestasDelConjuntoDeBloques(conjuntoDeBloques, personaje);
        ejecutarInstruccionesDelConjunto(conjuntoDeBloques, personaje);
    }
    // Hay que hacerle test
    private void ejecutarInstruccionesDelConjunto( ArrayList <? extends Bloque> bloquesAEjecutar, Personaje personaje){
        for ( Bloque bloque: bloquesAEjecutar)
            bloque.ejecutarInstruccionOpuestaSobrePersonaje( personaje);
    }
}
