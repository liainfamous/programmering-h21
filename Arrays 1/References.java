// Referanser inn i metoder

class Bil {
    private String farge;

    public Bil(String farge) {
        this.farge = farge;
    }
    public void setFarge(String farge) {
        this.farge = farge;
    }
    public String getFarge() {
        return farge;
    }
}

public class References {

    private static void referanseTest(Bil [] listeAvBiler, String farge) {
        farge = "Grønn";
        listeAvBiler[0].setFarge(farge);
    }

    public static void main(String [] args) {
        Bil [] biler = new Bil [3];

        Bil volvo = new Bil("Rød");
        Bil audi = new Bil("Svart");

        biler[0] = volvo;
        biler[1] = audi;

        String farge = "Blå";

        referanseTest(biler, farge);

        System.out.println("Fargen til volvoen er :" + biler[0].getFarge());
        System.out.println("Fargen til audien er: " + biler[1].getFarge());
        System.out.println("Variablen farge er nå: " + farge);
    }
    
}
