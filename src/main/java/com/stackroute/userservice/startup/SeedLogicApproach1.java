package com.stackroute.userservice.startup;

import com.stackroute.userservice.domain.Movie;
import com.stackroute.userservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.core.env.Environment;

@Component
@PropertySource("classpath:field-values.properties")
public class SeedLogicApproach1 implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private MovieRepository movieRepository;
    private Movie movie;

    @Value("${movie.id1}")
    private int movieId;

    @Autowired
    private Environment e;


    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Movie movie = new Movie();
        movie.setMovieId(movieId);
        movie.setMovieName(e.getProperty("movie.name1"));
        movie.setMovieContent(e.getProperty("movie.content1"));
        movieRepository.save(movie);
    }


}
