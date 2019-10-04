package com.stackroute.userservice.service;

import com.stackroute.userservice.domain.Movie;

import java.util.List;

public interface MovieService {
    public Movie saveMovie(Movie movie);
    public List<Movie> getAllMovies();
    public Movie getMovieById(int movieId);
    public void deleteMovieById(int movieId);
    public Movie updateContent(int movieId, String movieContent);
    public List<Movie> trackByName(String movieName);


}
