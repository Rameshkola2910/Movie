// Write your code here
package com.example.movie;

import java.util.*;

public interface MovieRepository {

    ArrayList<Movie> getMovies();

    Movie getMoviesById(int movieId);

    Movie addMovie(Movie movie);

    Movie updatMovie(int movieId, Movie movie);

    void deleteMovie(int movieId);

}