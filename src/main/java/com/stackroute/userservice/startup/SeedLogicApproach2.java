package com.stackroute.userservice.startup;

import com.stackroute.userservice.domain.Movie;
import com.stackroute.userservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:field-values.properties")
@ConfigurationProperties(prefix = "movie")
public class SeedLogicApproach2 implements CommandLineRunner {

    @Autowired
    MovieRepository movieRepository;

    public void setId3(int id3) {
        this.id3 = id3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void setContent3(String content3) {
        this.content3 = content3;
    }

    private int id2;
    private String name2;
    private int id3;
    private String name3;
    public void setId2(int id2) {
        this.id2 = id2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setContent2(String content2) {
        this.content2 = content2;
    }

    private String content2;
    private String content3;


    @Autowired
    public void setMovieRepository(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Movie movie = new Movie();
        movie.setMovieId(id2);
        movie.setMovieName(name2);
        movie.setMovieContent(content2);
        movieRepository.save(movie);
        Movie movie1 = new Movie();
        movie1.setMovieId(id3);
        movie1.setMovieName(name3);
        movie1.setMovieContent(content3);
        movieRepository.save(movie1);

    }


}
