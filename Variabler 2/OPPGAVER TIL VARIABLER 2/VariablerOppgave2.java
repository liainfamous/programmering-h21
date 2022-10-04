// OPPGAVER TIL VARAIBLER 2

// OPPGAVE 2

/* Lag et program som leser inn tre desimaltall. Programmet skal så summere disse tallene og 
vise summen i System.out */

import javax.swing.*;

public class VariablerOppgave2 {

    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn det første desimaltallet");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn det andre desimaltallet");
        String innStreng3 = JOptionPane.showInputDialog("Skriv inn det tredje desimaltallet");
        double tall1 = Double.parseDouble(innStreng1);
        double tall2 = Double.parseDouble(innStreng2);
        double tall3 = Double.parseDouble(innStreng3);
        double sum = tall1 + tall2 + tall3;
        System.out.println("Summen av tallene er " +sum);
    }
}

// Desimaltallene må skrives slik "45.56", IKKE "45,56"

