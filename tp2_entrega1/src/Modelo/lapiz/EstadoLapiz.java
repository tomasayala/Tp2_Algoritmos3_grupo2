package Modelo.lapiz;

import Modelo.coordenas.Coordenada;
import Modelo.tablero_dibujo.SectorDibujo;
import javafx.scene.layout.GridPane;

public abstract class EstadoLapiz {
    public abstract int dibujarLineaSobreElTablero(Coordenada principio, Coordenada fin, SectorDibujo tableroDeDibujo);

    public abstract void setGrid(GridPane grilla);

    public abstract void dibujarSobreLaGrilla(Coordenada desde, Coordenada hasta);

}
