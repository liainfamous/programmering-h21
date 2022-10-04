package OPPGAVER ;

import static javax.swing.JOptionPane.*;

/*
Lag en klasse «Person» med følgende private attributter:

fornavn
etternavn
adresse
telefonnr

*/

// Lag en konstruktør som setter disse ved instansiering av klassen.

class Person{
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person(String fornavn, String etternavn, String adresse, String telefonnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    // Lag så «get», «set» metoder for disse.

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    // Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.
    
    public void skrivUt(){
        String ut = "Navn : "+fornavn+" "+etternavn+"\n"+
                    "Adresse : "+adresse+"\n"+
                    "Telefonnr : "+telefonnr+"\n";
        showMessageDialog(null,ut);
    }
}

// Skriv så kode i «main» for å lese inn dataene via Swing sin input, 
// opprette et objekt og kalle metoden over for å vise disse.

public class Oppgave1 {
    public static void main(String[] args) {
        String innFornavn = showInputDialog("Skriv inn fornavnet");
        String innEtternavn = showInputDialog("Skriv inn etternavnet");
        String innAdresse = showInputDialog("Skriv inn adressen : ");
        String innTelefonnr = showInputDialog("Skriv inn telefonnr");
        boolean hei=true;
        Person enPerson = new Person(innFornavn, innEtternavn, innAdresse, innTelefonnr);
        enPerson.skrivUt();
    }
}
