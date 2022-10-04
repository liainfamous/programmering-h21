import javax.swing.JOptionPane;

public class Dialogboks {
    public static void main(String [] args){

        // Metoder for utskrift av dialogbokser med "escape-tegnet \n"

        JOptionPane.showMessageDialog(null, "Hallo!\n" + 
            "Linje 1\n" + 
            "Linje 2");

        JOptionPane.showMessageDialog(
            null, "Hallo!\nLinje en\nLinje2" );

        

    }
}
