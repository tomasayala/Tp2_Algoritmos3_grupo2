package Vista;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Character extends Pane {
    private ImageView view;
    private Image image;
    private int height = 50;
    private int width = 32;
    private GridPane grid;

    public Character(GridPane gridPane){
        grid = gridPane;
        view = new ImageView();
    }

    public void agregarImagen(){
        image = new Image("Vista/lapiz.png");
        view.setImage(image);
        view.setFitHeight(height);
        view.setFitWidth(width);
        grid.add(view, 5, 5);
    }

}
