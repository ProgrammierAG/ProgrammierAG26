package programmierag.unterricht.__04__if_anweisung;

public class Main {
  public static void main(String[] args) {

    // Sehe: https://codegree.de/java-if/

    // if Anweisungen = führen einen Code-Block aus, wenn die Bedingung Wahr ist


    // Farben für Konsole
    String ROT = "\u001B[31m";
    String GRUEN = "\u001B[32m";
    String GELB = "\u001B[33m";
    String BLAU = "\u001B[34m";
    String RESET = "\u001B[0m";


    // ***** IF (einfacher Fall) *****

//    int energie = 65;
//
//    if (energie >= 50) {
//      System.out.println(GRUEN + "Genug Energie: Du kannst sprinten! ️" + RESET);
//    }


    // ***** IF-ELSE (entweder das eine, sonst das andere) *****
    // Zeigt zwei mögliche Wege: Bedingung wahr -> if; sonst -> else.

    int energie = 35;
    String genugEnergie = "Genug Energie: Du kannst sprinten!";
    String wenigEnergie = "Zu wenig Energie: Du gehst langsamer.";
//
//    if (energie >= 50) {
//      System.out.println(GRUEN + genugEnergie + RESET);
//    } else {
//      System.out.println(GELB + wenigEnergie + RESET);
//    }


    // ***** Ternary Operator *****

//    System.out.println((energie >= 50) ? (GRUEN + genugEnergie + RESET) : (GELB + wenigEnergie + RESET));



    // ***** IF - ELSE IF - ELSE (Mehrere Fälle, geordnet geprüft) *****

//    int spielerLevel = 7;
//
//    if (spielerLevel >= 20) {
//      System.out.println(BLAU + "Rang: Meister!" + RESET);
//    } else if (spielerLevel >= 10) {
//      System.out.println(BLAU + "Rang: Fortgeschritten!" + RESET);
//    } else if (spielerLevel >= 5) {
//      System.out.println(BLAU + "Rang: Anfänger" + RESET);
//    } else {
//      System.out.println(BLAU + "Rang: Neuling" + RESET);
//    }


    // ***** Kombination mit Vergleichs- und logischen Operatoren *****
    // && (UND), || (ODER), ! (NICHT)

//    boolean hatSchluessel = true;
//    boolean hatMagischesAmulett = false;
//
//    int tuerSicherheitsstufe = 2;
//  Sicherheitsstufen: 1 = ohne Schluessel, 2 = mit Schuessel, 3 = mit Schluessel und Amulett


//    if (tuerSicherheitsstufe == 1) {
//      System.out.println(GRUEN + "Die Tür öffnet sich!" + RESET);
//    } else if (tuerSicherheitsstufe == 2 && hatSchluessel) {
//      System.out.println(GRUEN + "Die Tür öffnet sich!" + RESET);
//    } else if (tuerSicherheitsstufe == 3 && hatSchluessel && hatMagischesAmulett) {
//      System.out.println(GRUEN + "Die Tür öffnet sich!" + RESET);
//    } else {
//      System.out.println(ROT + "Zutritt verweigert." + RESET);
//    }


    // ***** Verschachtelte ifs (nur verwenden, wenn es wirklich hilft der Logik) *****

//    int muenzen = 100;
//    int diamantPreis = 20;
//    boolean shopGeoeffnet = true;
//
//    if (shopGeoeffnet) {
//      if (muenzen >= diamantPreis) {
//        System.out.println(GRUEN + "Kauf erfolgreich: Diamant erworben!" + RESET);
//        muenzen -= diamantPreis;
//      } else {
//        System.out.println(GELB + "Zu wenig Münzen für einen Diamanten." + RESET);
//      }
//      System.out.println("Verbleibende Münzen: " + muenzen);
//    } else {
//      System.out.println(ROT + "Shop ist geschlossen." + RESET);
//    }


    // ***** Negation (!) sinnvoll einsetzen *****

//    boolean hatQuest = false;
//
//    if (!hatQuest) {
//      System.out.println(GELB + "Keine aktive Quest. Sprich mit dem Questgeber." + RESET);
//    } else {
//      System.out.println(GRUEN + "Quest aktiv! Folge dem Marker." + RESET);
//    }


    // ***** Typischer Fehlerhinweis *****

    // Einfache Zuweisung (=) ist NICHT Vergleich. Für Vergleich: == verwenden.
    // Beispiel (auskommentiert, da Fehler): if (punktestand = 100) { ... }

    // Bereiche NICHT mit "5 <= x <= 10" schreiben.
    // Stattdessen: if (x >= 5 && x <= 10) { ... }

  }
}
