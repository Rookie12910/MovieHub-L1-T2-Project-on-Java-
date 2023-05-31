package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LogInController {
    public TextField productionCompany;
    Main main;
   static String pcName;

    public static String getPcName() {
        return pcName;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    Stage stage;

    public void LoginClicked(ActionEvent actionEvent) throws Exception {
        pcName = productionCompany.getText();
        Client.GetMovieList(pcName);
        if(MovieList.movieList.size()!=0)
        {main.MainMenu();}
        else {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText("Invalid Input!");
            a.setContentText("Please try again...");
            a.showAndWait();
        }

    }
}
