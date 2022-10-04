import javax.swing.*;

public class Tall_Divisjon {

    public static void main(String[] args){

        // Divisjon med heltall (int) // ex. 7.0
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        double divisjon = tall1 / tall2;
        JOptionPane.showMessageDialog(null, "Divisjonen ble :"+divisjon);

    public static void main(String[] args){
        // Divisjon med desimaltall // ex. 7.7643
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        double divisjon = tall1 / tall2;
        System.out.println("Divisjonen ble : " +divisjon);
        
    
        // Printes i meldingsboks via JOptionPane // JOptionPane.showMessageDialog(null, "Divisjonen ble :"+divisjon)
        // Printes i Terminal // System.out.println("Divisjonen ble : " +divisjon);


    }
}
