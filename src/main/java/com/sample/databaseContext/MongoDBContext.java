package com.sample.databaseContext;


import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import lombok.Getter;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;


@Getter
@Component
public class MongoDBContext {
    private MongoClient _mongoClient;
    private MongoDatabase mongoDatabase;

    public MongoDBContext() {
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClient.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        this._mongoClient = new MongoClient("localhost", 27017);
        this.mongoDatabase = this._mongoClient.getDatabase("spring-movie-application").withCodecRegistry(pojoCodecRegistry);
    }
}

