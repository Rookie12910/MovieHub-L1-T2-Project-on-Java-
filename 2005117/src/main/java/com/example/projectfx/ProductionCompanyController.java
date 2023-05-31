package com.example.projectfx;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class ProductionCompanyController {
    Main main;
    Stage stage;
    static int index;//using to control which function to be called (Production company related)

    public void setMain(Main main) {
        this.main = main;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void mostRecentClicked(ActionEvent actionEvent) throws Exception{
        PrintDetailsController.refreshControl=6;
        Client.GetMovieList(LogInController.getPcName());
        PrintDetailsController.movies = SearchMovies.MostRecent(LogInController.getPcName());
        main.printDetails();
    }

    public void maxRevenueClicked(ActionEvent actionEvent) throws Exception {
        PrintDetailsController.refreshControl=7;
        Client.GetMovieList(LogInController.getPcName());
        PrintDetailsController.movies = SearchMovies.MaxRevenue(LogInController.getPcName());
        main.printDetails();
    }

    public void totalProfitClicked(ActionEvent actionEvent) throws Exception {
        Client.GetMovieList(LogInController.getPcName());
        Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setContentText("Total Profit of "+LogInController.getPcName()+" is " +SearchMovies.TotalProfit(LogInController.getPcName()));
        a.showAndWait();
    }


    public void backClicked(ActionEvent actionEvent) throws Exception{
        main.MainMenu();
    }
}
