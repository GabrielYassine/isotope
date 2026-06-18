package com.example.backend;

import com.example.backend.domain.Game;
import com.example.backend.domain.Map;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
        //Game game = new Game(new Map(1000, 1000));
    }
}
