package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.Movie;
import com.stackroute.userservice.exceptions.MovieAlreadyExistsException;
import com.stackroute.userservice.exceptions.MovieNotFoundException;
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
    public Movie saveMovie(Movie movie) throws MovieAlreadyExistsException {
        if(movieRepository.existsById(movie.getMovieId())){
            throw new MovieAlreadyExistsException("Movie id already exists");
        }
        Movie savedMovie = movieRepository.save(movie);
        if(savedMovie == null){
            throw new MovieAlreadyExistsException("Movie id already exists");
        }
        return savedMovie;
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(int movieId) throws MovieNotFoundException {
        if(!movieRepository.existsById(movieId)){
            throw new MovieNotFoundException("Movie not found");
        }
        Movie retrievedMovie = movieRepository.findById(movieId).get();
        return retrievedMovie;

    }

    @Override
    public void deleteMovieById(int movieId) throws MovieNotFoundException {
        if(!movieRepository.existsById(movieId)){
            throw new MovieNotFoundException("Movie not found");
        }
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
