package com.stackroute.userservice.controller;

import com.stackroute.userservice.domain.Movie;
import com.stackroute.userservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1")
public class MovieController {



    private MovieService movieService;
    private ResponseEntity responseEntity;


    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    public MovieController(ResponseEntity responseEntity) {
        this.responseEntity = responseEntity;
    }

    @PostMapping("movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){

        try{
            movieService.saveMovie(movie);
            responseEntity = new ResponseEntity<String>("Successfully Created", HttpStatus.CREATED);
        }catch(Exception ex){
            responseEntity = new ResponseEntity<String>(ex.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }
    @GetMapping("movies")
    public ResponseEntity getAllMovies() {

        try {
            List<Movie> movieList = movieService.getAllMovies();
            responseEntity = new ResponseEntity<List<Movie>>(movieList, HttpStatus.OK);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<String>("Not found", HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }
    @GetMapping("movie/{movieId}")
    public ResponseEntity getMovieById(@PathVariable int movieId) {

        try {
            Movie retrievedMovie = movieService.getMovieById(movieId);
            responseEntity = new ResponseEntity<Movie>(retrievedMovie, HttpStatus.OK);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<String>("Not found", HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @DeleteMapping("movie/{movieId}")
    public ResponseEntity deleteMovie(@PathVariable int movieId) {

        try {
            movieService.deleteMovieById(movieId);
            responseEntity = new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<String>("Not found", HttpStatus.NOT_FOUND);
        }
        return responseEntity;
    }

    @PutMapping("movie/{movieId}")
    public ResponseEntity updateContent(@PathVariable int movieId, @RequestBody String movieContent) {

        try {
            responseEntity = new ResponseEntity<Movie>(movieService.updateContent(movieId, movieContent), HttpStatus.OK);
        } catch (Exception e) {
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }

    @GetMapping("movies/{movieName}")
    public ResponseEntity trackByName(@PathVariable String movieName){

        try{
            responseEntity = new ResponseEntity<List<Movie>>(movieService.trackByName(movieName), HttpStatus.OK);
        }catch (Exception e){
            responseEntity = new ResponseEntity<String>(e.getMessage(), HttpStatus.CONFLICT);
        }
        return responseEntity;
    }

    }

