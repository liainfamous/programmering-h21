/* Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen. 
Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte: 
”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”

Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f" , omkretsen); for å få 2 desimaler. */

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4{
    public static void main(String[] args){

       
        String innRadius = showInputDialog("Skriv inn radiusen til sirkelen: ");

        double radius = Integer.parseInt(innRadius);
        double pi = 3.14;

        double omkrets = radius * pi;

        String omkretsenMedToDesimaler = String.format("%.2f", omkrets);


        String ut = "Omkretsen av en sirkel med " + radius + "cm som radius blir " + omkrets + " cm";

        showMessageDialog(null, ut);


    }
}



        