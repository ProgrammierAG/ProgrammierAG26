package programmierag.aufgaben.__03__schleifen.aufgabe1;
import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rng = new Random();
        String happy = ":)", middle = ":|", sad = ":(", res;
        int number = -1;
        int guess = -1;
        int trys = 0;
        while (number < 1 || number > 1000){
            System.out.println("Wähle eine zahl von 1 bis 1000:");
            number = sc.nextInt();
        }
        while (!(guess == number)){
            trys++;
            guess = rng.nextInt(1000) + 1;
            System.out.println(guess);
        }
        if (trys < 100){
            res = happy;
        } else if (trys < 200) {
            res = middle;
        }else {
            res = sad;
        }
        System.out.println("Die Zahl wurde beim " + trys + "ten Versuch gefunden " + res);
    }
}
