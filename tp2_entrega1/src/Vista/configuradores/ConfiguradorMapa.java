package Vista.configuradores;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class ConfiguradorMapa {
    int longitud = 5;
    public void configurarGridPane(GridPane mapa) {
        for(int i = 0; i < longitud; i++){
            for(int j = 0; j < longitud; j++){
                mapa.add(new Rectangle(90, 90, Color.TRANSPARENT), i, j);
            }
        }
    }
}
