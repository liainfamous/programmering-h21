public class Vare {
    String navn;
    int antall;
    double pris;

    public Vare(String navn, int antall, double pris) {
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public string getNavn() {
        return navn;
    }

    // antall og pris må være større enn null

    public void setAntall(int antall) {
        if (antall > 0) {
            this.antall = antall;
        }
    }

    public int getAntall() {
        return antall;
    }

    public void setPris(double pris) {
        if (antall > 0) {
            this.pris = pris;
        }
    }

    public double getPris() {
        return pris;
    }
}

