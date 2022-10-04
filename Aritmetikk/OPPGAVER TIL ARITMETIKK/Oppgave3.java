
/* Lag et program som regner ut arealet av et rektangel. Programmet skal lese inn lengden og bredden på rektangelet.  
Regn så ut  arealet og skriver ut svaret på følgende måte: ”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”. */

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave3 {
    public static void main(String[] args){


        String innBredde = showInputDialog("Skriv inn bredden av rektangelet: ");
        String innLengde = showInputDialog("Skriv inn lengden av rektangelet: ");

        double bredde = Integer.parseInt(innBredde);
        double lengde = Integer.parseInt(innLengde);

        double sum = bredde * lengde;

        String ut = "Et rektangel med bredde " + bredde + " cm" + " og lengde " + lengde +
        " cm har et areal på " + sum + " cm^2" ;

        showMessageDialog(null, ut);

    }
}
