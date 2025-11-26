package programmierag.aufgaben.__01__variablen_und_konsole.aufgabe2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Was ist deine Lieblingsfarb?");
    String Lieblingsfarbe = sc.nextLine();
    System.out.println("Was ist deine Lieblingszahl?");
    String Lieblingszahl = sc.nextLine();
    sc.close();
    System.out.println("Deine Lieblingszahl ist");
  }
}
