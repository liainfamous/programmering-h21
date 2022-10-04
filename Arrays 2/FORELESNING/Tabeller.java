package FORELESNING;

// Tabeller - Matrix

public class Tabeller {
    public static void main(String [] args) {
       
        // 2, 3
        // 4, 5
        
        int[][] tabell = new int[2][2];
        tabell[0][0] = 2;
        tabell[0][1] = 3;
        tabell[1][0] = 4;
        tabell[1][1] = 5;

        int [][] tabell1 = {{2, 3}, {4, 5}};

        for(int i = 0; i < tabell.length; i++) {
            for(int j = 0; j < tabell[0].length; j++) {
                System.out.print(tabell[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("- - - - - - - - -");

        // for each - for-løkke

        for(int[] liste: tabell) {
            for(int tall: liste) {
                System.out.print(tall + "\t");
            }
            System.out.println();  
        }
        System.out.println("- - - - - - - - -");

        String[][] tabell2 = {{"rød", "blå"}, {"gul", "grønn", "svart"}};
        for(String[] liste: tabell2) {
            for(String farge: liste) {
                System.out.print(farge + "\t");
            }
            System.out.println();
        }
        System.out.println("- - - - - - - - -");







    }
    
}
