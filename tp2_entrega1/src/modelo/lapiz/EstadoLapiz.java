package modelo.lapiz;

import modelo.coordenas.Coordenada;
import modelo.tablero_dibujo.SectorDibujo;

public abstract class EstadoLapiz {
    public abstract int dibujarLineaSobreElTablero(Coordenada principio, Coordenada fin, SectorDibujo tableroDeDibujo);

}
