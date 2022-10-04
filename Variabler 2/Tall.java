package tall;

import javax.swing.*;

public class Tall {
    public static void main(String [] args){

        System.out.println();

        // Heltall // ex. 34
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        int sum = tall1 + tall2;
        System.out.println("Summen av de to tallene blir : "+sum);
       
        // Desimaltall // ex. 45,5
       String innStreng3 = JOptionPane.showInputDialog("Skriv inn et desimaltall");
       String innStreng4 = JOptionPane.showInputDialog("Skriv inn et desimaltall til");
       double tall3 = Double.parseDouble(innStreng3);
       double tall4 =Double.parseDouble(innStreng4);
       System.out.println("Divisjonen ble " +divisjon);

       // Divisjon med heltall
       String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
       String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til");
       int tall1 = Integer.parseInt(innStreng1);
       int tall2 = Integer.parseInt(innStreng2);
       double divisjon = tall1 / tall2;
       System.out.println("Summen av de to tallene blir : "+sum);

    
    }
}
