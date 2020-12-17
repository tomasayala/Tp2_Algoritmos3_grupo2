package coordenadas;

//package tp2_entrega1;
public class Coordenada {
    private int x;
    private int y;

    public Coordenada(){
        this.x = 0;
        this.y = 0;
    }

    public void moverIzquierda(){
        this.x -= 1;
    }

    public void moverDerecha(){
        this.x += 1;
    }

    public void moverArriba(){
        this.y += 1;
    }

    public void moverAbajo(){
        this.y -= 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
