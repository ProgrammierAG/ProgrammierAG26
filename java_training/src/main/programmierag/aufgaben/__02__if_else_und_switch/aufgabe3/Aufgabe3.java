package programmierag.aufgaben.__02__if_else_und_switch.aufgabe3;

/*
Schreibe ein Programm, das eine Monatszahl annimmt und die entsprechende Jahreszeit zurückgibt.

- 1 : "Winter"
- 2 : "Winter"
- 3 : "Frühling"
- 4 : "Frühling"
- 5 : "Frühling"
- 6 : "Sommer"
- 7 : "Sommer"
- 8 : "Sommer"
- 9 : "Herbst"
- 10 : "Herbst"
- 11 : "Herbst"
- 12 : "Winter"
*/

import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) {

        String ROT = "\u001B[31m";
        String GRUEN = "\u001B[32m";
        String GELB = "\u001B[33m";
        String BLAU = "\u001B[34m";
        String RESET = "\u001B[0m";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe eine Zahl von 1 bis 12 ein:");

/*

        String note = scanner.nextLine();

*/

        int note = 3;

        switch (note) {
            case 1, 2, 12 -> System.out.println(RESET + "Es ist : " + BLAU + "Winter");
            case 3, 4, 5 -> System.out.println(RESET + "Es ist : " + GRUEN + "Frühling");
            case 6, 7, 8 -> System.out.println(RESET + "Es ist : " + GELB + "Sommer");
            case 9, 10, 11 -> System.out.println(RESET + "Es ist : " + ROT + "Herbst");
            default -> System.out.println(ROT + "Deine Zahl ist auserhalb von 1 bis 12" + RESET);
        };







    }

}
