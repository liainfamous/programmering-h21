public class Overloading {

    public static void main(String [] args) {
        System.out.println("Summen blir : " + summer(3.3,3.3));
        System.out.println("Summen blir : " + summer(3,3,3));
    }

    private static double summer(double tall1, double tall2) {
        double sum = tall1 + tall2;
        return sum; // Summen blir : 6.6
    }

    private static double summer(double tall1, double tall2, double tall3) {
        double sum = tall1 + tall2 + tall3;
        return sum; // Summen blir : 9.0
    }
    
}
