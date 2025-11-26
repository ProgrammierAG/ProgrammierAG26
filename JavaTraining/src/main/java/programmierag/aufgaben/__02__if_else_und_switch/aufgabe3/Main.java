package programmierag.aufgaben.__02__if_else_und_switch.aufgabe3;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Gib ein Monat ein:");
    Scanner sc = new Scanner(System.in);
    int monat = sc.nextInt();

    if(monat == 1 || monat == 2 || monat == 12) {
      System.out.println("Es ist Winter");
    } else if (monat == 3 || monat == 4 || monat == 5) {
      System.out.println("Es ist Frühling");
    } else if ( monat == 6 || monat == 7 || monat == 8) {
      System.out.println("Es ist Sommer");
    } else if (monat == 9 || monat == 10 || monat == 11) {
      System.out.println("Es ist Herbst");
    } else {
      System.out.println("Dies ist kein Monat");
    }
  }
}
