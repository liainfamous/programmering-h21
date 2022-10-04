package introKlasserObjekter1;

import static javax.swing.JOptionPane.*;

//Utvid oppgave 1 til å lese inn de nødvendige dataene fra input-bokser og skrive resultatet ut i en meldingsboks.

class Bøker2{
    // trenger ikke public heller...
    String tittel;
    double pris;
    String forfatter;
    String iBSN_nummer;
    
    void skrivUt(){
        String ut = "Tittelen :"+tittel+" Prisen er :"+pris+" kr "+
                    " Forfatteren er : "+forfatter+" IBSN-nummeret er : "+iBSN_nummer;
        showMessageDialog(null,ut);
    }
}
public class Oppgave2 {
    public static void main(String[] args) {
        String innForfatter = showInputDialog("Forfatternavn : ");
        String innTittel = showInputDialog("Tittel : ");
        String innPris = showInputDialog("Pris : ");
        double pris = Double.parseDouble(innPris);
        String innNummmer  = showInputDialog("IBSN-nummeret : ");
        Bøker2 bok1 = new Bøker2();
        bok1.forfatter = innForfatter;
        bok1.tittel = innTittel;
        bok1.pris = pris;
        bok1.iBSN_nummer = innNummmer;
        bok1.skrivUt();
    }
}
