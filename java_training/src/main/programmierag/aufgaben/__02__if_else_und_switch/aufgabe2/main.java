package programmierag.aufgaben.__02__if_else_und_switch.aufgabe2;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Welche Schulnote hast du?");
        switch (sc.nextInt()){
            case 1 -> {
                System.out.println("sehr gut");
            }
            case 2 -> {
                System.out.println("gut");
            }
            case 3 -> {
                System.out.println("befriedigend");
            }
            case 4 -> {
                System.out.println("ausreichend");
            }
            case 5 -> {
                System.out.println("mangelhaft");
            }
            case 6 -> {
                System.out.println("ungenügend");
            }
            case 67 -> {
                while(true){
                    System.out.println("67676767676767676767676");
                }
            }
            default -> {
                System.out.println("bist du retardet das ist keine schulnote");
            }
        }
        }
    }



