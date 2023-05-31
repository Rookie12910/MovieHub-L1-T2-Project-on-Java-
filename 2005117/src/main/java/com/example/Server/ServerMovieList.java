package com.example.Server;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.example.projectfx.Movie;
import com.example.projectfx.MovieList;


public class ServerMovieList implements Serializable {

        private static final String INPUT_FILE = "movies.txt";
        public static List<Movie> serverMovieList = new ArrayList();
        public static void inputList() throws Exception {

            BufferedReader record = new BufferedReader(new FileReader(INPUT_FILE));

            while (true) {
                String line = record.readLine();
                if (line == null) break;
                String[] details = line.split(",");
                Movie m = new Movie(details[0], Integer.parseInt(details[1]), details[2], details[3], details[4], Integer.parseInt(details[5]), details[6], Long.parseLong(details[7]), Long.parseLong(details[8]),1);
                serverMovieList.add(m);

            }
            record.close();

        }

        public static List<Movie> byProductionCompany(String productionCompany) {
            List <Movie> movies = new ArrayList();
            for (int i = 0; i < ServerMovieList.serverMovieList.size(); i++) {
                Movie m = ServerMovieList.serverMovieList.get(i);
                if (m.getProductionCompany().equalsIgnoreCase(productionCompany)) {
                    Movie M = new Movie ( ServerMovieList.serverMovieList.get(i),1);
                    movies.add(M);
                }
            }
            return movies;
        }

    public static void Transfer(String title, String productionCompany) {
        for (int i = 0; i < ServerMovieList.serverMovieList.size(); i++) {
            Movie m = ServerMovieList.serverMovieList.get(i);
            if (m.getTitle().equalsIgnoreCase(title)) {
               m.setProductionCompany(productionCompany);
               break;
            }
        }
    }

    public static void WriteFile() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("movies.txt"));
        for(Movie m : ServerMovieList.serverMovieList )
        {
            String text = new String(m.getTitle()+","+m.getReleaseYear()+","+m.getGenre1()+","+m.getGenre2()+","+m.getGenre3()+","+m.getRunningTime()+","+m.getProductionCompany()+","+m.getBudget()+","+m.getRevenue());
            bw.write(text);
            bw.write(System.lineSeparator());
        }
        bw.close();
    }


}
