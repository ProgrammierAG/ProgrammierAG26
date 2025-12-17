package programmierag.aufgaben.__02__if_else_und_switch.aufgabe2;

/*
Schreibe ein Programm das eine Zahl, in ihre Note umwandelt benutze ein switch case dafür.

        - 1 : "sehr gut"
        - 2 : "gut"
        - 3 : "befriedigend"
        - 4 : "ausreichend"
        - 5 : "mangelhaft"
        - 6 : "ungenügend"
*/

import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {

        String ROT = "\u001B[31m";
        String GRUEN = "\u001B[32m";
        String GELB = "\u001B[33m";
        String BLAU = "\u001B[34m";
        String RESET = "\u001B[0m";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte gebe eine Zahl von 1 bis 6 ein:");

/*

        String note = scanner.nextLine();

*/

        int note = 3;

        switch (note) {
            case 1 -> System.out.println(GRUEN + "Deine Zahl ist: sehr gut" + RESET);
            case 2 -> System.out.println(BLAU + "Deine Zahl ist: gut" + RESET);
            case 3 -> System.out.println(BLAU + "Deine Zahl ist: befriedigend" + RESET);
            case 4 -> System.out.println(GELB + "Deine Zahl ist: ausreichend" + RESET);
            case 5 -> System.out.println(GELB + "Deine Zahl ist: mangelhaft" + RESET);
            case 6 -> System.out.println(ROT + "Deine Zahl ist: ungenügend" + RESET);
            default -> System.out.println(ROT + "Deine Zahl ist auserhalb von 1 bis 6" + RESET);
        };



    }










}
