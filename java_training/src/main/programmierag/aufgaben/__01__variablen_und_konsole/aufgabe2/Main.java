package programmierag.aufgaben.__01__variablen_und_konsole.aufgabe2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Was ist deine Lieblingsfarbe?");
    String farbe =sc.nextLine();
    System.out.println("Deine Lieblingsfarbe ist ->" + farbe+"!");
    System.out.println("Was ist deine Lieblingszahl?");
    int zahl =sc.nextInt();
    System.out.println("Deine Lieblingszahl ist ->" + zahl+"!");
    sc.close();
  }
}
