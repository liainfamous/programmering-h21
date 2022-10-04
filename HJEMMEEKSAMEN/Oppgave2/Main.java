package Oppgave2;

import Oppgave2.Person.*;

public class Main {
    public static void main(String [] args) {
        Pasient ole = new Pasient("Ole", "01019323456", 23, "Diabetes");
        Pasient kari = new Pasient("Kari","01029012345",32,"Migrene");
        Lege finn = new Lege("Finn","12128012345",40);
        finn.pasienter[0]=ole;
        finn.pasienter[1]=kari;
        System.out.println(finn);
    }
    
}
