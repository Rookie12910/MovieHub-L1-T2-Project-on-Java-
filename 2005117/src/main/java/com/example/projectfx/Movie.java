package com.example.projectfx;

import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import java.io.Serializable;



public class Movie implements Serializable{
    public String title, genre1, genre2, genre3, productionCompany;
    public int releaseYear, runningTime;
    public long budget, revenue;

    public Button button;



       public Movie(String title, int releaseYear, String genre1, String genre2, String genre3, int runningTime, String productionCompany, long budget, long revenue) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre1 = genre1;
        this.genre2 = genre2;
        this.genre3 = genre3;
        this.runningTime = runningTime;
        this.productionCompany = productionCompany;
        this.budget = budget;
        this.revenue = revenue;
        this.button = new Button("Click");
        button.setOnAction( e -> {
                    Alert a = new Alert(Alert.AlertType.INFORMATION);
                    a.setHeaderText("Details :");
                    a.setContentText("Title : "+this.getTitle() +"\n"+ "Release Year : "+this.getReleaseYear()+"\n"+"Genre : "+this.getGenre1()+", "+this.getGenre2()+", "+this.getGenre3()+"\n"+"Running Time : "+this.getRunningTime()+" minutes"+"\n"+"Production Company : "+this.getProductionCompany()+"\n"+"Budget : "+this.getBudget()+"\n"+"Revenue : "+this.getRevenue());
                    a.showAndWait();
                }
        );
    }

    public Movie(String title, int releaseYear, String genre1, String genre2, String genre3, int runningTime, String productionCompany, long budget, long revenue,int i) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre1 = genre1;
        this.genre2 = genre2;
        this.genre3 = genre3;
        this.runningTime = runningTime;
        this.productionCompany = productionCompany;
        this.budget = budget;
        this.revenue = revenue;

    }

    public Movie(Movie movie)
    {
        this.title = movie.title;
        this.releaseYear = movie.releaseYear;
        this.genre1 = movie.genre1;
        this.genre2 = movie.genre2;
        this.genre3 = movie.genre3;
        this.runningTime = movie.runningTime;
        this.productionCompany = movie.productionCompany;
        this.budget = movie.budget;
        this.revenue = movie.revenue;
        this.button = new Button("Click");
        button.setOnAction( e -> {
            Alert a = new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText("Details :");
            a.setContentText("Title : "+this.getTitle() +"\n"+ "Release Year : "+this.getReleaseYear()+"\n"+"Genre : "+this.getGenre1()+", "+this.getGenre2()+", "+this.getGenre3()+"\n"+"Running Time : "+this.getRunningTime()+" minutes"+"\n"+"Production Company : "+this.getProductionCompany()+"\n"+"Budget : "+this.getBudget()+"\n"+"Revenue : "+this.getRevenue());
            a.showAndWait();
                }
        );
    }

    public Movie(Movie movie,int i)
    {
        this.title = movie.title;
        this.releaseYear = movie.releaseYear;
        this.genre1 = movie.genre1;
        this.genre2 = movie.genre2;
        this.genre3 = movie.genre3;
        this.runningTime = movie.runningTime;
        this.productionCompany = movie.productionCompany;
        this.budget = movie.budget;
        this.revenue = movie.revenue;

    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre1() {
        return genre1;
    }

    public String getGenre2() {
        return genre2;
    }

    public String getGenre3() {
        return genre3;
    }

    public String getProductionCompany() {
        return productionCompany;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public long getBudget() {
        return budget;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setProductionCompany(String productionCompany) {
        this.productionCompany = productionCompany;
    }
        public Button getButton() {
        return button;
    }

    public void printDetails()
    {
        System.out.println("Title: "+this.getTitle());
        System.out.println("Release Year: "+this.getReleaseYear());
        System.out.println("Genre: "+this.getGenre1()+", "+this.getGenre2()+", "+this.getGenre3());
        System.out.println("Running Time: "+this.getRunningTime()+" minutes");
        System.out.println("Production Company: "+this.getProductionCompany());
        System.out.println("Budget: "+this.getBudget());
        System.out.println("Revenue: "+this.getRevenue());
        System.out.println(" ");
    }
}

