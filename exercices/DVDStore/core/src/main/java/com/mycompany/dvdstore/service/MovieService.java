package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService {

  public void registerMovie(Movie movie){

    MovieRepository movieRepository = new MovieRepository();
    movieRepository.add(movie);

  }

}
