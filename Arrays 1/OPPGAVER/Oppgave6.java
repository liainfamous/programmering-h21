/*
Lag et program som sjekker om to heltalls-arrays er like.
*/

package OPPGAVER;

public class Oppgave6 {
    public static void main(String [] args) {

    int [] liste = {45,24,5,8,10,2,13,25};
    int [] liste1 = {45,24,5,8,10,2,13,25};

    if (liste.length != liste1.length) {
        System.out.println("Arrayene er ikke like");
    }
    else {
        boolean like = true;
        for (int i = 0; i < liste.length; i++) {
            if(liste[i] != liste1[1]) {
                like = false;
            }
        }
        if(like) {
            System.out.println("Arrayene er like");
        }
        else {
            System.out.println("Arrayene er like lange, men har forskjellige elementer");
        }
    }
    }
    
}
