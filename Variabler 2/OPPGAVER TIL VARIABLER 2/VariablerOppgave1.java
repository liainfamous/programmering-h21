// OPPGAVER TIL VARAIBLER 2

// OPPGAVE 1

/* Lag et program som leser inn alderen din (et heltall). Vis så denne i en meldingsboks sammen med en tekst
f.eks som "Min alder er 19 år".*/

import javax.swing.*;

public class VariablerOppgave1 {
    public static void main(String [] args){

        String innStreng1 = JOptionPane.showInputDialog("Skriv inn alder");
        int tall1 = Integer.parseInt(innStreng1);
        int sum = tall1;
        JOptionPane.showMessageDialog(null, "Min alder er "+tall1+" år");
    }
}
