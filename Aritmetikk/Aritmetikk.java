public class Aritmetikk {
    public static void main(String[] args) {

        double tall1;
        double tall2;
        double resultat;

        tall1 = 3;
        tall2 = 2;

        // Viser hvordan de ulike aritmetiske operasjoner i Java brukes

        resultat = tall1 + tall2; // gir 5
        resultat = tall1 - tall2; // gir 1
        resultat = tall1 / tall2; // gir 1.5
        resultat = tall1 * tall2; // gir 6
        resultat = tall1 % tall2; // gir 1

    }
}

// Ved mer komplekse utregninger så foregår disse fra venstre til høyre og
// utrykk i parenteser utføres først.
// Multiplikasjon (*) og divisjon (/) utføres før addisjon (+) og subtraksjon (-)



// Dersom vi har to hell tall som skal deles med hverandre og man ikke ønsker en
// heltallsdivisjon kan man gjøre følgende

public class Aritmetikk
public static void main(String [] args){
        
        int tall1;
        int tall2;

        double resultat;
        resultat = (double) tall1 / (double) tall2;

// Her "castes" (omgjøres) tall1 og tall2 til double før divisjonen.
// Det betyr at resultatet blir en vanlig divisjon med desimaltall. Det blir ingen endringer
// i typen til tall1 og tall2 etter dette, de vil fortsatt være int (det er ikke mulig å endre
// en variabels type i Java)