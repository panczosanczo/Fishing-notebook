package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;

public class TemplateController {

    @FXML
    Button button;
    @FXML
    TextField lenghtTextField;
    @FXML
    TextField trophyTextField;
    @FXML
    TableView<Trophy> trophyTableView;
    @FXML
    TableColumn<Trophy, Integer> lenghtColumn;
    @FXML
    TableColumn<Trophy, String> nameColumn;
    @FXML
    TableColumn<Trophy, Boolean> zdjecieColumn;
    @FXML
    BorderPane borderPane;

    private Main application;



    public void setApp(Main application) {
        this.application = application;

        TableColumn<Trophy, Integer> lenghtColumn = new TableColumn<>("xxx");

        lenghtColumn = new TableColumn<>();
        lenghtColumn.setCellValueFactory(new PropertyValueFactory<>("lenghtFish"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("typeFish"));
        zdjecieColumn.setCellValueFactory(new PropertyValueFactory<>("zdjecie"));

        trophyTableView.setItems(getTrophies());
        trophyTableView.getColumns().addAll(lenghtColumn, nameColumn, zdjecieColumn);

        borderPane.getChildren().addAll(trophyTableView);

    }


    public ObservableList<Trophy> getTrophies() {


        ObservableList<Trophy> trophies = FXCollections.observableArrayList();
        trophies.add(new Trophy(66, "Szczupak", true));
        trophies.add(new Trophy(23, "Okoń", false));
        trophies.add(new Trophy(87, "Szczupak", true));
        return trophies;
    }


}
