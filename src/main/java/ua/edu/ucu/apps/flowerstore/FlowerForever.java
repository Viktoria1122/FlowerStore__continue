package ua.edu.ucu.apps.flowerstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FlowerForever {

        public static void main(String[] args) {
           SpringApplication.run(FlowerForever.class, args);
        }
    }

