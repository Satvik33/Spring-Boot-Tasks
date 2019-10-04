package com.stackroute.userservice.startup;

import com.stackroute.userservice.domain.Movie;
import com.stackroute.userservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SeedLogicApproach2 implements CommandLineRunner {

    MovieRepository movieRepository;

    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie();
        movie.setMovieId(2);
        movie.setMovieName("Batman");
        movie.setMovieContent("Harvey Dent.. can we trust him!");
        movieRepository.save(movie);
    }


}
