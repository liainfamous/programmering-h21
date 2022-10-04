import javax.swing.*;

public class Tall_ExceptionHandling {
    public static void main(String[] args){
        String inString = JOptionPane.showInputDialog("Skriv inn et heltall");
        int number = Integer.parseInt(inString);
        System.out.println("Tallet er "+number);

/* Dersom man skriver inn tekst isteden for et tall får man feilmeldingen,
Exception in thread "main" java.lang.NumberFormatException: For input string: "tekst"
Derfor kan man skrive alternativ kode for at teksten skal vises som tallet 0 isteden,
alternativt at feilmeldingen også printes ut gjennom System.out.println funksjonen*/

public class Tall {
    public static void main(String [] args){
        String innStreng = JOptionPane.showInputDialog("Skriv inn et heltall");
        int tall;
        try{
            tall = Integer.parseInt(innStreng);
        }
        catch (Exception e){
            tall = 0;
            System.out.println(e);
        }
        System.out.println("Tallet er "+tall);
    }
}