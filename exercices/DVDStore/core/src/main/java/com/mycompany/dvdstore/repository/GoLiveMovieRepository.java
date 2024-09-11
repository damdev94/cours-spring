package com.mycompany.dvdstore.repository;

import java.io.FileWriter;
import java.io.IOException;

import com.mycompany.dvdstore.entity.Movie;

public class GoLiveMovieRepository {

  public void saveMovie(Movie movie) {
    FileWriter writer = null;
    try {
      writer = new FileWriter("/home/damien/Documents/code cours/Spring/exercices/movies.txt", true);
      writer.write(movie.getTitle()+ ";" + movie.getGenre() + "\n");
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        if (writer != null) {
          writer.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
