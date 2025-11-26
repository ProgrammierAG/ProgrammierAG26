package programmierag.aufgaben.__01__variablen_und_konsole.aufgabe2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("was ist deine Lieblingsfarbe?");

    String eingabe = sc.nextLine();

    System.out.println("Deine lieblingsfarbe ist " + eingabe);

    System.out.println("was ist deine Lieblingszahl?");

    String eingabe2 = sc.nextLine();

    System.out.println("deine Lieblingszahl ist " +  eingabe2);




    sc.close();
  }
}
