package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ByRealeseYearController {
    public TextField realeseYear;
    public static int year;



    Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    public void backClicked(ActionEvent actionEvent) throws Exception {
        main.searchMovie();
    }

    public void submitClicked(ActionEvent actionEvent) throws Exception{
        year = Integer.parseInt(realeseYear.getText());
        PrintDetailsController.movies = SearchMovies.byReleaseYear(year);
        main.printDetails();
    }
}
