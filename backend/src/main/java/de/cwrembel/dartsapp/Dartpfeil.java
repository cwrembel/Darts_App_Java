package de.cwrembel.dartsapp;



public class Dartpfeil {


    private int segmentWert;
    private int multiplikator;


    public Dartpfeil(int segmentWert, int multiplikator){
        boolean istFehlwurf = (segmentWert==0 && multiplikator==1);
        boolean istBull = (segmentWert == 25 && multiplikator==1);
        boolean istBullseye = (segmentWert==25 && multiplikator==2);
        boolean istNormalesSegment = ((segmentWert<=20 && segmentWert>=1) && (multiplikator<=3 && multiplikator>=1));
        boolean istGueltigerWurf = (istBull||istBullseye||istNormalesSegment||istFehlwurf);

        if (istGueltigerWurf) {
            this.segmentWert =segmentWert;
            this.multiplikator = multiplikator;
        } else {
            throw new IllegalArgumentException("Dein Pfeil wurde nicht gewertet");
        }
    }

    public int berechnePunkte(){
        return segmentWert * multiplikator;
    }
    
}
