public class Array3 {

    private static int[] liste = {1,2,3,4,5};

    private static void skrivArray(int[] innListe) {
        innListe[0]=200;
        for (int tall : innListe) {
            System.out.print(tall + " ");
        }
    }

    public static void main(String [] args) {
        liste[1]=300;
        for (int tall : liste) {
            System.out.print(tall + " ");
        }
        // 1 300 3 4 5

        System.out.println();
        skrivArray(liste);
        // 200 300 3 4 5
        // går inn i linje 6-8 og bruker mainmetoden skrivArray

        System.out.println();
        for (int tall : liste) {
            System.out.print(tall + " ");
        // 200 300 3 4 5
        }
    }
    
}
