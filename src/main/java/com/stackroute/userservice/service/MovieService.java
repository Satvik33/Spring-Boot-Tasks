package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.Movie;
import com.stackroute.userservice.exceptions.MovieAlreadyExistsException;
import com.stackroute.userservice.exceptions.MovieNotFoundException;

import java.util.List;

public interface MovieService {
    public Movie saveMovie(Movie movie) throws MovieAlreadyExistsException;
    public List<Movie> getAllMovies();
    public Movie getMovieById(int movieId) throws MovieNotFoundException;
    public void deleteMovieById(int movieId)throws MovieNotFoundException;
    public Movie updateContent(int movieId, String movieContent);
    public List<Movie> trackByName(String movieName);



}
