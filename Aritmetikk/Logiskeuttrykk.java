import javax.swing.JOptionPane; 
public class Logiskeuttrykk { 
    public static void main(String[] args) {
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn tall1"); 
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn tall2"); 
        int tall1 = Integer.parseInt(innStreng1); 
        int tall2 = Integer.parseInt(innStreng2); 
        if (tall1 == tall2){ 
            JOptionPane.showMessageDialog(null, "Tall1 er lik tall2");
        }
        if (tall1 != tall2){
            JOptionPane.showMessageDialog(null, "Tall1 er IKKE lik tall2"); }
        if (tall1 < tall2){
            JOptionPane.showMessageDialog(null, "Tall1 er mindre enn tall2");
        } 
        if (tall1 > tall2){ 
            JOptionPane.showMessageDialog(null, "Tall1 er større enn tall2");
        }
        if (tall1 <= tall2){
            JOptionPane.showMessageDialog(null, "Tall1 er mindre eller lik tall2");
        }
        if (tall1 >= tall2){
           JOptionPane.showMessageDialog(null, "Tall1 er større eller lik tall2"); 
        } 
    }
}

/* Det er mulig å gjøre koden kortere ved bruk av "import static javax.swing.JOptionPane". 
Da kan man kalle denne direkte: showMessageDialog(null, "Tall1 er større enn tall2"); */
