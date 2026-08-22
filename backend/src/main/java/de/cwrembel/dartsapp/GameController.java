package de.cwrembel.dartsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@RestController
public class GameController {

    private Spiel spiel1 = new Spiel();

    @GetMapping("/game")
    public Map<String, Integer> aktuellesSpiel() {
        return Map.of("punktestand", spiel1.getAktuellerSpielstand());
    }

    @PostMapping("/game/wurf")
    public void werteWurf(@RequestParam int segmentWert, @RequestParam int multiplikator)
    {
        Dartpfeil dartpfeil = new Dartpfeil(segmentWert, multiplikator);
        spiel1.werteWurf(dartpfeil);
    }

}
