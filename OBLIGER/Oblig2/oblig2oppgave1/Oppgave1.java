package oblig2oppgave1;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String [] args) {

        // Definere variablene - største, minste, sum
        int sum = 0;
        int minste;
        int største;

        // Lese inn nedre og øvre grense for summen
        String innMinste = JOptionPane.showInputDialog("Skriv inn det minste tallet");
        String innStørste = JOptionPane.showInputDialog("Skriv inn det største tallet");

        while(true) {

            try{
                minste = Integer.parseInt(innMinste);
                største = Integer.parseInt(innStørste);

                // mindre eller lik
                if(minste > 0 && minste < største) {
                    break;
                }
                throw new Exception();

                // Skrive ut en melding til brukeren og foreta ny innlesing
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Her gikk noe galt");
                innMinste = JOptionPane.showInputDialog("Skriv inn det minste tallet igjen");
                innStørste = JOptionPane.showInputDialog("Skriv inn det største tallet igjen");
            }
        }

        minste = Integer.parseInt(innMinste);
        største = Integer.parseInt(innStørste);

        // Programmet skal beregne nevnte sum og summen skal så skrive den ut som en sum
        
        while(minste <= største) {
            System.out.print(minste);
            sum = sum + minste;

            if(minste < største) {
                System.out.print(" + ");
            }else {
                System.out.print(" = " + sum);
            }
            if(minste % 10 == 0) {
                System.out.print("\n");
            }
            minste++;

        }


    }
}