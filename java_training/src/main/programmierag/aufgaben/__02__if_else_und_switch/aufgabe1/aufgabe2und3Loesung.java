package programmierag.aufgaben.__02__if_else_und_switch.aufgabe1;
import java.util.Scanner;


public class aufgabe2und3Loesung {
    public static void main(String[] args) {
        System.out.println("wähle eine Notenzahl aus");
        Scanner sc = new Scanner(System.in);
        int Zahl = sc.nextInt();

        //simple
        switch(Zahl){
            case 1:
                System.out.println("sehr gut");
                break;
            case 2:
                System.out.println("gut");
                break;
            case 3:
                System.out.println("befriedigend");
                break;
            default: System.out.println("keine erlaubte Zahl");
        }


        //advanced
        switch (Zahl) {
            case 1 -> System.out.println("sehr gut");
            case 2 -> System.out.println(" gut");
            case 3 -> System.out.println("befriedigend");
            default -> System.out.println("kein Zahl");
        }

        //Aufgabe 3:
        System.out.println("wähle die Monatszahl");
        int Monatszahl = sc.nextInt();

        switch(Monatszahl){
            case 1 -> System.out.println("Winter");
            case 2 -> System.out.println("Winter");
            case 3 -> System.out.println("Frühling");
            case 4 -> System.out.println("Sommer");
            default -> System.out.println("kein erlaubter Monat");
        }


        //Aufgabe 4:
        System.out.println("Wähle eine zahl von 1 bis 1000");
        int gewaehltezahl = sc.nextInt();
        int randomZahl = 0;
        while (gewaehltezahl != randomZahl) {
            randomZahl = (int)(1000 * Math.random());
            System.out.println(randomZahl);
        }
        //Aufgabe 5
        //mit if else
        for (int i = 1; i < 107; i++){
            if (i % 4 == 0){
                System.out.println((i/4));
            }
            else if (i % 3 == 0){
                System.out.println((i/3));
            }
            else{
                System.out.println(i);
            }
        }
        //Aufgabe 6
        String[] words = new String[5];
        String[] words2 = {"lalala", "hahahanfh", "test", "okok",};
        int longest = 0;
        for  (String w : words2){
            if (longest < w.length()){
                longest = w.length();
        }
        }
        System.out.println("the longest word is:" + longest + "digits long");
        }





    }

