import javax.swing.JTextArea;
// import javax.swing.JOptionPane.*;

public class UnikeTall{
    // Deklarasjon av array for lagring av tilfeldige heltall
    int [] talliste;
    public void talliste1() {
    }

    /* Konstruktør som mottar arrayets lengde som parameter og
      oppretter arrayet.  */
    public UnikeTall(int input) {
        talliste = new int[input];
    }
    
    /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
      Tallet det letes etter skal mottas som parameter.
      Metoden skal returnere true hvis tallet finnes i arrayet.
      Hvis ikke skal metoden returnere false. */

    public UnikeTall() {
    }

    public boolean finnesTall(int tall) {
        for (int i = 0; i < talliste.length; i++) {
            if (tall == talliste[i]) {
                return true;
            }
        }
        return false;
    }
 
    /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
      begge grenser inkludert. Metoden skal gjøre dette på en måte
      som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
      parametre og heller ikke returnere noen verdi.  
      Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
    */

    public void tilfeldigeTall() {
        int random = 0;
        for (int i = 0; i < talliste.length; i++) {
            random = (int)(Math.random()*(900)+100);

            if (finnesTall(random) == true) {
                i--;
            } else {
                talliste[i] = random;
            }
        }
    }
 
    // Metode som finner og returnerer det minste tallet i arrayet.
    
    public int minsteTallet() {
        int minsteTallet = Integer.MAX_VALUE;
        for (int i = 0; i < talliste.length; i++) {
            if (minsteTallet > talliste[i]) {
                minsteTallet = talliste[i];
            }
        }
        return minsteTallet;
    }
 
    // Metode som finner og returnerer det største tallet i arrayet.

   public int størsteTallet() {
        int størsteTallet = Integer.MIN_VALUE;
        for (int i = 0; i < talliste.length; i++) {
            if (størsteTallet < talliste[i]) {
                størsteTallet = talliste[i];
            }
        }
        return størsteTallet;
    }

 
    /*  Metode som beregner og returnerer den gjennomstnittlige verdien
      (double-verdi) av tallene i arrayet.  */

    public double gjennomsnittet() {
        double gjennomsnittet = 0;
        for (int i = 0; i < talliste.length; i++) {
            gjennomsnittet = gjennomsnittet + talliste[i];
        }
        gjennomsnittet = (double) gjennomsnittet / talliste.length;
        return gjennomsnittet;
    }
 
    /* Metode som viser tallene i arrayet i en meldngsboks. 
      I tillegg skal det, i meldingsboks, skrives ut
      opplysninger om hvilket tall som er minst, hvilket som er størst, og hva som er gjennomsnittsverdien, jfr bildet over. 
      Gjennomsnittverdien skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
      Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
      per linje. */

     public void utskrift(utskrift) {
            tilfeldigeTall();
        for (int i = 0; i < talliste.length; i++) {
            arraylisten.append(talliste[i] + " ");

            if ((i+1) % 8 == 0) {
                arraylisten.append("\n");
            }

            if (i != talliste.length - 1) {
                arraylisten.append(" ");
            } else {
                arraylisten.append("");
            }
        }

        String utskrift = "\n"
            + "Minste tallet: " + minsteTallet() + "\n"
            + "Største tallet: " + størsteTallet() + "\n"
            + "Gjennomsnittsverdien: " + gjennomsnittet() + "\n";

    }
}
