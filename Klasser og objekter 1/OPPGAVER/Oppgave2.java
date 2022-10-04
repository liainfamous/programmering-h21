
import javax.swing.JOptionPane.*;

class Bøker{
    String tittel;
    double pris;
    String forfatter;
    String isbnNummer;
    
    void skrivUt() {
        String ut = "Tittelen: " + tittel + "\n" + "Prisen er :" + pris + " kr" + "\n" +
        "Forfatteren er: " + forfatter + "\n" + "ISBN-nummeret er " + isbnNummer;
        showMessageDialog(null, ut)
    }

public class Oppgave2 {
    public static void main(String[] args) {
        String innForfatter = showInputDialog("Forfatternavn: ");
        String innTittel = showInputDialog("Tittel: ");
        String innPris = showInputDialog("Pris: ");

        double pris = Double.parseDouble(innPris);

        String innNummer = showInputDialog("ISBN-nummeret: ");

        Bøker bok1 = new Bøker();
        bok1.forfatter = innForfatter;
        bok1.tittel = innTittel;
        bok1.pris = pris;
        bok1.isbnNummer = innNummer;
        bok1.skrivUt();

    }
}
