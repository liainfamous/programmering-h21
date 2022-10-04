public class Array1 {
    public static void main(String [] args) {
        int[] list = {23,2,-4,5};
        String out = "Numbers in the list: ";
        for (int i = 0; i < list.length; i++) {
            out += list[i] + " ";
        }
        System.out.print(out);
    }
    
}
