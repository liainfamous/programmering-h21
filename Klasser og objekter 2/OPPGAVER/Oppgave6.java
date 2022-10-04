package introKlasserObjekter2;

import static javax.swing.JOptionPane.*;

class Vind {
    
    private double vindhastighet = 0.0;
    
    public Vind (double vindhastighet) {
            this.vindhastighet = vindhastighet;
    }
    
    public double getVindhastighet(){
        return vindhastighet;
    }
    
    public boolean erOrkan() {
        if (vindhastighet > 120.0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean erStille() {
        if (vindhastighet < 2.0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public double getKnop() {
        double knop = vindhastighet / 1.852;
        return knop;
    }
    
    public int getBeaufort() {
        int beaufort =  (int) (Math.pow(vindhastighet / 3.01, 0.6666) +0.5);
        if (beaufort > 12) {
            beaufort = 12;
        }
        return beaufort;
    }
}


public class Oppgave6 {
    public static void main(String[] args) {
        String innVind = showInputDialog("Oppgi vindhastigheten");
        double vind = Double.parseDouble(innVind);
        Vind sjekkVind = new Vind(vind);
        String ut = "Vindhastigheten er "+sjekkVind.getVindhastighet()+"\n";
        if (sjekkVind.erOrkan()){
            ut+="Det er orkan!\n";
        }
        if(sjekkVind.erStille()){
            ut+="Det er stille\n";
        }
        String knop = String.format("%.2f", sjekkVind.getKnop());
        ut+="Det er "+knop+" knop\n";
        ut+="Og det tilsvarer "+sjekkVind.getBeaufort()+" på beaufort skalaen!";
        showMessageDialog(null, ut);
    }
}
