package com.example.projectfx;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.List;
import java.net.URL;
import java.util.ResourceBundle;


public class PrintDetailsController implements Initializable {
    public static int refreshControl;
    public static List <Movie> movies;
    @FXML
    public TableColumn<Movie,String> title;
    @FXML
    public TableColumn<Movie,Integer> year;
    @FXML
    public TableColumn<Movie,String> company;
    @FXML
    public TableColumn<Movie,Button> details;
    @FXML
    public TableView <Movie> movieDetails;

    Main main;

    public void setMain(Main main) {
        this.main = main;
    }


    public void goBackClicked(ActionEvent actionEvent) throws Exception {
       if(MainController.option==1) main.searchMovie();
        if(MainController.option==2) main.ProductionCompany();
    }
    ObservableList <Movie> data = FXCollections.observableArrayList(movies);

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        title.setCellValueFactory(new PropertyValueFactory<>("title"));
        year.setCellValueFactory(new PropertyValueFactory<>("releaseYear"));
        company.setCellValueFactory(new PropertyValueFactory<>("productionCompany"));
        details.setCellValueFactory(new PropertyValueFactory<>("button"));

        movieDetails.setItems(data);

    }

    public void refreshClicked(ActionEvent actionEvent) throws Exception {
        if(refreshControl==1){
            Client.GetMovieList(LogInController.getPcName());
            PrintDetailsController.movies = SearchMovies.byTitle(ByTitleController.MovieTitle);
            main.printDetails();
        }

        if(refreshControl==2){
            Client.GetMovieList(LogInController.getPcName());
            PrintDetailsController.movies = SearchMovies.byReleaseYear(ByRealeseYearController.year);
            main.printDetails();
        }

        if(refreshControl==3){
            Client.GetMovieList(LogInController.getPcName());
            PrintDetailsController.movies = SearchMovies.byGenre(ByGenreController.genreType);
            main.printDetails();
        }

        if(refreshControl==4){
            Client.GetMovieList(LogInController.getPcName());
            PrintDetailsController.movies = SearchMovies.byRunningTime(ByRunningTimeController.t1,ByRunningTimeController.t2);
            main.printDetails();
        }

        if(refreshControl==5){
            Client.GetMovieList(LogInController.getPcName());
            PrintDetailsController.movies = SearchMovies.AllMovies();
            main.printDetails();
        }
        if(refreshControl==6){
            Client.GetMovieList(LogInController.getPcName());
            PrintDetailsController.movies = SearchMovies.MostRecent(LogInController.getPcName());
            main.printDetails();
        }
        if(refreshControl==7){
            Client.GetMovieList(LogInController.getPcName());
            PrintDetailsController.movies = SearchMovies.MaxRevenue(LogInController.getPcName());
            main.printDetails();
        }
    }
}
