package programmierag.aufgaben.__02__if_else_und_switch.aufgabe1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Wie alt bist du?");
    Scanner  sc = new Scanner(System.in);
    int alter = sc.nextInt();

    if (alter < 18) {
      System.out.println("Du bist Minderjährig");
    } else if (alter == 18) {
      System.out.println("Du bist Volljährig geworden");
    } else if (alter > 18) {
      System.out.println("Du bist schon lange Volljährig");
    }
  }
}
