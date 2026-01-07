package programmierag.aufgaben.__02__if_else_und_switch.aufgabe2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein:");
        int zahl= sc.nextInt();
        if(zahl==1) {
            System.out.println("sehr gut");
        }
        else if(zahl==2) {
            System.out.println("gut");
        }
        else if(zahl==3) {
            System.out.println("befriedigend");
        }
        else if(zahl==4) {
            System.out.println("ausreichend");
        }
        else if(zahl==5) {
            System.out.println("mangelhaft");
        }
        else if(zahl==6) {
        System.out.println("ungenügend");
    }
    }
}
