class Bøker{
    public String tittel;
    public String pris;
    public String forfatter;
    public String isbnNummer;
    
    public void visTittel(){
        System.out.println("Tittel: "+tittel);
    }

    public void visPris(){
        System.out.println("Pris: " + pris);
    }

    public void visForfatter(){
        System.out.println("Forfatter: " + forfatter);
    }

    public void visIsbnNummer(){
        System.out.println("ISBN nummer: " + isbnNummer);
    }
}

public class Oppgave1 {
    public static void main(String[] args) {
        Bøker nyBøker = new Bøker();

        nyBøker.tittel ="Programmering";
        nyBøker.visTittel();
        nyBøker.pris ="300";
        nyBøker.visPris();
        nyBøker.forfatter ="Amalie";
        nyBøker.visForfatter();
        nyBøker.isbnNummer ="123456789";
        nyBøker.visIsbnNummer();



    }
}
