package OPPGAVER;

/*
Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. 
Klassen skal ha 5 private attributter:

Bensinstasjonens sted (en streng)
Type bensin (en streng)
Antall liter fylt (et desimaltall)
Prisen pr. liter (et desimaltall)
Tidspunkt fylt (en streng)

Klassen skal ha en konstruktør som initialiserer alle attributtene. 

Lag så en metode finnTotalPrisen. 
Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall. 
Metoden skal da multiplisere antall liter fylt med prisen pr. liter.

Lag så kode i main for å teste ut denne klassen.

*/

class BensinKjøp {

    private String sted;
    private String type;
    private double antallLiter;
    private double prisPrLiter;
    private String tidspunkt;

    public BensinKjøp(String sted, String type, double antallLiter, double prisPrLiter, String tidspunkt) {
        this.sted = sted;
        this.type = type;
        this.antallLiter = antallLiter;
        this.prisPrLiter = prisPrLiter;
        this.tidspunkt = tidspunkt;
    }

    public String getSted() {
        return sted;
    }

    public void setSted(String Sted) {
        this.sted = Sted;
    }

    public String getType() {
        return type;
    }

    public void setType(String Type) {
        this.type = Type;
    }

    public double getAntallLiter() {
        return antallLiter;
    }

    public void setAntallLiter(double antallLiter) {
        this.antallLiter = antallLiter;
    }

    public double getPrisPrLiter() {
        return prisPrLiter;
    }

    public void setPrisPrLiter(double prisPrLiter) {
        this.prisPrLiter = prisPrLiter;
    }

    public String getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt) {
        this.tidspunkt = tidspunkt;
    }
    
    public double finnTotalPrisen(){
        return antallLiter*prisPrLiter;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        BensinKjøp etKjøp = new BensinKjøp("Asker", "95", 49, 17.10, "10:30");
        double pris = etKjøp.finnTotalPrisen();
        String prisToDesimaler = String.format("%.2f", pris);
        String ut = "Det kostet totalt "+prisToDesimaler+" kr i "+etKjøp.getSted()+
                    " kl "+etKjøp.getTidspunkt();
        System.out.println(ut);
    }
}
