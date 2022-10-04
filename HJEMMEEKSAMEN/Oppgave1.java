import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String [] args) {
        // Lese inn en String fra en INPUTDIALOG hvor det skal oppgis hva det
        // skal konverteres fra (C eller F skal skrives inn)
        String fEllerC = showInputDialog("Oppgi hva det skal konverteres fra (C eller F)");
        // Les så inn gradene fra en ny inputdialogboks
        String innGrader = showInputDialog("Oppgi gradene i " + fEllerC);
        // Konvertere gradene til en double
        double grader = Double.parseDouble(innGrader);
        // avhengig av om det er lest inn konvertering til C eller F
        // dersom ingen av delen skrives inn gis det melding om det isteden for konverteringen
        double resultat;
        // formler for resultatet i inputboksen
        String resultatString="";
        if(fEllerC.equals("C")) {
            // fra C : F = C * 1.8 + 32
            resultat = grader * 1.8 + 32;
            resultatString = grader + " C gir " + String.format("%.2f", resultat) + " F";
        }
        else if(fEllerC.equals("F")) {
            // fra F : C = (F - 32) / 1.8
            resultat = (grader - 32) / 1.8;
            resultatString = grader + "F gir " + String.format("&.2f", resultat);
        }
        else {
            resultatString = "Feil, ikke skrevet inn hverken F eller C";
        }
        // skriv tilslutt ut resultatet med passende ledetekst med to desimaler i en meldingsboks
        showMessageDialog(null, resultatString);

    }
}