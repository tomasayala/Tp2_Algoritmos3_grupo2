package lapiz;

import coordenadas.Coordenada;
import tablero_dibujo.SectorDibujo;

public abstract class EstadoLapiz {
    public abstract int dibujarLineaSobreElTablero(Coordenada principio, Coordenada fin, SectorDibujo tableroDeDibujo);

}
