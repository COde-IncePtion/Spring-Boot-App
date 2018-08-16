package com.sample.services;

import com.sample.models.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MovieService {

    private List<Movie> _movies;

    public MovieService() {
        this._movies = new ArrayList<Movie>();
        this._movies.addAll(Arrays.asList(
                new Movie("Pirates Of The Carribean", 1, 120)
                , new Movie("Sully", 2, 100)
                , new Movie("Mean Girl", 3, 122)

        ));
    }

    public List<Movie> get_movies() {
        return _movies;
    }

    public boolean add(Movie movie){
        return _movies.add(movie);
    }

}
