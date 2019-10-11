/*package com.stackroute.userservice.repository;

import com.stackroute.userservice.domain.Movie;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
    @DataJpaTest
    public class RepositoryTest {

        @Autowired
        MovieRepository movieRepository;
        Movie movie;

        @Before
        public void setUp()
        {
            movie = new Movie();
            movie.setMovieId(1);
            movie.setMovieName("Joker");
            movie.setMovieContent("I hope my death earns more cents than my life!");

        }
        @After
        public void tearDown(){

            movieRepository.deleteAll();
        }
        @Test
        public void testSaveMovie(){
            movieRepository.save(movie);

            Movie fetchUser = movieRepository.findById(movie.getMovieId()).get();
            Assert.assertEquals(1,fetchUser.getMovieId());

        }
        @Test
        public void testSaveMovieFailure() {
            Movie testUser = new Movie(3, "Joker", "IT dikha diya!");
            movieRepository.save(movie);
            Movie fetchUser = movieRepository.findById(movie.getMovieId()).get();
            Assert.assertNotSame(testUser, movie);
        }
        @Test
        public void testAllMovies(){
            Movie m = new Movie(2,"Batman", "Harvey Dent.. can we trust him?");
            Movie m1 = new Movie(3, "Robin", "Nobody cares about you!");
            movieRepository.save(m);
            movieRepository.save(m1);
            List<Movie> list = movieRepository.findAll();
            Assert.assertEquals("Robin",list.get(1).getMovieName());
        }
    @Test
    public void testFindMovieById(){
        movieRepository.save(movie);
        Movie retrievedMovie = movieRepository.findById(movie.getMovieId()).get();
        Assert.assertEquals(movie, retrievedMovie);
    }

    @Test
    public void testFindMovieByIdFailure(){

    }

    @Test
    public void testUpdateMovie(){
        Movie testMovie = new Movie(101, "Pokemon", "Gotta catch'em all!!!");
        movieRepository.save(movie);
        Movie updatedMovie = movieRepository.save(testMovie);
        Assert.assertEquals(testMovie, updatedMovie);
        Assert.assertNotSame(testMovie, movie);
    }

    @Test
    public void testUpdateMovieFailure(){

    }

    @Test
    public void testDeleteMovie(){
        movieRepository.save(movie);
        movieRepository.delete(movie);
        Assert.assertFalse(movieRepository.existsById(movie.getMovieId()));
    }

    @Test
    public void testDeleteMovieFailure(){

    }

    @Test
    public void testFindByMovieName() {
        movieRepository.save(movie);
        List<Movie> retrievedList = movieRepository.findMovieByMovieName(movie.getMovieName());
        Assert.assertEquals(movie, retrievedList.get(0));
    }

    @Test
    public void testFindByMovieNameFailure() {

    }
}*/





