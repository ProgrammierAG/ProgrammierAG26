package programmierag.aufgaben.__02__if_else_und_switch.aufgabe2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Was ist deine letzte Note (nur ganze Zahlen):");
    Scanner sc = new Scanner(System.in);
    int note = sc.nextInt();

    switch (note) {
      case 1:
        System.out.println("sehr gut");
        break;
      case 2:
        System.out.println("gut");
        break;
      case 3:
        System.out.println("befriedigend");
        break;
      case 4:
        System.out.println("ausreichend");
        break;
      case 5:
        System.out.println("mangelhaft");
        break;
      case 6:
        System.out.println("ungenügend");
    }
  }
}
