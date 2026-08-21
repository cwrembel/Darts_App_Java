package de.cwrembel.dartsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class GameController {
    @GetMapping("/game")
    public Map<String, String> game() {
        return Map.of("score","501");
    }
}
