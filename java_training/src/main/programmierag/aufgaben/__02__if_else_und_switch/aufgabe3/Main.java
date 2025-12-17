package programmierag.aufgaben.__02__if_else_und_switch.aufgabe3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        switch (sc.nextInt()){
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Frühling");
            case 6, 7, 8 -> System.out.println("Sommer");
            case 9, 10, 11 -> System.out.println("Herbst");
            default -> System.out.println("Kein Monat");
        }
    }
}
