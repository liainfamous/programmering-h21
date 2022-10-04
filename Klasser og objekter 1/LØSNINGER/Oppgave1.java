package introKlasserObjekter1;

/*
    Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
    tittel
    pris
    forfatter
    iBSN-nummer
    Videre skal klassen ha en metode som skriver ut de enkelte attributtene via System.out.
    Skriv nødvendig kode i main for å opprette et objekt av denne klassen og sette attributtene til noen verdier.
    Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.
*/
class Bøker{
    // trenger ikke public heller...
    String tittel;
    double pris;
    String forfatter;
    String iBSN_nummer;

    void skrivUt(){
        System.out.println("Tittelen :"+tittel);
        System.out.println("Prisen er : "+pris);
        System.out.println("Forfatteren er : "+forfatter);
        System.out.println("IBSN-nummeret er : "+iBSN_nummer);
    }
}

public class Oppgave1 {
    
    public static void main(String[] args) {
        Bøker bok1 = new Bøker();
        bok1.forfatter = "Næsbø";
        bok1.tittel = "Sønnen";
        bok1.pris = 345.00;
        bok1.iBSN_nummer = "12345678901";
        bok1.skrivUt();
    }
    
}
