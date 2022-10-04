package FORELESNING;

import java.util.ArrayList;

public class ArrayListe {
    public static void main(String [] args) {
        ArrayList<String> liste = new ArrayList<>();

        System.out.println();

        liste.add("Rød");
        liste.add(0, "Blå");

        for(String farge : liste) {
            System.out.println(farge + " ");
        }
        
        System.out.println();
    
        // NY OPPGAVE

        liste.add("Grønn");
        liste.add("Gul");

        for(int i = 0; i < liste.size(); i++) {
            System.out.print(liste.get(i) + " ");
        }
        System.out.println();

        System.out.println();

        // NY OPPGAVE

        liste.remove("Blå");
        // liste.remove(1);
        for(String farge : liste) {
            System.out.print(farge + " ");
        }
        System.out.println();

        System.out.println();


        // NY OPPGAVE

        System.out.println(liste.size());
        System.out.println();

        if(liste.contains("Grønn")) {
            System.out.println("Grønn finnes i listen"); // lenket til linje 30 ( liste.remove(1); )
        }
        System.out.println();

        


    }
    
}