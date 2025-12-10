package programmierag.aufgaben.__02__if_else_und_switch.aufgabe1;

import java.awt.*;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int alter;

        System.out.println("Wie Alt bist du?");
        alter = sc.nextInt();
        if (alter < 18) {
            System.out.println("Du bist noch minderjährig.");
        } else if (alter == 18) {
            System.out.println("Du bist gerade volljährig geworden!");
        } else {
            System.out.println("Du bist volljährig.");
        }
        sc.close();
    }
}
