package ua.edu.ucu.apps.flowerstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {

    private final FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService flowerService) {
        this.flowerService = flowerService;
    }

    @GetMapping
    public List<Flower> getAllFlowers() {
        return flowerService.getFlowers(); // Retrieves all flowers from the service layer
    }

    @PostMapping
    public Flower createFlower(@RequestBody Flower flower) {
        return flowerService.saveFlower(flower); // Saves a flower via the service layer
    }
}
