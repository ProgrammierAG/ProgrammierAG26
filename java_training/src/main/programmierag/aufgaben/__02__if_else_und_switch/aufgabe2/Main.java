package programmierag.aufgaben.__02__if_else_und_switch.aufgabe2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Gebe deine Note ein!");
        Scanner sc = new Scanner(System.in);
        int Note = sc.nextInt();
        if ( Note==1 ) {
            System.out.println("super gemacht");
        };
        if ( Note==2 ) {
            System.out.println("gut");
        };
        if ( Note==3 ) {
            System.out.println("befriedigend");
        };
        if ( Note==4 ) {
            System.out.println("ausreichend");
        };
        if ( Note==5 ) {
            System.out.println("mangelhaft");
        };
        if ( Note==6 ) {
            System.out.println("Du bist so schlecht du Opfer");
        };
    }
}
