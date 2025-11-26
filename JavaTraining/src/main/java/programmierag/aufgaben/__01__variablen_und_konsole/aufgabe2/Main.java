package programmierag.aufgaben.__01__variablen_und_konsole.aufgabe2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Gib deine Lieblingsfarbe ein: ");
    Scanner sc = new Scanner(System.in);
    String Lieblingsfarbe = sc.nextLine();
    System.out.println("Deine lieblingsfarbe ist -> " + Lieblingsfarbe);
    System.out.print("Gib deine Lieblingszahl ein: ");
    Scanner sc2 = new Scanner(System.in);
    int Lieblingszahl = sc2.nextInt();
    System.out.println("Deine lieblingszahl ist -> " + Lieblingszahl);
  }
}
