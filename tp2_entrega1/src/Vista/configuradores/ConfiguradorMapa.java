package Vista.configuradores;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class ConfiguradorMapa {
    public void configurarGridPane(GridPane mapa) {
        mapa.setHgap(5);
        mapa.setVgap(5);
        mapa.setPadding(new Insets(10, 10, 10, 10));
    }
}
