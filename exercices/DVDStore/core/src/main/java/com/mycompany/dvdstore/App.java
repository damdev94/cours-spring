package com.mycompany.dvdstore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mycompany.dvdstore.controller.MovieController;
import com.mycompany.dvdstore.repository.FileMovieRepository;
import com.mycompany.dvdstore.service.DefaultMovieService;

public class App {
    public static void main(String[] args) {

      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      MovieController movieController = context.getBean(MovieController.class);
      movieController.addUsingConsole();
    }
}
