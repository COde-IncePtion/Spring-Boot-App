package com.sample.controller;

import com.sample.models.Movie;
import com.sample.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

    @Autowired
    private MovieService _movieService;

    @RequestMapping("/movies")
    public List<Movie> temp()
    {
        return  _movieService.get_movies();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/movies")
    public int addMovie(@RequestBody Movie movie)
    {
        return _movieService.add(movie);
    }
}
