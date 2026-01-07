package programmierag.aufgaben.__04__collection.aufgabe1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("gebe ein Wort ein: ");
        char[] wort = sc.nextLine().toCharArray();
        for (int i = 0; i < Math.floor(wort.length / 2); i++){
            if (!(wort[i] == wort[wort.length - 1 - i])){
                System.out.println(new String(wort) + " ist kein Palindrom");
                break;
            } else if (i == Math.floor(wort.length / 2) - 1) {
                System.out.println(new String(wort) + " ist ein Palindrom");
            }
        }

    }
}
