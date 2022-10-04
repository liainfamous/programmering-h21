package introKlasserObjekter1;
/*
Lag en klasse kalt Kalkulator. 
Denne klassen skal ha 4 statiske metoder som tar inn 2 parametere hver. 
Disse statiske metodene skal henholdsvis addere, subtrahere, multiplisere og dividere to desimaltall og returnere resultatet.

Skriv også kode i main-metoden for å kalle disse metodene for å sjekke at de fungerer.
*/
class Kalkulator{
    public static double addere(double tall1, double tall2 ){
        double sum = tall1+tall2;
        return sum;
    }
    public static double subtrahere(double tall1, double tall2 ){
        double sum = tall1-tall2;
        return sum;
    }
    public static double multiplisere(double tall1, double tall2 ){
        double gange = tall1*tall2;
        return gange;
    }
    public static double dividere(double tall1, double tall2 ){
        double dele = tall1/tall2;
        return dele;
    }
}

public class Oppgave5 {
    public static void main(String[] args) {
        System.out.println("2 + 2 er "+Kalkulator.addere(2, 2));
        System.out.println("2 - 2 er "+Kalkulator.subtrahere(2, 2));
        System.out.println("2 * 2 er "+Kalkulator.multiplisere(2, 2));
        System.out.println("2 / 2 er "+Kalkulator.dividere(2, 2));
    }
    
}
