package Modelo.coordenas;

//package tp2_entrega1;
public class Coordenada {
    private int x;
    private int y;

    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }
    // Constructor para pruebas debe desaparecer
    public Coordenada(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Coordenada (Coordenada coordenada){
        this.x = coordenada.getX();
        this.y = coordenada.getY();
    }

    public void moverIzquierda(){
       if(this.x > -2){
           this.x -= 1;
       }
    }

    public void moverDerecha(){
        if(this.x < 2) {
            this.x += 1;
        }
    }

    public void moverArriba(){
        if(this.y < 2) {
            this.y += 1;
        }
    }

    public void moverAbajo(){
        if(this.y > -2) {
            this.y -= 1;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
