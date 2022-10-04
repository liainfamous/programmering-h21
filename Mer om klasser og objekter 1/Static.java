class Bil {
    public String type;
    public static final int ANTALL_HJUL = 4;
    // en final bør stå med bare store bokstaver
}

public class Static {
    public static void main(String [] args) {

        Bil enBil = new Bil();
        enBil.type = "Volvo";
        // Bil.antallHjul = 4; - ikke nødvendig siden ANTALL_HJUL er allerede satt til 4 (linje 3)

        System.out.println(enBil.type + " har antall hjul " + Bil.ANTALL_HJUL);

        Bil enAnnenBil = new Bil();
        enAnnenBil.type = "Audi";

        // Bil.antallHjul = 3;

        System.out.println(enBil.type + " har antall hjul: " + Bil.ANTALL_HJUL);
    }
    
}
