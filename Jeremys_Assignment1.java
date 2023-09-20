// Import libraries here
// Jeremy Mangiameli
import java.util.Scanner;
import java.util.Random;

public class Jeremys_Assignment1 {
  public static void main(String[] args) {
    System.out.println("      JJJJJJJJJJJJJJJJJ MMMMMMM           MMMMMMM");
    System.out.println("      JJJJJJJJJJJJJJJJJ MMMMMMMM         MMMMMMMM");
    System.out.println("            JJJJJ       MMMM MMMM       MMMM MMMM");
    System.out.println("            JJJJJ       MMMM  MMMM     MMMM  MMMM");
    System.out.println("            JJJJJ       MMMM   MMMM   MMMM   MMMM");
    System.out.println("            JJJJJ       MMMM    MMMM MMMM    MMMM");
    System.out.println("   JJJJ     JJJJJ       MMMM     MMMMMMM     MMMM");
    System.out.println("   JJJJ     JJJJJ       MMMM      MMMMM      MMMM");
    System.out.println("    JJJJ   JJJJJ        MMMM       MMM       MMMM");
    System.out.println("      JJJJJJJJ          MMMM                 MMMM");

    double userFahrenheit, calcCelsius;
    final double conversionFactor = 5.0/9.0;
    final int base = 32;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a degree in Fahrenheit:");
    userFahrenheit = scan.nextDouble();
    calcCelsius = (userFahrenheit-base) * conversionFactor;

    String userString, stringSave1, stringSave2;

    System.out.println("Enter a String of 5-Characters:");
    userString = scan.next();
    stringSave1 = userString.substring(1,4);
    stringSave2 = new StringBuilder(stringSave1).reverse().toString();

    scan.close();

    final int max = 16384;
    final int min = 32;

    Random rand = new Random();
    int randomNumber = rand.nextInt((max-min)+1)+min;

  }
}
