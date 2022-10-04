import javax.swing.JOptionPane;

public class IFsetninger1 {
    public static void main(String [] agrs) {
        String input = JOptionPane.showInputDialog("Fyll inn alderen din: ");
        int alder = Integer.parseInt(input);

        if (alder < 13) {
            JOptionPane.showMessageDialog(null, "Du er et barn");
        }
        else if (alder < 18) {
    //  if (alder >= 13 && alder < 18)
            JOptionPane.showMessageDialog(null, "Du er en ungdom");
        }
        else if (alder < 70) {
    // if (alder >= 18 && alder < 70)
            JOptionPane.showMessageDialog(null, "Du er voksen");
        }
        else {
            JOptionPane.showInputDialog(null, "Du er en pensjonist");
        }

        // MessageDialog nr. 2
        String ut = alder >= 18 ? "Du er voksen" : "Du er ikke voksen";
        JOptionPane.showMessageDialog(null, ut);
    }
    
}