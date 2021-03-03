package Modelo.lapiz;//package com.company;

import Modelo.coordenas.Coordenada;
import Modelo.linea.Linea;
import Modelo.personaje.Personaje;
import Modelo.tablero_dibujo.SectorDibujo;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

import java.util.ArrayList;

public class EstadoLapizAbajo extends EstadoLapiz{
    private Image mitadHDer = new Image("Vista/sprites/mediaLineaHDer.png");
    private Image mitadHIzq = new Image("Vista/sprites/mediaLineaHIzq.png");
    private Image mitadVAr = new Image("Vista/sprites/mediaLineaVArriba.png");
    private Image mitadVAb = new Image("Vista/sprites/mediaLineaVAbajo.png");
    private int width = 90;
    private GridPane grid;


    @Override
    public int dibujarLineaSobreElTablero(Coordenada desde, Coordenada hasta, SectorDibujo tableroDeDibujo){
        Linea linea = new Linea(desde, hasta);
        tableroDeDibujo.agregarLinea(linea);
        dibujarSobreLaGrilla(desde, hasta);
        return 1;
    }

    public void setGrid(GridPane grilla){
        grid = grilla;
    }

    private int calcularPosicionGrillaX(Coordenada desde, Coordenada hasta){
        int desdeX = desde.getX();
        int hastaX = hasta.getX();
        return hastaX-desdeX;
    }

    private int calcularPosicionGrillaY(Coordenada desde, Coordenada hasta){
        int desdeY = desde.getY();
        int hastaY = hasta.getY();
        return hastaY-desdeY;
    }

    private void dibujarSobreLaGrilla(Coordenada desde, Coordenada hasta){
        ImageView Derecha = new ImageView();
        ImageView Izquierda = new ImageView();
        ImageView Arriba = new ImageView();
        ImageView Abajo = new ImageView();
        Derecha.setImage(mitadHDer);
        Derecha.setFitWidth(width);
        Derecha.setPreserveRatio(true);
        Izquierda.setImage(mitadHIzq);
        Izquierda.setFitWidth(width);
        Izquierda.setPreserveRatio(true);
        Arriba.setImage(mitadVAr);
        Arriba.setFitWidth(width);
        Arriba.setPreserveRatio(true);
        Abajo.setImage(mitadVAb);
        Abajo.setFitWidth(width);
        Abajo.setPreserveRatio(true);


       int x = calcularPosicionGrillaX(desde, hasta);
       int y = calcularPosicionGrillaY(desde, hasta);


        if(x==1){
            grid.add(Izquierda, 2+desde.getX(), 2-desde.getY());
            grid.add(Derecha, 2+hasta.getX(), 2-hasta.getY());
       }else if(x==-1){
            grid.add(Derecha, 2+desde.getX(), 2-desde.getY());
            grid.add(Izquierda, 2+hasta.getX(), 2-hasta.getY());
       }else if(y==1){
            grid.add(Abajo, 2+desde.getX(), 2-desde.getY());
            grid.add(Arriba, 2+hasta.getX(), 2-hasta.getY());
        }else if(y==-1){
            grid.add(Arriba, 2+desde.getX(), 2-desde.getY());
            grid.add(Abajo, 2+hasta.getX(), 2-hasta.getY());
        }

    }
}