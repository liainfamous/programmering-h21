package introKlasserObjekter2;

import static javax.swing.JOptionPane.*;

class Konto
{
    //  Attributtene for kontoinnehavers navn, kontornummer og saldo. 
    private String navn;
    private String kontonummer;
    private double saldo;
    
    //  Kontruktør som skal gi startverdier til ALLE attributtene  
    public Konto(String navn, String kontonummer, double saldo) {
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }
    
    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */
    
    public void utskrift(){
        String ut="Kontoinnehaver : "+navn+"\n"+
                "Kontonummer : "+kontonummer+"\n"+
                "Saldo : "+String.format("%.2f", saldo)+" kr";
        showMessageDialog(null, ut);
    }

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */

    public String settInn(double beløp){
        saldo = saldo + beløp;
        return "Den nye saldoen er : "+String.format("%.2f", saldo)+" kr";
    }
    
    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis detikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */

    public String taUt(double beløp){
        String ut = "";
        if(beløp <= saldo){
            saldo = saldo - beløp;
            ut = "Den nye saldoen er : "+String.format("%.2f", saldo)+" kr";
        }
        else{
            ut = "Ikke dekning på konto";
        }
        return ut;    
    }
} // end of class Konto

public class Oppgave5 {
    public static void main(String[] args) {
        String innKontoNavn = showInputDialog("Anngi kontonavn : ");
        String innKontoNr = showInputDialog("Angi kontonummer");
        double innSaldo = Double.parseDouble(showInputDialog("Angi saldo:"));
        Konto sparekonto = new Konto(innKontoNavn, innKontoNr, innSaldo);
        System.out.println(sparekonto.settInn(1000));
        System.out.println(sparekonto.taUt(10));
        System.out.println(sparekonto.settInn(1000));
        sparekonto.utskrift();
    }
}
