package programmierag.aufgaben.__02__if_else_und_switch.aufgabe1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wie alt bist du?");
        int alter= sc.nextInt();
        if(alter==18)
            System.out.println("Du bist gerade volljährig geworden!");
        else if(alter>=18)
            System.out.println("Du bist volljährig.");
        else if (alter<18)
            System.out.println("Du bist noch minderjährig.");


    };
}
