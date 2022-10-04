package Oppgave1;
import javax.swing.JOptionPane;

public class Oblig1Oppgave1 {
    public static void main(String[] args)  {
        //  Sett en variabel lik en verdi for radius
        String innRadius = JOptionPane.showInputDialog("Hvor stor er radiusen til sirkelen?");
        double radius = Double.parseDouble(innRadius);

    /* Kall så de statiske metodene i sirkel-klassen for å vise følgende på
       System.out (gitt radius lik 23.5)

       Arealet av sirkelen med radius 23.5 er 1734,94
       Omkretsen av sirkelen med radius 23.5 er 147,65
       Diameteren til sirkelen er med radius 23.5 er 47,00

       Tips : String.format("%.2f",desimalverdi); for å formatere to desimaler
    */

        double areal = Sirkel.beregneAreal(radius);
        double omkrets = Sirkel.beregneOmkrets(radius);
        double diameter = Sirkel.beregneDiameter(radius);

        String radiusDesimaler = String.format("%.2f", radius);
        String arealDesimaler = String.format("%.2f", areal);
        String omkretsDesimaler = String.format("%.2f", omkrets);
        String diameterDesimaler = String.format("%.2f", diameter);

        String ut =  "Arealet av sirkelen med radius " + radiusDesimaler + " er " + arealDesimaler + "\n" +
                "Omkretsen av sirkelen med radius " + radiusDesimaler + " er " + omkretsDesimaler + "\n" +
                "Diameteren til sirkelen er med radius " + radiusDesimaler + " er " + diameterDesimaler;

        System.out.println(ut);
    }
}

