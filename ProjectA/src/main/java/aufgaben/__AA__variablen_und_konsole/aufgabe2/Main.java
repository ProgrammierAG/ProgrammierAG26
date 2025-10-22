package aufgaben.__AA__variablen_und_konsole.aufgabe2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Gebe deine lieblingsfarbe ein: ");

    String color = sc.nextLine();

    System.out.println("Deine lieblingsfarbe ist -> " + color);

    sc.close();
  }
}
