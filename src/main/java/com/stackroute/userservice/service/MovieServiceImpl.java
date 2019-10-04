package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.Movie;
import com.stackroute.userservice.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieServiceImpl implements MovieService {
    MovieRepository movieRepository;
    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }



    @Override
    public Movie saveMovie(Movie movie) {
        Movie savedMovie = movieRepository.save(movie);
        return savedMovie;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(int movieId) {
        Movie retrievedMovie = movieRepository.findById(movieId).get();
        return retrievedMovie;

    }

    @Override
    public void deleteMovieById(int movieId) {
        movieRepository.deleteById(movieId);
    }

    @Override
    public Movie updateContent(int movieId, String movieContent) {
        Movie newMovie = movieRepository.getOne(movieId);
        newMovie.setMovieContent(movieContent);
        return movieRepository.save(newMovie);
    }

    @Override
    public List<Movie> trackByName(String movieName) {
        List<Movie> trackedMovie = movieRepository.trackByName(movieName);
        return trackedMovie;
    }


}
