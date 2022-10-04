public class Array {
    public static void main(String [] args) {
        
        int[] list = new int[4];
        list[0] = 23;
        list[1] = 2;
        list[2] = -4;
        list[3] = 5;
        
        String out = "Numbers in the list: ";
        out += list[0] + " ";
        out += list[1] + " ";
        out += list[2] + " ";
        out += list[3] + " ";
        System.out.println(out);

        // print with initializing (for-løkke)

        out = "Numbers in the list: ";
        for (int i = 0; i < list.length; i++) {
            out += list[i] + " ";
        }
        System.out.println(out);


    }
}