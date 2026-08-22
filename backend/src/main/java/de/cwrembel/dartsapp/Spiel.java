package de.cwrembel.dartsapp;

import java.time.LocalDateTime;

public class Spiel {

    private int aktuellerSpielstand;
    private int startPunkte;
    private boolean beendet;
    private boolean gestartet;
    private LocalDateTime startZeit;
    private LocalDateTime erstellteZeit;

    
    public Spiel()
    {
        startPunkte = 501;
        aktuellerSpielstand = startPunkte;
        gestartet = false;
        erstellteZeit = LocalDateTime.now();
        startZeit = null;
        beendet = false;

    }

    public void werteWurf(Dartpfeil dartpfeil){
        int punkte = dartpfeil.berechnePunkte();
        aktuellerSpielstand = aktuellerSpielstand - punkte;
        
        if (gestartet == false){
            startZeit = LocalDateTime.now();
            gestartet = true;
        }

    }

    public int getAktuellerSpielstand(){
        return aktuellerSpielstand;
    }


}
