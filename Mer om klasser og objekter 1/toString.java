class Person2 {
    public String personnummer;
    public String navn;
    public String adresse;
    public String telefonnummer;

    public String toString() {
        System.out.println();
        String ut = "Her er innholdet i objektet: \n";
        ut+= "Personnummer: " + this.personnummer + "\n";
        ut+= "Navn: " + this.navn + "\n";
        ut+= "Adresse: " + this.adresse + "\n";
        ut+= "Telefonnummer: " + this.telefonnummer + "\n";
        return ut;
    }
}

public class toString {

    public static void main(String [] args) {
        Person2 enPerson = new Person2();
        enPerson.personnummer = "01234567891";
        enPerson.navn = "Marius";
        enPerson.adresse = "Osloveien 82";
        enPerson.telefonnummer = "99887766";
        System.out.println(enPerson);
    }
    
}
