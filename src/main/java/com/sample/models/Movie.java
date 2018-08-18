package com.sample.models;


import lombok.*;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @BsonId
    public ObjectId _id;
    public String name ;
    public int movieId;
    public int cost;
}
