package Vista.visibles;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.concurrent.TimeUnit;

public class Character extends Pane {
    private ImageView view;
    private Image image;
    private int width = 65;
    private GridPane grid;
    private int coorX = 2;
    private int coorY = 2;

    public Character(GridPane gridPane){
        grid = gridPane;
        view = new ImageView();
    }

    public void agregarImagen(){
        image = new Image("Vista/visibles/lapiz.png");
        view.setImage(image);
        view.setFitWidth(width);
        view.setPreserveRatio(true);
        grid.add(view, coorY, coorX);
    }

    private void delayUnSegundo(){
        try { TimeUnit.SECONDS.sleep(1);
        }catch (InterruptedException ex){}
    }


    public void moverPersonaje(int x, int y){
        coorX = 2 - x;
        coorY = 2 + y;
        grid.getChildren().remove(view);
        grid.add(view, coorY, coorX);
        coorX = 0;
        coorY = 0;
    }

}
