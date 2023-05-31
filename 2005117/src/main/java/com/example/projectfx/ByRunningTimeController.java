package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class ByRunningTimeController {
    Main main;
   public static int t1, t2;

    public void setMain(Main main) {
        this.main = main;
    }

    public TextField initialTime;
    public TextField finalTime;

    public void submitClicked(ActionEvent actionEvent) throws Exception{
        t1= Integer.parseInt(initialTime.getText());
        t2= Integer.parseInt(finalTime.getText());
        PrintDetailsController.movies = SearchMovies.byRunningTime(t1,t2);
        main.printDetails();
    }

    public void backClicked(ActionEvent actionEvent) throws Exception{
        main.searchMovie();
    }
}
