package com.stackroute.userservice.startup;

import com.stackroute.userservice.domain.Movie;
import com.stackroute.userservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class SeedLogicApproach1 implements ApplicationListener<ContextRefreshedEvent> {

    private MovieRepository movieRepository;

    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Movie movie = new Movie();
        movie.setMovieId(1);
        movie.setMovieName("Wolverine");
        movie.setMovieContent("Returns!");
        movieRepository.save(movie);
    }


}
