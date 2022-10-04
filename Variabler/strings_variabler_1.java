import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class strings_variabler_1 {

    public static void main(String[] args) {

	    String innFornavn = showInputDialog("Skriv inn fornavn: ");
	    String innEtternavn = showInputDialog("Skriv inn etternavn: ");
        String innAlder = showInputDialog("Skriv inn alder: ");
	    
	    String ut = "Navnet: "+innFornavn+" "+innEtternavn;
	    showMessageDialog(null,ut);


        String ut2 = "Alderen til "+innFornavn+" "+innEtternavn+" "+innAlder;





    }

}