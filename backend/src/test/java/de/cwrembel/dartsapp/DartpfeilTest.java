package de.cwrembel.dartsapp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DartpfeilTest {
    @Test void berechnetTriple20Korrekt(){
        Dartpfeil dartpfeil = new Dartpfeil(20, 3);

        int ergebnis = dartpfeil.berechnePunkte();
        assertEquals(60, ergebnis);

    }

    @Test void lehntTripleBullAb(){
    
        assertThrows(IllegalArgumentException.class, ()-> new Dartpfeil(25,3));

    }

    @Test void berechnetBullseyeKorrekt(){
        Dartpfeil dartpfeil = new Dartpfeil(25, 2);

        int ergebnis = dartpfeil.berechnePunkte();
        assertEquals(50, ergebnis);
        
    }

    @Test void berechnetFehlwurfKorrekt(){
        Dartpfeil dartpfeil = new Dartpfeil(0, 1);

        int ergebnis = dartpfeil.berechnePunkte();
        assertEquals(0, ergebnis);
    }
}
