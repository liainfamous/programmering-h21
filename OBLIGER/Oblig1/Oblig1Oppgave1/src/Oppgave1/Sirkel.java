package Oppgave1;
public class Sirkel {

  // Statisk metode som beregner og returnerer sirkelens diameter.
  public static double beregneDiameter(double radius) {
    double diameter = radius * 2;
    return diameter;
  }

  // Statisk metode som beregner og returnerer sirkelens omkrets.
  // Omkrets = 2*pi*r

  public static double beregneOmkrets(double radius) {
    double omkrets = Math.PI * radius * 2;
    return omkrets;
  }

  /* Statisk metode som beregner og returnerer sirkelens areal.
     Areal = pi*r^2
     Math.PI kan brukes for en konstant for PI
     Math.pow kan brukes for å opphøye et tall i en potens
   */

   public static double beregneAreal(double radius) {
     double areal = Math.PI * Math.pow(radius, 2);
     return areal;
   }
}