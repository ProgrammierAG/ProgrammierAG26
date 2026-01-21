package programmierag.Leitenspiel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Leitenspiel game = new Leitenspiel();

        do {
            System.out.println("*** NEW GAME STARTED ***");
            System.out.println();

            game.reset();
            game.run();

            System.out.println("*** Game completed! You reached the field 100! *** \n Retry (Y/N): ");
            System.out.println();
        } while ("Y".equalsIgnoreCase(scanner.nextLine()));
    }
}
