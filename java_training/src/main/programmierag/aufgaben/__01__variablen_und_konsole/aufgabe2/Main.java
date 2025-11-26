package programmierag.aufgaben.__01__variablen_und_konsole.aufgabe2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Gib deine Lieblingsfarbe an: ");
    String farbe = sc.nextLine();
    System.out.println("Deine lieblingsfarbe ist -> " + farbe);
    System.out.println("Gib deine Lieblingszahl an: ");
    String zahl = sc.nextLine();
    System.out.println("Deine lieblingszahl ist ->" + zahl);
    sc.close();
  }
}
