package com.sample.models;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    public String name ;
    public int id;
    public int cost;

    public Movie(String name, int id, int cost) {
        this.name = name;
        this.id = id;
        this.cost=cost;
    }
    public Movie() {
    }
}
