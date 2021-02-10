package bloque.bloqueDeRepeticion;

import bloque.Bloque;
import personaje.Personaje;

import java.util.ArrayList;

public class BloqueDeRepeticion implements Bloque {

    private int cantidadDeCiclos;
    private ArrayList ciclo;

    public BloqueDeRepeticion(int repeticiones) {
        // Posiblemente haya que armar exepciones por si pasan numeros fuera de 2 o 3
        this.cantidadDeCiclos = repeticiones;
        this.ciclo = new ArrayList();
    }

    public void agregarBloque(Bloque bloqueNuevo) {
        ciclo.add(bloqueNuevo);
    }

    @Override
    public void ejecutarInstruccionSobrePersonaje(Personaje personaje) {
        ejecutarSecunciaDeBloquesRepetidasSobreElPersonaje(personaje);
    }


    // Devuelve un int con propositos de testeo, en teoria son la cantidad de veces que se recorre cada bloque con el
    // ciclo pero no devuelve el numero correcto si hay bloques de repeticion anidados
    public int ejecutarSecunciaDeBloquesRepetidasSobreElPersonaje(Personaje personaje) {
        for (int i = 0; i < cantidadDeCiclos; i++)
            ejecutarSecuenciaDeIntruccionesDelCiclo(ciclo, personaje);
        return cantidadDeCiclos * ciclo.size();
    }

    /*
    La razon por la cual el for each loop esta dentro de este metodo es debido a que necesitaba que la lista
    extendiera la interfaz de bloque. De lo contrario, no iba a entenderlo y no permitia la ejecucion de las pruebas
    para eso esta el <? extends Bloque>. Ya de por si la ArrayList permite almacenar Objetos
    */
    private void ejecutarSecuenciaDeIntruccionesDelCiclo(ArrayList<? extends Bloque> ciclo, Personaje personaje) {
        for (Bloque bloque : ciclo)
            bloque.ejecutarInstruccionSobrePersonaje(personaje);
    }

    //Faltan pruebas
    @Override
    public void ejecutarInstruccionOpuestaSobrePersonaje(Personaje personaje){
        ejecutarSecuenciaDeInstruccionesOpuestasSobreElPersonaje(personaje);
    }

    public void ejecutarSecuenciaDeInstruccionesOpuestasSobreElPersonaje(Personaje personaje){
        for (int i = 0; i < cantidadDeCiclos; i++) {
            ejecutarInstruccionesOpuestasDelCiclo(ciclo, personaje);
        }
    }

    public void ejecutarInstruccionesOpuestasDelCiclo(ArrayList <? extends Bloque> ciclo, Personaje personaje){
        for (Bloque bloque: ciclo)
            bloque.ejecutarInstruccionOpuestaSobrePersonaje(personaje);
    }
}
