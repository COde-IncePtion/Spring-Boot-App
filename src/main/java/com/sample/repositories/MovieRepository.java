package com.sample.repositories;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.sample.databaseContext.MongoDBContext;
import com.sample.models.Movie;
import org.apache.http.HttpStatus;
import org.bson.Document;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    private MongoDBContext mongoDBContext;

    private MongoCollection<Movie> movieMongoCollection;

    public MovieRepository(MongoDBContext mongoDBContext) {
        this.mongoDBContext = mongoDBContext;
        MongoDatabase mongoDatabase = mongoDBContext.getMongoDatabase();
        System.out.print(mongoDatabase);
        MongoCollection<Movie> movies = mongoDatabase.getCollection("movies", Movie.class);
        this.movieMongoCollection= movies;
    }

    public int add(Movie movie)
    {
        movieMongoCollection.insertOne(movie);
        return HttpStatus.SC_CREATED;
    }


    public List<Movie> getAllMovies(){

        return movieMongoCollection.find().into(new ArrayList<Movie>());
    }
}
