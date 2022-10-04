package oblig2oppgave2;

import javax.swing.JOptionPane;

class Tallspill {

        // Definere variablene
        public int slumpTall = 0;
        int gjetning = 0;
        int antall = 0;

    public int nyttTall() {
        // Trekker og returnerer et slumptall mellom 0 og 200.
        // Tips bruk : (int) (Math.random() * 201), som gir verdier mellom 0 og 200

        return slumpTall = (int) (Math.random() * 201);
    }
    public void visMelding(String melding){
        // Viser parameterens innhold i en meldingsboks. 
        JOptionPane.showMessageDialog(null, melding);
      }
    
      private void forLite(int tall){
        /* Viser melding om at parameterens verdi er for
           lite tall og ber spilleren prøve igjen. */
           if (tall < slumpTall) {
               visMelding(tall + " er et for lite tall, vennligst prøv igjen!");
               String innTall = JOptionPane.showInputDialog("Skriv inn et nytt tall: ");
               this.gjetning = Integer.parseInt(innTall);
           }
      }

    
      private void forStort(int tall) {
        /* Viser melding om at parameterens verdi er for
          stort tall og ber spilleren prøve igjen. */
          if (tall > slumpTall) {
              visMelding(tall + " er et for stort tall, vennligst prøv igjen!");
              String innTall = JOptionPane.showInputDialog("Skriv inn et nytt tall: ");
              this.gjetning = Integer.parseInt(innTall);
          }
      }
    
      public void avsluttRunde(int antall, int gjetning) {
        /* Viser melding om at det ble gjettet riktig
          og antall gjetninger som ble brukt.
          Parametrene gir opplysninger om dette. */
          visMelding(gjetning + " er riktig!" + "\n"
          + "Du gjettet riktig på " + antall + " forsøk :)");
      }
    
      public void kjørSpill() {
        /* Kjører en spillrunde ved å trekke et tall,
          nullstille tellevariabel, innhente gjentatte gjetninger fra bruker inntil det gjettes riktig.
          Når det skjer, avsluttes runden med passe meldinger til spilleren. */
          String innTall = JOptionPane.showInputDialog("Jeg tenker på et tall mellom 0 og 200." + "\n"
          + "Prøv å gjette på tallet");
          nyttTall();
          antall = 0;

          do {
            forLite(gjetning);
            forStort(gjetning);
            antall++;

            if (gjetning == slumpTall) {
              avsluttRunde(antall, gjetning);
            }
          } 
          while (gjetning != slumpTall);
        }
}