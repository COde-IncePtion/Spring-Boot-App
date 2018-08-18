package com.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.context.support.GenericWebApplicationContext;

@SpringBootApplication
public class MoviesManagerApplication {

    public static void main(String args[]) {
        SpringApplication.run(MoviesManagerApplication.class, args);

    }
}
