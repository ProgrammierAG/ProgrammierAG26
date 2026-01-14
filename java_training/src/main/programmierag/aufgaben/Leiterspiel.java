package programmierag.aufgaben;

public class Leiterspiel {
    public static void main(String[] args) {
        int versuche = 1;
        int feld = 0;

        feld += 1 + (int)(Math.random() * ((6 - 1) + 1));
        while(feld != 100) {
            feld += 1 + (int)(Math.random() * ((6 - 1) + 1));
            versuche ++;
        }
        if (feld > 100) {

        }
}}

