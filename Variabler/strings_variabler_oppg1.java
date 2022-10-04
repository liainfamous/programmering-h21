// OPPGAVER TIL VARIABLER 1

// Oppgave 1

package strings;

public class strings_variabler_oppg1 {
    public static void main(String [] args){

        System.out.println();

        String innFornavn = showInputDialog("Fornavn:");
        String innEtternavn = showInputDialog("Etternavn:");
        showMessageDialog(null,innFornavn+innEtternavn);

        String ut = innFornavn+"\n"+innEtternavn;
        System.out.println(ut);

    }
    
}
