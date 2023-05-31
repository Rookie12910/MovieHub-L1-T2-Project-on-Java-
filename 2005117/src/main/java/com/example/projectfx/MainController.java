package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainController {
    Main main;
    Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    static int option; //using to control which scene(Search or Production company) to be showed after printing details

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public void searchMoviesClicked(ActionEvent actionEvent) throws Exception {
        option =1;
        main.searchMovie();
    }

    public void productionCompanyClicked(ActionEvent actionEvent) throws Exception {
        option =2;
        main.ProductionCompany();
    }

    public void addMovieClicked(ActionEvent actionEvent) throws Exception{
        main.AddMovie();
    }
    public void goBackClicked(ActionEvent actionEvent) throws Exception{
        main.start(stage);
    }

    public void exitClicked(ActionEvent actionEvent) throws Exception {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Exit");
        a.setHeaderText("Are You Sure?");
        if(a.showAndWait().get()== ButtonType.OK)
        {
            stage.close();
        }
    }

    public void transferMovieClicked(ActionEvent actionEvent) throws Exception {
        main.TransferMovie();
    }
}
