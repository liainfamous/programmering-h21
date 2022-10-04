// OPPGAVE 1

class Bøker{
    String tittel;
    double pris;
    String forfatter;
    String ISBN;

    /* eller 
    String tittel, forfatter, ISBN;
    double pris;
    */

    public void skrivUt (){
        System.out.println("Tittel: " + tittel);
        System.out.println("Forfatter: " + forfatter);
        System.out.println("Pris: " + pris);
        System.out.println("ISBN: " + ISBN);

    /* public class Main {
    public static void main(String [] args) {
        String tittel = "Harry Potter";
        double pris = 299.00;
        String forfatter = "JK";
        String ISBN = "34353";

        // Setter de inn i klasser for å unngå å skrive de flere ganger ex.
        
        String tittel2 = "Harry Potter";
        double pris2 = 299.00;
        String forfatter2 = "JK";
        String ISBN2 = "34353";
        */

    }
}

public class Main {
    public static void main(String [] args) {
        Bøker bok1 = new Bøker ();
        bok1.tittel = "Harry Potter";
        bok1.forfatter = "JK";
        bok1.pris = "299.90";
        bok1.ISBN = "32423";

        Bøker bok2 = new Bøker ();
        bok2.tittel = "Harry Potter 2";
        bok2.forfatter = "JK";
        bok2.pris = "299.90";
        bok2.ISBN = "32423";

        bok1.skrivUt();
        bok2.skrivUt();


        
    }

// OPPGAVE 2 UTVIDE OPPGAVE 1

public class Main {
    public static void main(String [] args) {
        Bøker bok1 = new Bøker ();
        bok1.tittel = JOptionPane.showInputDialog("Skriv inn tittel: ");
        bok1.forfatter = JOptionPane.showInputDialog("Skriv inn forfatte: r");
        bok1.ISBN = JOptionPane.showInputDialog("Skriv inn ISBN: ");

        String innPris = JOptionPane.showInputDialog("Skriv inn pris");

        double pris = 0;

        try {
            pris = Double.parseDouble(innPris);
        }
        catch (Exception e) {
            // JOptionPane.showMessage
            Dialog(null, "Det ble ikke skrevet inn et korrekt tall");
            // pris = 0;
            // velg EN av de
        }

        bok1.pris = pris;
        bok1.pris = skrivUt();

        // fjerne linjene 14-18

        public void skrivUt() {
            String ut = "Tittel: " + tittel + "\n" +
            "Forfatter: " + forfatter + "\n" +
            "Pris: " + pris + "\n" +
            "ISBN nummer: " + ISBN;
            JOptionPane.showMessageDialog(null, ut);



        }
    }


    // OPPGAVE 3

    public int regnUtAlder(){
        int alder = 2021 - fødeselsår
        return alder;
    }

    public class Main {
        Person person1 = new Person();
        person1.navn = "Navn";
        person1.adresse = "Adresse";
        person1.telefonnummer = "tlf";
        person1.fødseslår = "2310";

        person1.regnUtAlder(); // = alder;
        // System.out.println(person1.regnUtAlder));
        // System.out.println(alder);
    }