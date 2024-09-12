package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository; // Utilisez l'implémentation souhaitée
import com.mycompany.dvdstore.service.MovieService;
import com.mycompany.dvdstore.service.MovieServiceInterface;

public class App {
    public static void main(String[] args) {
        // Création d'une instance de MovieRepositoryInterface
        MovieRepositoryInterface movieRepository = new GoLiveMovieRepository(); // Ou MovieRepository selon le besoin

        // Création d'une instance de MovieService avec movieRepository
        MovieServiceInterface movieService = new MovieService(movieRepository);

        // Création d'une instance de MovieController avec movieService
        MovieController movieController = new MovieController(movieService);

        // Appel de la méthode addUsingConsole
        movieController.addUsingConsole();
    }
}
