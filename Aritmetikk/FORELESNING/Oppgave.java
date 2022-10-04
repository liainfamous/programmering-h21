
// OPPGAVE 1
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave {
    public static void main(String [] args) {

        String navn = show.InputDialog ("Skriv inn navnet ditt);
        String innAlder = show.InputDialog("Skriv inn alderen din");

        int alder = Integer.parseInt(innAlder);
        int år = 2021;
        int fødselsår = år - alder;
        int pensjonistAlder = år + (67 - alder);

        String ut = navn + " er i dag" + alder + " år. Han er født i " + fødselsår + " ." + " I " + pensjonistalder + "er han 67 år og da vil han være pensjonist";

        .showMessageDialog(null, ut);
    }
}

// OPPGAVE 4

public class Oppgave {
    public static void main(String[] args) {

        String innRadius = showInputDialog("Skriv inn radius på sirkelen");
        double radius;

        try {
            radius = Double.parseDouble(innRadius);
        } catch (Exception e) {
            radius = 0;
        }

        double omkrets = 2 * 3.14 * radius;
        String omkretsenMedToDesimaler = String.format("%.2f, omkrets");
        showMessageDialog(null, "Omkretsen av en sirkel med " + radius + " blir " + omkretsenMedToDesimaler + " cm");
    }
}

// OPPGAVE 7

public class Oppgave {
public static void main(String [] args) {

        String innPizza = showInputDialog("Skriv inn antall pizza");
        String innPersoner = showInputDialog("Skriv inn antall personer");
        String innAntallSlices = showInputDialog("Skriv inn antall slices");

        int antallPizza = Integer.parseInt(innPizza);
        int antallPersoner = Integer.parseInt(innPersoner);
        int antallSlices = Integer.parseInt(innAntallSlices);

        //  int totalAntallSlices = antallSlices*antallPizza;
      //    int totalAntallSlicesPerPerson = (antallSlices*antallPizza)/antallPersoner;

      int slicesTilOvers = (antallSlices*antallPizza)%antallPersoner;

      // modulus %

      String ut = "Dersom man er " + antallPersoner + " personer og har " + antallPizza + " med antall " + antallSlices" + 
      "slices per pizza får hver person " + antallSLicesPerPersoner" .....

      showMessageDialig(null, ut)

    }    
}

// OPPGAVE 11


public class Oppgave {
    public static void main(String [] args) {

        String innTall = showInputDialog("Skriv inn et tall");

        int tall = Integer.parseInt(innTall);

        int tall3 = tall % 10; // 751 % 10 = 1
            tall /= 10; // 751/10 = 75
        int tall2 = tall / 10; // 75%10 = 5
        int tall1 =  tall1/10; 

        int sum = tall1 + tall2 + tall3

        System.out.println(tall1 + " " + tall2 + " " + tall3 + " = " + sum);




