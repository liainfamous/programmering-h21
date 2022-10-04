



// OPPGAVE 2

import static javax.swing.JOptionPane.*;

public class Oppgave2Leksjon{
    public static void main(String [] args){

        String innTall1 = showInputDialog("Skriv inn et desimaltall");
        String innTall2 = showInputDialog("Skriv inn et til desimaltall");
        String innTall3 = showInputDialog("Skriv inn et til desimaltall");

        double tall1 = Double.parseDouble(innTall1);
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);

        double sum = tall1 + tall2 + tall3;

        System.out.print("Summen av tallene er " + tall1 + " , " + tall2 + " , " + tall3);
        System.out.println(" er " + sum);

    }
}

// OPPGGAVE 3

import static javax.swing.JOptionPane.*;

public class Oppgave3Leksjon{
    public static void main(String [] args){

        String innTall1 = showInputDialog("Skriv inn et tall:");
        String innTall2 = showInputDialog("Skriv inn et tall til:");
        Stirng innTall3 = showInputDialog("Skriv inn et tall til:");

        double tall1 = Double.parseDouble(innTall1)
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);

        double sum = tall1 + tall2 + tall3;

        double gjennomsnitt = sum / 3;

        String ut = "Summen av tallene " + tall1 + " , " + tall2 + " , " + tall3 + " er " + sum + "\n" + 
        "Gjennomsnittet av tallene er " + gjennomsnitt;

        showMessageDialog(null, ut);
        System.out.println(ut);

    }
}

// OPPGAVE 4

import static javax.swing.JOptionPane.*;

public class Oppgave4Leksjon{
    public static void main(String [] args){

        String innTall1 = showInputDialog("Skriv inn et tall:");
        String innTall2 = showInputDialog("Skriv inn et tall til:");
        Stirng innTall3 = showInputDialog("Skriv inn et tall til:");

        double tall1, tall2, tall3;
        try {
            tall1 = Double.parseDouble(innTall1);¨
            tall2 = Double.parseDouble(innTall2);
            tall3 = Double.parseDouble(innTall3);
        }catch(Exception e){
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;
        }
    
        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = sum / 3;

        String ut = "Summen av tallene " + tall1 + " , " + tall2 + " , " + tall3 + " er " + sum + "\n" + 
        "Gjennomsnittet av tallene er " + gjennomsnitt;

        showMessageDialog(null, ut);
        System.out.println(ut);

    }
}





















