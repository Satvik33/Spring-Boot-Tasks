package com.stackroute.userservice.repository;

import com.stackroute.userservice.domain.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface MovieRepository extends MongoRepository<Movie, Integer> {
//@Query("select m from Movie m where m.movieName  = ?1")
List<Movie> findMovieByMovieName(String movieName);

}
