package linea;

import coordenadas.Coordenada;

public class Linea {
    private Coordenada inicio;
    private Coordenada fin;
    public Linea( Coordenada desde, Coordenada hasta){
        this.inicio = desde;
        this.fin = hasta;
    }

    // Metodos en un principio con fines de testeo
    public Coordenada getInicio() {
        return inicio;
    }

    public Coordenada getFin() {
        return fin;
    }
}
