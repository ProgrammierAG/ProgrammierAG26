package programmierag.aufgaben.Leiterspiel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Leiter> leitern = new ArrayList<>();
    static int totalCounter = 0;
    static int pos;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("wie viele Spiele sollen gespielt werden?");
        int anzahlSpiele = sc.nextInt();
        Dice dice = new Dice(1, 6);
        for (int i = 0; i < anzahlSpiele; i++) {
            run(dice);
        }
        System.out.println("Es wurde durchschnittlich " + totalCounter / anzahlSpiele + " gewürfelt");
    }

    public static void run(Dice dice){
        setup();
        pos = 1;
        int counter = 0;

        while (pos != 100) {
            Move(dice.roll());
            counter++;
            totalCounter++;
        }
        System.out.println("Es wurde " + counter + " mal gewürfelt.");
        System.out.println();
    }

    public static void Move(int steps){
        System.out.println("Es wurde eine " + steps + " gewürfelt");
        pos += steps;
        System.out.println("Deswegen ist die neue Position " + pos);

        processLeitern();

        if (pos > 100){
            System.out.println("Die Position war größer als 100,");
            pos = 100 - (pos - 100);
            System.out.println("Deswegen ist die neue Position " + pos);
            processLeitern();

        }

        System.out.println("Die finale Position ist " + pos + "\n");
    }

    public static void processLeitern(){
        for (Leiter leiter: leitern) {
            if (leiter.getPunkt1() == pos){
                pos = leiter.getPunkt2();
                System.out.println("Es wurde eine Leiter benutzt,");
                System.out.println("Deswegen ist die neue Position " + pos);
                break;
            } else if (leiter.getPunkt2() == pos) {
                pos = leiter.getPunkt1();
                System.out.println("Es wurde eine Leiter benutzt,");
                System.out.println("Deswegen ist die neue Position " + pos);
                break;
            }
        }
    }
    public static void setup(){

        leitern.add(new Leiter(6, 27));
        leitern.add(new Leiter(14, 19));
        leitern.add(new Leiter(21, 53));
        leitern.add(new Leiter(31, 42));
        leitern.add(new Leiter(33, 38));
        leitern.add(new Leiter(46, 62));
        leitern.add(new Leiter(51, 59));
        leitern.add(new Leiter(57, 96));
        leitern.add(new Leiter(65, 85));
        leitern.add(new Leiter(68, 80));
        leitern.add(new Leiter(70, 76));
        leitern.add(new Leiter(92, 98));
    }
}
