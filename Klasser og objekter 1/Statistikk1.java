package canvas;

import java.text.DecimalFormat;
// import til formelen i linje 16

public class Statistikk1 {

    private static double beregnAreal(double radius) {
        double areal = Math.PI * Math.pow(radius,2);
        return areal;
    }

    public static void main(String [] args) {
        double radius = 23.23;
        double areal = beregnAreal(radius);
        DecimalFormat df2 = new DecimalFormat(".##"); // formaterer slik at man får 2 desimaler for tallet
        System.out.println("Arealet til en sirkel med radius " + radius + " er " + df2.format(areal));
        // df2.format(areal) gir kall på funksjonen i linje 15
    }

    
}
