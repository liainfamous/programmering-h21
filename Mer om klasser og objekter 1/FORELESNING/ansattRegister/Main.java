package FORELESNING.ansattRegister;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String [] args) {
        Staff mainStaff = new Staff();
        showMessageDialog(null, "Employees: \n\n" + mainStaff);
    }
}
