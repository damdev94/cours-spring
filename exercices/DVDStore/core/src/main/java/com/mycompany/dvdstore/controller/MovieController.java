package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;
import java.util.Scanner;

public class MovieController {

  MovieService movieService;


  public MovieController(){
    this.movieService = new MovieService();
  }

  public void addUsingConsole(){

    Scanner sc = new Scanner(System.in);
        System.out.println("what is the title of the movie ? ");
        String title = sc.nextLine();
        System.out.println("what is the type of the movie ? ");
        String genre = sc.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
  }

}
