import static javax.swing.JOptionPane.*;

public class Oppgave3{
    public static void main(String [] args){

        String innTall1 = showInputDialog("Skriv inn et tall:");
        String innTall2 = showInputDialog("Skriv inn et tall til:");
        String innTall3 = showInputDialog("Skriv inn et tall til:");

        double tall1 = Double.parseDouble(innTall1);
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
