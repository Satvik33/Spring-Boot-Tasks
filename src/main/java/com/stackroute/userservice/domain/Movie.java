package com.stackroute.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
   /* public Movie(int movieId, String movieName, String movieContent) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieContent = movieContent;
    }

    public Movie() {
    }*/

    /*public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setMovieContent(String movieContent) {
        this.movieContent = movieContent;
    }*/

    @Id
    int movieId;
    String movieName;
    String movieContent;

    /*public int getMovieId() {
        return movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getMovieContent() {
        return movieContent;
    }*/
}

