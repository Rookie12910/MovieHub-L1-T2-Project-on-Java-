package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class TransferMovieController {
    Main main;
    Stage stage;


    public void setMain(Main main) {
        this.main = main;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
    public TextField movieTitle;
    public TextField productionCompany;

    public void backClicked(ActionEvent actionEvent) throws Exception {
        main.MainMenu();
    }

    public void submitClicked(ActionEvent actionEvent) throws Exception {
        Client.TransferMovie(movieTitle.getText(),productionCompany.getText());
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Movie Successfully Transferred!");
        a.showAndWait();
    }
}
