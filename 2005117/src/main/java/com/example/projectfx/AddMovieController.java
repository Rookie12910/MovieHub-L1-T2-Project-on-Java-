package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddMovieController {
    Main main;
    Stage stage;


    public void setMain(Main main) {
        this.main = main;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public TextField title;
    public TextField year;
    public TextField genre1;
    public TextField genre2;
    public TextField genre3;
    public TextField time;
    public TextField company;
    public TextField budget;
    public TextField revenue;

    public void backClicked(ActionEvent actionEvent) throws Exception {
        main.MainMenu();
    }

    public void submitClicked(ActionEvent actionEvent) throws Exception {
        boolean flag = true;
        for(int i =0;i<MovieList.movieList.size();i++)
        {
            if(title.getText().equalsIgnoreCase(MovieList.movieList.get(i).getTitle()))
            {
                flag = false;
                break;
            }
        }
        if(flag) {
             Movie addedMovie = new Movie(title.getText(), Integer.parseInt(year.getText()), genre1.getText(), genre2.getText(), genre3.getText(), Integer.parseInt(time.getText()),LogInController.getPcName(), Long.parseLong(budget.getText()), Long.parseLong(revenue.getText()),1);
             Client.AddMovie(addedMovie);
             Alert a = new Alert(Alert.AlertType.INFORMATION);
             a.setContentText("Movie Successfully Added!");
             a.showAndWait();
        }
        else{
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setContentText("This Movie already exists!");
            a.showAndWait();
        }

    }
}
