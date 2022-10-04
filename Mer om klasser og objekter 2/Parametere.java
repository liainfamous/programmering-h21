public class Parametere {

    public static int antSekunder(int ... tid) {
        int total = 0; // antall sekunder som skal returneres
        int faktor = 3600;
        
        for (int antall : tid)
        {
            total += antall * faktor;
            faktor /= 60;
        }
        return total;
    }

    public static void main(String [] args) {
        System.out.println(antSekunder(24,60,3));       // 90003
        System.out.println(antSekunder(24,60));         // 90000
        System.out.println(antSekunder(24,0));          // 86400
        System.out.println(antSekunder(12,0));          // 43200
    }
    
}
