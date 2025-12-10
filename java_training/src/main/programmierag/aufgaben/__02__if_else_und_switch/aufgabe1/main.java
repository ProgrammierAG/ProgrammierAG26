package programmierag.aufgaben.__02__if_else_und_switch.aufgabe1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("wie alt bist du?");

        int eingabe = sc.nextInt();
        int x = 18;

        if (x > eingabe) {
            System.out.println("Du bist noch minderjährig");
        } else if (eingabe == x) {
            System.out.println("Du bist gerade volljährig geworden!");
        }else
        {
            System.out.println("Du bist ein UNC");
        }
    }
}





