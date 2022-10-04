import javax.swing.JOptionPane;
public class Vare {
            String navn;
            int antall;
            double pris;
        
            // Konstruktør med alle attributter
            public Vare(String navn, int antall, double pris) {
                this.navn = navn;
                this.antall = antall;
                this.pris = pris;
            }
        
            // get / set metoder
        
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
        
            // metode for å beregne totalpris (pris * antall)
        
            public void totalpris(double totalpris) {
                totalpris = (pris * antall);
            }

             public int totalpris() {
                return 0;
            } 
        }
        
        public class Oblig1Oppgave2 {
        
            public static void main(String[] args){
        
                // les inn navn, antall og pris for vare 1

                String navn1 = JOptionPane.showInputDialog("Skriv inn navnet til den første varen: ");
                String innAntall1 = JOptionPane.showInputDialog("Antall av varen: ");
                String innPris1 = JOptionPane.showInputDialog("Prisen for varen: ");

                int antall1 = Integer.parseInt(innAntall1);
                double pris1 = Double.parseDouble(innPris1);
        

                // les inn navn, antall og pris for vare 2

                String navn2 = JOptionPane.showInputDialog("Skriv inn navnet til den andre varen: ");
                String innAntall2 = JOptionPane.showInputDialog("Antall av varen: ");
                String innPris2 = JOptionPane.showInputDialog("Prisen for varen: ");

                int antall2 = Integer.parseInt(innAntall2);
                double pris2 = Double.parseDouble(innPris2);

        
                /* bruk avvikshåntering (try/catch) for å 
                konvertere antall og pris for vare 1 og vare 2
                */

                // VARE 1

                try{
                    antall1 = Integer.parseInt(innAntall1);
                }catch(Exception e) {
                    antall1 = 0;
                }
                
                try{
                    pris1 = Integer.parseInt(innPris1);
                }catch(Exception e) {
                    pris1 = 0;
                }

                 // VARE 2

                 try{
                    antall2 = Integer.parseInt(innAntall2);
                 }catch(Exception e) {
                    antall2 = 0;
                 }

                 try{
                    pris2 = Integer.parseInt(innPris2);
                 }catch(Exception e); {
                    pris2 = 0;
                 }

                
        
                // opprett to vare-objekter med de innleste verdiene

                Vare Vare1 = new Vare(navn1, antall1, pris1);

                Vare Vare2 = new Vare(navn2, antall2, pris2);
        
                
                // beregn og skriv ut total pris for alle varer i System.out

                System.out.println("Totalprisen ble: " + (Vare1.totalpris() + Vare2.totalpris()) + " kr");
        

        
            }
        }