package swinginput;

import static javax.swing.JOptionPane.*;

public class SwingInput {
    public static void main(String[] args) {
        String name;
        name = showInputDialog("Write your name here");
        showMessageDialog(null,"Welcome "+name);
    }
}
