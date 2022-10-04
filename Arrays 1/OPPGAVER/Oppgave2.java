/* 
1. Bruk arrayet i oppgave 1. 
2. Summer alle tallene med en for-løkke. 
3. Finn så gjennomsnittet av alle tallene. 
4. Summer så alle tallene som er større enn 5.
5. Finn så gjennomsnittet av disse. 
6. Summer så tallene med en forenklet for-løkke.

*/

package OPPGAVER;

public class Oppgave2 {
    public static void main(String [] args) {
        int [] liste = {1,2,3,4,5,6,7,8,9}; // 1.
        int sum = 0;
        for (int i = 0; i < liste.length; i++) { // 2.
            sum += liste[i];
        }
        System.out.println("Summen av listen er " + sum);
        double gjennomsnitt = (double)sum/liste.length; // 3.
        sum = 0;

        int teller = 0;
        for (int i : liste) {
            if (i > 5) { // 4.
                sum += i;
                teller++;
            }
        }
        System.out.println("Summen av tallene over 5 i listen er " + sum);
        gjennomsnitt = (double)sum/teller;
        System.out.println("Gjennomsnittet er av de samme tallene er " + gjennomsnitt);

    }
    
}
