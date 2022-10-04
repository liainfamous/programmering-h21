package introKlasserObjekter2;

/*
Lag en klasse kalt Klokke. 
Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder. 

Klassen skal ha en konstruktør som initialiserer alle attributtene. 
Lag også get/set metoder for disse. 
Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).

Lag så en metode "visTiden" som skriver ut tiden enten på System.out 
eller som meldingsboks på følgende format tt : mm : ss.

Skriv så kode i main for å teste ut denne klassen.

*/

class Klokke{
    private int timer;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutter, int sekunder) {
        setTimer(time);
        setMinutter(minutter);
        setSekunder(sekunder);
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer(int time) {
        if(time >= 0 && time <= 24){
            this.timer = time;    
        }
    }

    public int getMinutter() {
        return minutter;
    }

    public void setMinutter(int minutter) {
        if(minutter>=0 && minutter <=59){
            this.minutter = minutter;
        }
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setSekunder(int sekunder) {
        if(sekunder >= 0 && sekunder <= 59){
           this.sekunder = sekunder; 
        }
    }
    
    public void visTiden()
    {
        System.out.println(timer+" : "+minutter+" : "+sekunder);
    }
}

public class Oppgave4 {
    public static void main(String[] args) {
        Klokke tid1 = new Klokke(12, 45, 34);
        tid1.visTiden();
        Klokke tid2 = new Klokke(25, 45, 34);
        tid2.visTiden();
    }
}
