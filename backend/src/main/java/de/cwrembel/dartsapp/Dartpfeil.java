package de.cwrembel.dartsapp;


public class Dartpfeil {


    private int segmentWert;
    private int multiplikator;


    public Dartpfeil(int segmentWert, int multiplikator)
    {
        this.segmentWert = segmentWert;
        this.multiplikator = multiplikator;
    }

    public int berechnePunkte(){
        return segmentWert * multiplikator;
    }
    
}
