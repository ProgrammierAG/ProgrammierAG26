package programmierag.aufgaben.__01__variablen_und_konsole.aufgabe2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Gebe deine lieblingsfarbe ein: ");
    Scanner sc = new Scanner(System.in);
    String Lieblingsfarbe = sc.nextLine();
    System.out.println("Deine Lieblingsfarbe ist -> " + Lieblingsfarbe);
    System.out.print("Gebe deine lieblingszahl ein: ");
    String Lieblingszahl = sc.nextLine();
    System.out.print("Deine Lieblingszahl ist -> " + Lieblingszahl);
    sc.close();
  }
}
