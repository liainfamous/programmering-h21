/* !!! Koden fungerer ikke, har prøvd flere forskjellige måter å skrive det på men uten hell.
        Garantert feil i siste del hvor man skal skrive ut total pris i System.out samt beregneTotalPris
        */

import javax.swing.JOptionPane;
public class Vare {
    String navn;
    int antall;
    double pris;

    // Konstruktør med alle attributter
    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    // get / set metoder

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public string getNavn() {
        return navn;
    }

    // antall og pris må være større enn null

    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;
        }
    }

    public int getAntall() {
        return antall;
    }

    public void setPris(double pris) {
        if (antall > 0) {
            this.pris = pris;
        }
    }

    public double getPris() {
        return pris;
    }

    // metode for å beregne totalpris (pris * antall)

    public void beregneTotalPris(double totalpris) {
        totalpris = (pris * antall);
    }  
}

public class Oblig1Oppgave2 {

    public static void main(String[] args){

        // les inn navn, antall og pris for vare 1

        Vare nyVare1 = new Vare1();

        nyVare1.navn = "Vare 1";
        nyVare1.visNavn();
        nyVare1.antall = "1";
        nyVare1.visAntall();
        nyVare1.pris = "250";
        nyVare1.visPris();

        // les inn navn, antall og pris for vare 2

        Vare nyVare2 = new Vare2();

        nyVare2.navn = "Vare 2";
        nyVare2.visNavn();
        nyVare2.antall = "1";
        nyVare2.visAntall();
        nyVare2.pris = "300";
        nyVare2.visPris();

        /* bruk avvikshåntering (try/catch) for å 
        konvertere antall og pris for vare 1 og vare 2
        */

        String Vare1;
        try {
            antall1 = Integer.parseInt(nyVare1.antall);
            pris1 = Double.parseDouble(nyVare1.pris);
        }catch(Exception e){
            antall = 0;
            pris = 0;
        }

        String Vare2;
        try {
            antall = Integer.parseInt(nyVare2.antall);
            pris = Double.parseDouble(nyVare2.pris);
        }catch(Exception e){
            antall = 0;
            pris = 0;
        }

        // opprett to vare-objekter med de innleste verdiene

        JOptionPane.showMessageDialog("Vare 1 : " + Vare1.getNavn() + "Antall: " + Vare1.getAntall() + "Pris: " + Vare1.getPris());
        JOptionPane.showMessageDialog("Vare 2 : " + Vare2.getNavn() + "Antall: " + Vare2.getAntall() + "Pris: " + Vare2.getPris());

        // beregn og skriv ut total pris for alle varer i System.out

        System.out.println(totalpris);

    }
}