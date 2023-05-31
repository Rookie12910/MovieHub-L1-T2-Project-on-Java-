package com.example.projectfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class


Main extends Application {
    Stage stage;
    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("LogIn.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        LogInController logInController = fxmlLoader.getController();
        logInController.setMain(this);
        logInController.setStage(stage);
        stage.setTitle("Log In Page");
        stage.setScene(scene);
        stage.show();
    }

    public void MainMenu() throws Exception {
        this.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        MainController mainController = fxmlLoader.getController();
        mainController.setMain(this);
        mainController.setStage(stage);
        stage.setTitle("Menu Page");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(e->
                {
                    e.consume();
                    exitClicked(stage);
                }
        );
    }

    public void searchMovie() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("searchMovie.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        SearchMovieController SearchMovieController = fxmlLoader.getController();
        SearchMovieController.setMain(this);
        SearchMovieController.setStage(stage);
        stage.setTitle("SearchMovie");
        stage.setScene(scene);
        stage.show();
    }

    public void ProductionCompany() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("Production Company.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        ProductionCompanyController productionCompanyController = fxmlLoader.getController();
        productionCompanyController.setMain(this);
        productionCompanyController.setStage(stage);
        stage.setTitle("Production Company");
        stage.setScene(scene);
        stage.show();
    }

    public void AddMovie() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("AddMovie.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        AddMovieController addMovieController = fxmlLoader.getController();
        addMovieController.setMain(this);
        addMovieController.setStage(stage);
        stage.setTitle("Add Movie");
        stage.setScene(scene);
        stage.show();
    }

    public void TransferMovie() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("TransferMovie.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        TransferMovieController transferMovieController = fxmlLoader.getController();
        transferMovieController.setMain(this);
        transferMovieController.setStage(stage);
        stage.setTitle("Transfer Movie");
        stage.setScene(scene);
        stage.show();
    }

    public void byTitle() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("byTitle.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        ByTitleController byTitleController = fxmlLoader.getController();
        byTitleController.setMain(this);
        stage.setTitle("Search By Title");
        stage.setScene(scene);
        stage.show();
    }

    public void byRealeseYear() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("byRealeseYear.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        ByRealeseYearController byRealeseYearController = fxmlLoader.getController();
        byRealeseYearController.setMain(this);
        stage.setTitle("Search By Release Year");
        stage.setScene(scene);
        stage.show();
    }

    public void byGenre() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("byGenre.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        ByGenreController byGenreController = fxmlLoader.getController();
        byGenreController.setMain(this);
        stage.setTitle("Search By Genre");
        stage.setScene(scene);
        stage.show();
    }



    public void byRunningTime() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("byRunningTime.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        ByRunningTimeController byRunningTimeController = fxmlLoader.getController();
        byRunningTimeController.setMain(this);
        stage.setTitle("Search By Running Time");
        stage.setScene(scene);
        stage.show();
    }


    public void printDetails() throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("PrintDetails.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        PrintDetailsController printDetailsController = fxmlLoader.getController();
        printDetailsController.setMain(this);
        stage.setTitle("Details");
        stage.setScene(scene);
        stage.show();
    }

    public void exitClicked(Stage stage) {
        Alert a = new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Exit");
        a.setHeaderText("Are you sure?");
        if(a.showAndWait().get()== ButtonType.OK)
        {
            stage.close();
        }
    }



    public static void main(String[] args) throws Exception{
        launch();
    }
}