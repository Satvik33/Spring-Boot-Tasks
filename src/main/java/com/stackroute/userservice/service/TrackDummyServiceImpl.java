package com.stackroute.userservice.service;


import com.stackroute.userservice.domain.Movie;
import com.stackroute.userservice.exceptions.MovieAlreadyExistsException;
import com.stackroute.userservice.exceptions.MovieNotFoundException;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dummy")
@Profile("test")
public class TrackDummyServiceImpl implements MovieService {


    @Override
    public Movie saveMovie(Movie movie) throws MovieAlreadyExistsException {
        return null;
    }

    @Override
    public List<Movie> getAllMovies() {
        return null;
    }

    @Override
    public Movie getMovieById(int movieId) throws MovieNotFoundException {
        return null;
    }

    @Override
    public void deleteMovieById(int movieId) throws MovieNotFoundException {

    }

    @Override
    public Movie updateContent(int movieId, String movieContent) {
        return null;
    }

    @Override
    public List<Movie> trackByName(String movieName) {
        return null;
    }
}
