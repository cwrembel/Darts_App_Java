package de.cwrembel.dartsapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

import java.util.Map;

@RestController
public class GameController {

    private Spiel spiel1 = new Spiel();

    @GetMapping("/game")
    public Map<String, Integer> aktuellesSpiel() {
        return Map.of("punktestand", spiel1.getAktuellerSpielstand(),"letzterPfeil", spiel1.getLetzterPfeilPunkte());
    }

    @PostMapping("/game/wurf")
    public void verarbeiteWurf(@RequestParam int segmentWert, @RequestParam int multiplikator)
    {
        Dartpfeil dartpfeil = new Dartpfeil(segmentWert, multiplikator);
        spiel1.verarbeiteWurf(dartpfeil);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String behandelUngueltigeEingabe(IllegalArgumentException exception){
        return exception.getMessage();
    }


}
