package com.example.projectfx;

import java.util.*;

public class SearchMovies {

    public static List<Movie> byTitle(String title) {
        List <Movie> movies = new ArrayList();
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie m = MovieList.movieList.get(i);
            if (m.getTitle().equalsIgnoreCase(title)) {
                Movie M = new Movie ( MovieList.movieList.get(i));
                movies.add(M);
            }
        }
        return movies;
    }

    public static List<Movie> byReleaseYear(int year) {
        List <Movie> movies = new ArrayList();
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie m = MovieList.movieList.get(i);
            if (m.getReleaseYear()==year) {
                Movie M = new Movie ( MovieList.movieList.get(i));
                movies.add(M);
            }

        }
        return movies;
    }

    public static List<Movie> byGenre(String genre) {
        List <Movie> movies = new ArrayList();
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie m = MovieList.movieList.get(i);
            if (m.getGenre1().equalsIgnoreCase(genre) || m.getGenre2().equalsIgnoreCase(genre) ||m.getGenre3().equalsIgnoreCase(genre)) {
                Movie M = new Movie ( MovieList.movieList.get(i));
                movies.add(M);
            }
        }
        return movies;
    }

    public static List<Movie> byProductionCompany(String productionCompany) {
        List <Movie> movies = new ArrayList();
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie m = MovieList.movieList.get(i);
            if (m.getProductionCompany().equalsIgnoreCase(productionCompany)) {
                Movie M = new Movie ( MovieList.movieList.get(i));
                movies.add(M);
            }
        }
        return movies;
    }

    public static List<Movie> byRunningTime(int t1, int t2) {
        List <Movie> movies = new ArrayList();
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie m = MovieList.movieList.get(i);
            if (m.getRunningTime()>=t1 && m.getRunningTime()<=t2) {
                Movie M = new Movie ( MovieList.movieList.get(i));
                movies.add(M);
            }
        }
        return movies;
    }

    public static List<Movie> AllMovies()
    {
        return MovieList.movieList;

    }

    public static List<Movie> MostRecent(String productionCompany) {
        List<Movie> movies = new ArrayList();
        int latestYear = 0;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie m = MovieList.movieList.get(i);
            if (m.getProductionCompany().equalsIgnoreCase(productionCompany)) {
                if (m.getReleaseYear() >= latestYear) {
                    latestYear = m.getReleaseYear();
                }
            }
        }
        if (latestYear!=0)
        {
            for (int i = 0; i < MovieList.movieList.size(); i++) {
                Movie m = MovieList.movieList.get(i);
                if (m.getReleaseYear()==latestYear && m.getProductionCompany().equalsIgnoreCase(productionCompany))
                {
                    movies.add(m);
                }
            }
        }
        return movies;
    }

    public static List<Movie> MaxRevenue(String productionCompany) {
        List <Movie> movies = new ArrayList();
        long maxRevenue = 0;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie m = MovieList.movieList.get(i);
            if (m.getProductionCompany().equalsIgnoreCase(productionCompany)) {
                if (m.getRevenue() > maxRevenue) {
                    maxRevenue = m.getRevenue();
                }
            }
        }
        if (maxRevenue != 0)
        {
            for (int i = 0; i < MovieList.movieList.size(); i++) {
                Movie m = MovieList.movieList.get(i);
                if (m.getRevenue()==maxRevenue && m.getProductionCompany().equalsIgnoreCase(productionCompany))
                {
                    movies.add(m);
                }
            }
        }
        return movies;
    }

    public static long TotalProfit(String productionCompany) {
        long totalProfit = 0;
        for (int i = 0; i < MovieList.movieList.size(); i++) {
            Movie m = MovieList.movieList.get(i);
            if (m.getProductionCompany().equalsIgnoreCase(productionCompany)) {
                totalProfit += m.getRevenue() - m.getBudget();
            }
        }
       return totalProfit;
    }


}
