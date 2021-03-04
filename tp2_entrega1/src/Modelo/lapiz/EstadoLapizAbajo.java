package Modelo.lapiz;//package com.company;

import Modelo.coordenas.Coordenada;
import Modelo.linea.Linea;
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

    private void asignarImagenes(ImageView derecha, ImageView izquierda, ImageView arriba, ImageView abajo){
        derecha.setImage(mitadHDer);
        derecha.setFitWidth(width);
        derecha.setPreserveRatio(true);
        izquierda.setImage(mitadHIzq);
        izquierda.setFitWidth(width);
        izquierda.setPreserveRatio(true);
        arriba.setImage(mitadVAr);
        arriba.setFitWidth(width);
        arriba.setPreserveRatio(true);
        abajo.setImage(mitadVAb);
        abajo.setFitWidth(width);
        abajo.setPreserveRatio(true);
    }


    public void dibujarSobreLaGrilla(Coordenada desde, Coordenada hasta){
        ImageView derecha = new ImageView();
        ImageView izquierda = new ImageView();
        ImageView arriba = new ImageView();
        ImageView abajo = new ImageView();
        asignarImagenes(derecha, izquierda, arriba, abajo);

       int x = calcularPosicionGrillaX(desde, hasta);
       int y = calcularPosicionGrillaY(desde, hasta);


        if(x==1){
            grid.add(izquierda, 2+desde.getX(), 2-desde.getY());
            grid.add(derecha, 2+hasta.getX(), 2-hasta.getY());
       }else if(x==-1){
            grid.add(derecha, 2+desde.getX(), 2-desde.getY());
            grid.add(izquierda, 2+hasta.getX(), 2-hasta.getY());
       }else if(y==1){
            grid.add(abajo, 2+desde.getX(), 2-desde.getY());
            grid.add(arriba, 2+hasta.getX(), 2-hasta.getY());
        }else if(y==-1){
            grid.add(arriba, 2+desde.getX(), 2-desde.getY());
            grid.add(abajo, 2+hasta.getX(), 2-hasta.getY());
        }

    }
}