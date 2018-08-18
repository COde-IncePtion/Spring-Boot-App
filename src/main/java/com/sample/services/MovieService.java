package com.sample.services;

import com.sample.models.Movie;
import com.sample.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;


    public List<Movie> get_movies() {
        return movieRepository.getAllMovies();
    }

    public int add(Movie movie){
        return movieRepository.add(movie);
    }

}
