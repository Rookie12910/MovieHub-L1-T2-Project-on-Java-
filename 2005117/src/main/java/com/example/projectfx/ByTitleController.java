package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class ByTitleController {
   @FXML
    public TextField title;
    Main main;
    public static String MovieTitle;


    public void setMain(Main main) {
        this.main = main;
    }
    public void backClicked(ActionEvent actionEvent) throws Exception{
        main.searchMovie();
    }


    public void titleSelected(ActionEvent actionEvent) throws Exception{

    }

    public void submitClicked(ActionEvent actionEvent) throws Exception{
        MovieTitle = title.getText();
        PrintDetailsController.movies = SearchMovies.byTitle(MovieTitle);
        main.printDetails();
    }
}
