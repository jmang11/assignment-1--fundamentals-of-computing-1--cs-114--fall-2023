// Import libraries here
// Jeremy Mangiameli
import java.util.Scanner;

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

    int userFahrenheit;
    int calcCelsius;
    String userString;
    String stringSave1, stringSave2;

    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a degree in Fahrenheit:");
    userFahrenheit = scan.nextInt();
    calcCelsius = (userFahrenheit-32)*(5/9);

    System.out.println("Enter a String of 5-Characters:");
    userString = scan.next();
    stringSave1 = userString.substring(1,4);
    System.out.println(stringSave1);

    scan.close();
  }
}
