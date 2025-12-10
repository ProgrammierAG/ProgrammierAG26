package programmierag.aufgaben.__01__variablen_und_konsole.aufgabe2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Gebe deine Lieblingsfarbe ein: ");
    Scanner sc = new Scanner(System.in);
    String lieblingsfarbe = sc.nextLine();
    System.out.println("Deine Lieblingsfarbe ist --> " + lieblingsfarbe);
    System.out.println("Gebe deine Lieblingszahl ein: ");
    String lieblingszahl = sc.nextLine();
    System.out.println("Deine Lieblingszahl ist --> " + lieblingszahl);
    sc.close();
  }
}
