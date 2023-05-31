package com.example.projectfx;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private static final int PORT=33333;
    private static final String HOST="127.0.0.1";
    static Socket socket=null;
    static int getMovieList = 1;
    static int addMovie = 2;
    static int transferMovie = 3;
    public static void GetMovieList(String message) throws Exception {
        socket = new Socket(HOST,PORT);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        oos.writeObject(getMovieList);
        oos.writeObject(message);
        Object ob = ois.readObject();
        List<Movie> movies1=(ArrayList)ob;
        List <Movie> movies = new ArrayList();
        for(Movie m: movies1)
        {
            Movie M = new Movie(m);
            movies.add(M);
        }
        MovieList.movieList = movies;
    }
    public static void AddMovie(Movie movie) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(addMovie);
        oos.writeObject(movie);
    }

    public static void TransferMovie(String title , String productionCompanyName) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(transferMovie);
        oos.writeObject(title);
        oos.writeObject(productionCompanyName);
    }

}
