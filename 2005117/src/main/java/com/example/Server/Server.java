
package com.example.Server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.example.projectfx.Movie;

public class Server {

    public static void main(String[] args) throws Exception {
        ServerMovieList.inputList();
        ServerSocket serverSocket = new ServerSocket(33333);
        System.out.println("Server Started..");
        while (true){
            Socket socket = serverSocket.accept();
            NewThread thread =new NewThread(serverSocket, socket);
        }
    }
}

class NewThread implements Runnable{
    ServerSocket serverSocket;
    Socket socket;
    NewThread(ServerSocket serverSocket, Socket socket){
        this.serverSocket=serverSocket;
        this.socket=socket;
        Thread thread=new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                Object request = ois.readObject();

                if ((int) request == 1) {
                    List<Movie> movies = new ArrayList();
                    Object readObject = ois.readObject();
                    String companyName = (String) readObject;
                    movies = ServerMovieList.byProductionCompany(companyName);
                    oos.writeObject(movies);
                }
                else if ((int) request == 2) {
                    Object readObject = ois.readObject();
                    Movie movie = (Movie) readObject;
                    ServerMovieList.serverMovieList.add(movie);
                    ServerMovieList.WriteFile();
                }
                else if ((int) request == 3) {
                    Object readObject1 = ois.readObject();
                    String Title = (String) readObject1;
                    Object readObject2 = ois.readObject();
                    String ProductionCompany = (String)readObject2;
                    ServerMovieList.Transfer(Title,ProductionCompany);
                    ServerMovieList.WriteFile();
                }
            }
            catch (Exception e){}
        }
    }
}

