package ua.edu.ucu.apps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.Flower;
import ua.edu.ucu.apps.flowerstore.FlowerColor;
import ua.edu.ucu.apps.flowerstore.FlowerRepository;
import ua.edu.ucu.apps.flowerstore.FlowerType;

@SpringBootApplication
@RestController
public class FlowerStoreApplication {

    private final FlowerRepository flowerRepository;

    @Autowired
    public FlowerStoreApplication(FlowerRepository flowerRepository) {
        this.flowerRepository = flowerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(FlowerStoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner initData() {
        return args -> {
            if (flowerRepository.count() == 0) {
                FlowerRepository.save(createFlower(2.5, FlowerColor.WHITE, 15, FlowerType.TULIP));
                                FlowerRepository.save(createFlower(3.5, FlowerColor.RED, 30, FlowerType.ROSE));
                
                                System.out.println("Sample data seeded.");
                            } else {
                                System.out.println("Data already exists. Skipping seeding.");
                            }
                        };
                    }
                
                    private Flower createFlower(double d, FlowerColor white, int i, FlowerType tulip) {
                        // TODO Auto-generated method stub
                        throw new UnsupportedOperationException("Unimplemented method 'createFlower'");
                    }
}


