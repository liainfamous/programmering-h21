package introKlasserObjekter1;

import static javax.swing.JOptionPane.*;

/*
Utvid oppgave 3 med å lese inn dataene fra input-bokser og vise resultatet i en meldingsboks på følgende format:

Navn: Per Hansen
Adresse : Osloveien 82
Telefonnr : 22124512
Alder : 21 år.

Tips: bruk \n for å få ny linje
*/


class Person1{
    public String navn;
    public String adresse;
    public String telefonnummer;
    public int fødselsår;
    
    public int alder(){
        return 2018-fødselsår;
    }
    
    public void skrivUt(int alder){
        String ut = "Navn : "+navn+"\nAdresse : "+adresse+
                    "\nTelefonnummer : "+telefonnummer+"\nAlder "+alder+" år.";
        showMessageDialog(null,ut);
    }
}
public class Oppgave4 {
    public static void main(String[] args) {
      String innNavn = showInputDialog("Navn : "); 
      String innAdresse = showInputDialog("Adresse : "); 
      String innTelefonnr = showInputDialog("Telefonnr : "); 
      String innFødselsår = showInputDialog("Fødselsår : ");
      int fødselsår  = Integer.parseInt(innFødselsår);
      Person1 enPerson = new Person1();
      enPerson.navn = innNavn;
      enPerson.adresse = innAdresse;
      enPerson.telefonnummer = innTelefonnr;
      enPerson.fødselsår = fødselsår;
      int alder = enPerson.alder();
      enPerson.skrivUt(alder);
    }
}
