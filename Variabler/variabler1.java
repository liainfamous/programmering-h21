// OPPGAVER TIL VARIABLER 1
// OPPGAVE 1-4

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class variabler1 {

    public static void main(String[] args) {

        String fornavn = showInputDialog("Skriv inn fornavn: ");
        String etternavn = showInputDialog("Skriv inn etternavn: ");

        String alder = showInputDialog("Skriv inn alder: ");

        String adresse = showInputDialog("Skriv inn adressen: ");
        String postnummer = showInputDialog("Skriv inn postnummer: ");
        String postadressen = showInputDialog("Skriv inn postadressen");

        showMessageDialog(null, "Navn: " + fornavn + " " + etternavn + "\n" + "Adresse: " + adresse + "\n"
                + "Postnummer: " + postnummer + "\n" + "Poststed: " + postadressen + "\n" + "Alder: " + alder);
    }
}

// System.out.println() - String(ut) Linje 16-17 (innString)
