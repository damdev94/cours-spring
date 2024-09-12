package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.service.MovieService;

public class App {
    public static void main(String[] args) {

        MovieController movieController = new MovieController();
        MovieService movieService = new MovieService();
        GoLiveMovieRepository GoLiveMovieRepository = new GoLiveMovieRepository();
        movieService.setMovieRepository(GoLiveMovieRepository);
        movieController.setMovieService(movieService);
        movieController.addUsingConsole();
    }
}
