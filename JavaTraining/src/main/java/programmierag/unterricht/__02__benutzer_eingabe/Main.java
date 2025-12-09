package programmierag.unterricht.__02__benutzer_eingabe;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    // Siehe: https://www.geeksforgeeks.org/java/scanner-class-in-java/

    Scanner scanner = new Scanner(System.in);     // Es muss ein Scanner erstellt werden, der die Eingabe lesen wird

    // ***** STRING *****

    System.out.println("Wie heißt du?");

//    scanner.nextLine();                         // Scanner liest die Eingabe

    String name = scanner.nextLine();             // Die Eingabe wird in der Variable "name" gespeichert
    System.out.println("Hallo " + name +"!");


    // ***** INTEGER *****

//    System.out.println("Wie alt bist du?");
//
//    double alter = scanner.nextInt();
//    System.out.println("Du bist " + alter +" Jahre alt!");


    // ***** DOUBLE *****

//    System.out.println("Wie viel kostet dieses T-Shirt?");
//
//    double preis = scanner.nextDouble();
//    System.out.println("Das T-Shirt kostet " + preis +"€ Euro!");

    scanner.close();                              // Der Scanner sollte am Ende seiner Nutzung geschlossen werden
  }
}
