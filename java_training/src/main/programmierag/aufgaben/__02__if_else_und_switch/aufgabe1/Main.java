package programmierag.aufgaben.__02__if_else_und_switch.aufgabe1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Wie alt bist du?");
            int age = scanner.nextInt();
            if (age < 18) {
                System.out.println("Du bist noch minderjährig.");
            }
            else if (age == 18) {
                System.out.println("Du bist gerade volljährig geworden!");
            }
           else {
               System.out.println("Du bist volljährig.");
            }
    }
}
