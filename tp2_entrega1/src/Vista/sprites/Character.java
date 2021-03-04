package Vista.sprites;

import javafx.animation.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import java.util.concurrent.TimeUnit;

public class Character extends Pane {
    private ImageView view;
    private Image image;
    private int width = 90;
    private GridPane grid;
    private int coorX = 2;
    private int coorY = 2;

    public Character(GridPane gridPane){
        grid = gridPane;
        view = new ImageView();
        agregarImagen();
    }

    private void agregarImagen(){
        image = new Image("Vista/sprites/lapiz.png");
        view.setImage(image);
        view.setFitWidth(width);
        view.setPreserveRatio(true);
        grid.add(view, coorY, coorX);
    }

    public void moverPersonaje(int x, int y){
        coorX = 2 - x;
        coorY = 2 + y;
        grid.setColumnIndex(view, coorY);
        grid.setRowIndex(view, coorX);
    }

}
