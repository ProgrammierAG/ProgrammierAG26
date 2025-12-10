package programmierag.aufgaben.__02__if_else_und_switch.aufgabe1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int userAge;
        System.out.println("Wie alt bist du?");
        userAge = myObj.nextInt();

        if(userAge<18) {
            System.out.println("Du bist noch minderjährig.");
        }else if(userAge == 18 ){
            System.out.println("Du bist gerade volljährig geworden!");
        }else if(userAge>18){
            System.out.println("Du bist volljährig.");
        }
    }
}
