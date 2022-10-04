// package strings;

public class combinedstrings {
    public static void main(String [] args){

        System.out.println();

        String name, address, phonenumber;
        name = "Person ";
        address = "Example address ";
        phonenumber = "12345678 ";
        String out = name+" "+address+" "+phonenumber;
        System.out.println(out);

        /* OUTPUT - "konkatinere strenger"
        Person Example address 12345678*/

        System.out.println();

        String name1, address1, phonenumber1;
        name1 = "Person";
        address1 = "Example address";
        phonenumber1 = "12345678";
        String out1 = name1+"\n"+address1+"\n"+phonenumber1;
        System.out.println(out1);

        /* OUTPUT - "nye linjer i strenger"
        Person
        Example address
        12345678*/

        System.out.println();

        String name2, address2, phonenumber2;
        name2 = "Person ";
        address2 = "Example address ";
        phonenumber2 = "12345678 ";
        System.out.println(name2);
        System.out.println(address2);
        System.out.println(phonenumber2);

        /* OUTPUT - "nye linjer i strenger"
        Person
        Example address
        12345678*/

        System.out.println();

        String name3 = "Example name";
        System.out.println(name3);

        /* OUTPUT - "Alternative output"
        Example name*/

        String name4 ="Example name";
        javax.swing.JOptionPane.showMessageDialog(null,name4);

        /* OUTPUT - "Alternative output" Java Swing
        Dialog box Message*/

        System.out.println();

        


    }
}

