/* Lag en klasse kalt Person. Denne skal inneholde følgende attributter:

navn
adresse
telefonnr
fødselsår

Lag en metode for å regne ut alderen til en person. 
Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår. 
Metoden skal returnere alderen.

Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på 
følgende måte:

Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år.

Opprett et eller flere person objekter i main-metoden for å teste ut. */

import javax.swing.JOptionPane;

class Person {
    public String navn;
    public String adresse;
    public String telefonnummer;
    public String fødselsår;
    // int fødselsår;
}

public class Oppgave3 {
    public static void main(String [] args) {

        // Metode for å regne alderen til en person

        String innFødselsår = JOptionPane.showInputDialog("Skriv inn ditt fødselsår: ");
        
        int fødselsår = Integer.parseInt(innFødselsår);
        int år = 2021;
        int alder = år - fødselsår;

        String ut = "Alderen er " + alder;

        JOptionPane.showMessageDialog(null, ut);

        /* Lag så en metode som, tar inn alderen, og som skriver ut alle vitale data for personen på 
        følgende måte:
        
        Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år. */

        
        String innFulltNavn = JOptionPane.showInputDialog("Skriv inn ditt fulle navn");
        String innAdresse = JOptionPane.showInputDialog("Skriv inn adresse");
        String innTelefonnummer = JOptionPane.showInputDialog("Skriv inn telefonnummer");
        String innAlder = JOptionPane.showInputDialog("Skriv inn alder");

        String utOppgave3 = innFulltNavn + " med adresse " + innAdresse + " med telefonnummer " +innTelefonnummer + " er " +innAlder + " år.";

        JOptionPane.showMessageDialog(null, utOppgave3);

    }

    


    
}
