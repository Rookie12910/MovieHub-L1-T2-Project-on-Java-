package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ByGenreController {
    Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    public TextField genre;

    public static String genreType;



    public void backClicked(ActionEvent actionEvent) throws Exception {
        main.searchMovie();
    }

    public void submitClicked(ActionEvent actionEvent) throws Exception {
        genreType = genre.getText();
        PrintDetailsController.movies = SearchMovies.byGenre(genreType);
        main.printDetails();
    }
}
