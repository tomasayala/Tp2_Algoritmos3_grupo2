package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;

public class ConfiguradorLeftMenu {
    public void configurarListView(ListView<String> leftMenu) {
        ObservableList<String> nombreDeBloques = FXCollections.observableArrayList("Julia", "Marcola", "Gabi", "Abril", "Riedel");
        leftMenu.setItems(nombreDeBloques);
        nombreDeBloques.add("Nico");
        leftMenu.getItems().add("TomyDios");
    }
}
