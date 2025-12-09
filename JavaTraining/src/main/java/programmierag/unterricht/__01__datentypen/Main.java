package programmierag.unterricht.__01__datentypen;

public class Main {
  public static void main(String[] args) {

    // Siehe: https://www.geeksforgeeks.org/java/java-data-types/

    // Variable = ein wiederverwendbarer Behälter für einen Wert
    //            eine Variable verhält sich so, als wäre sie der enthaltene Wert

    // Primitive = einfacher Wert, der direkt im Speicher (Stack) gespeichert wird
    // Reference = speichert Referenzen (Speicheradressen) anstelle der tatsächlichen Werte (in Heap)


    //        Primitive       |   Non-Primitive (Reference)   |
    // |----------------------|-------------------------------|
    // | int                  | String                        |
    // | short                | Arrays                        |
    // | long                 | Classes                       |
    // | double               | Interfaces                    |
    // | float                | Enums                         |
    // | boolean              | Objects                       |
    // | char                 | Collections (List, Map, Set)  |
    // | byte                 |                               |



    // 3 Schritte zum Erstellen einer Variablen
    // ------------------------------
    // a. Deklaration
    // b. Zuweisung
    // c. oder Initializierung


    // ***** INTEGER *****

//    int alter;          // Deklaration
//    alter = 13;         // Zuweisung

//    int alter = 13;   // Initializierung
//    int ereignis = -200;

//    int menge = 1_530;
//    int menge = 1.530;

//    System.out.print("Ich bin " + alter + " jahre alt!");
//    System.out.print("Ich bin " + "alter" + " jahre alt!");   // Unterschied?

    // ***** DOUBLE *****

//    double preis = 19.99;
//
//     System.out.print("Der Preis des T-Shirt ist: " + preis + "€");


    // ***** FLOAT *****

//    float preis = 19.99f;
//
//     System.out.print("Der Preis des T-Shirt ist: " + preis + "€");


    // ***** BOOLEAN *****

//    boolean istOnline = true;  // Camel case Erklärung
//    boolean istOnline = false;
//
//    System.out.print("Das Material ist auch online: " + istOnline);


    // ***** CHAR *****

//    char waehrung = '€';
//    char waehrung = "€";
//    char waehrung = 'Euro';

//      System.out.print("Das Symbol für den Euro ist: " + waehrung);


    // ***** STRING *****

    String email = "Beispiel@gmail.com";
//    String email = 'Beispiel@gmail.com';
//    string email = "Beispiel@gmail.com";

//    System.out.print(email);

    String zweiteEmail = "Beispiel2@gmail.com";
    String dritteEmail = "Beispiel3@gmail.com";

    System.out.println("\n------------------------------------\n\u001B[32m");

    System.out.print(email);                  // Unterschied zwischen print und println
    System.out.print(zweiteEmail);
    System.out.print(dritteEmail);

    System.out.println("\u001B[0m\n------------------------------------\n\u001B[32m");

    System.out.println(email);
    System.out.println(zweiteEmail);
    System.out.println(dritteEmail);

    System.out.println("\u001B[0m\n------------------------------------\n");
  }
}
