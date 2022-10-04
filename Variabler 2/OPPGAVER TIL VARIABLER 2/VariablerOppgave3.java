// OPPGAVER TIL VARAIBLER 2

// OPPGAVE 3

/* Utvid programmet i oppgave 2 og beregn gjennomsnittet av tallene som er lest inn. 
Vis så dette resultatet via 1) Meldingsboks og 2) System.out.".*/

import javax.swing.*;

public class VariablerOppgave3 {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn det første desimaltallet");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn det andre desimaltallet");
        String innStreng3 = JOptionPane.showInputDialog("Skriv inn det tredje desimaltallet");
        
        double tall1 = Double.parseDouble(innStreng1);
        double tall2 = Double.parseDouble(innStreng2);
        double tall3 = Double.parseDouble(innStreng3);

        int tall4 = 3;
        
        double sum = tall1 + tall2 + tall3;



        JOptionPane.showMessageDialog(null, "Gjennomsnittet av tallene er " + sum / tall4);

        System.out.println(sum/tall4);


    }
}