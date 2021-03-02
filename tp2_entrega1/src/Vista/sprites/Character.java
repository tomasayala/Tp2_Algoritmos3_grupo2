package Vista.sprites;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.concurrent.TimeUnit;

public class Character extends Pane {
    private ImageView view;
    private Image image;
    private int width = 90;
    private int imageWidth = 90;
    private GridPane grid;
    private int coorX = 2;
    private int coorY = 2;
    private Image prueba = new Image("Vista/sprites/lineaH.png");
    private ImageView algo = new ImageView();

    public Character(GridPane gridPane){
        grid = gridPane;
        view = new ImageView();
    }

    public void agregarImagen(){
        image = new Image("Vista/sprites/lapiz.png");
        view.setImage(image);
        view.setFitWidth(width);
        view.setPreserveRatio(true);
        algo.setImage(prueba);
        algo.setFitWidth(imageWidth);
        algo.setPreserveRatio(true);
        grid.add(algo, coorX, coorY);
        grid.add(view, coorY, coorX);
    }

    public void delayUnSegundo(){
        try { TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException ex){}
    }


    public void moverPersonaje(int x, int y){
        coorX = 2 - x;
        coorY = 2 + y;
        grid.setColumnIndex(view, coorY);
        grid.setRowIndex(view, coorX);
        coorX = 0;
        coorY = 0;
    }

}
