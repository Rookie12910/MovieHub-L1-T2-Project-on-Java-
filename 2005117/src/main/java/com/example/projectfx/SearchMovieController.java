package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.stage.Stage;

public class SearchMovieController {
    Main main;
    Stage stage;
    public void setMain(Main main) {
        this.main = main;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void backClicked(ActionEvent actionEvent) throws Exception {
        main.MainMenu();
    }

    public void byMovieTitle(ActionEvent actionEvent) throws Exception {
        PrintDetailsController.refreshControl=1;
        Client.GetMovieList(LogInController.getPcName());
        main.byTitle();
    }

    public void byRealeseYear(ActionEvent actionEvent) throws Exception{
        PrintDetailsController.refreshControl=2;
        Client.GetMovieList(LogInController.getPcName());
        main.byRealeseYear();
    }

    public void byGenreClicked(ActionEvent actionEvent) throws Exception{
        PrintDetailsController.refreshControl=3;
        Client.GetMovieList(LogInController.getPcName());
        main.byGenre();
    }

    public void byRunningTime(ActionEvent actionEvent) throws Exception{
        PrintDetailsController.refreshControl=4;
        Client.GetMovieList(LogInController.getPcName());
        main.byRunningTime();
    }

    public void AllMovies(ActionEvent actionEvent) throws Exception{
        PrintDetailsController.refreshControl=5;
        Client.GetMovieList(LogInController.getPcName());
        PrintDetailsController.movies = SearchMovies.AllMovies();
        main.printDetails();

    }
}
