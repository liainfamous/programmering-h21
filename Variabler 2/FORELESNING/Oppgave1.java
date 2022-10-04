// OPPGAVE 1

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
// eventuelt import static javax.swing.JOptionPane.*; imprterer begge samtidig

public class Oppgave1{

    public static void main(String[] args) {

        String innAlder = showInputDialog("Skriv inn alderen din");
        int alder = Integer.parseInt(innAlder);
        // gjøre alder om (parse) til et helttall
        showMessageDialog(null, "Min alder er " + alder + " år."); 

    }
}


