// OPPGAVE 1

/* Les inn to variabler; navn, alder. Skriv så følgende historie (et eksempel): 
Per Olsen er i dag 32 år. Han er født i 1986. 
!!! I 2053 er han 67 år og da vil han være pensjonist. */

import javax.swing.*;

public class Oppgave1 {
    public static void main(String [] args){

        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavn");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavn");
        String alder = JOptionPane.showInputDialog("Skriv inn alder");
        String årstall = JOptionPane.showInputDialog("Skriv inn årstall");

        JOptionPane.showMessageDialog(null, fornavn + " " + etternavn + " er i dag " + alder + "år." + " Han er født i " + årstall);


    }
}
