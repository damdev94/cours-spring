package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;

public class MovieService implements MovieServiceInterface {

    private MovieRepositoryInterface movieRepository;

    // Constructeur pour initialiser movieRepository
    public MovieService(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void registerMovie(Movie movie) {
        movieRepository.add(movie);
    }
}
