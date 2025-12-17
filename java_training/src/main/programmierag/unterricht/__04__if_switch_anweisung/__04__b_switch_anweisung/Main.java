package programmierag.unterricht.__04__if_switch_anweisung.__04__b_switch_anweisung;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {


  public static void main(String[] args) {

    // Siehe: https://www.datacamp.com/de/doc/java/switch  (für SWITCH ANWEISUNGEN)
    // Siehe: https://codefinity.com/de/courses/v2/0bfa1111-8677-478f-bcd3-315dff1d7d40/9cde0d8f-06ad-44aa-aeb5-4724a217dcd3/0f3dc9b6-46e5-4030-b26d-9ab02dfcb342  (für ENCHANCED SWITCH ANWEISUNGEN)

    // Enchanced Switch Anweisungen = ein Ersatz für viele `if-Anweisungen´
    // Ideal für Menüs, Aktionen, Statuswerte, Enums.
    // Macht den Code übersichtlicher, wenn es viele Fälle gibt.

    // Farben für Konsole
    String ROT = "\u001B[31m";
    String GRUEN = "\u001B[32m";
    String GELB = "\u001B[33m";
    String BLAU = "\u001B[34m";
    String RESET = "\u001B[0m";

    // ***** Enhanced switch *****

//        int level = 3;
//
//        switch (level) {
//            case 1 -> System.out.println(BLAU + "Dein Rang: Neuling" + RESET);
//            case 2, 3 -> System.out.println(BLAU + "Dein Rang: Anfänger" + RESET);
//            case 4, 5 -> System.out.println(BLAU + "Dein Rang: Fortgeschritten" + RESET);
//            default -> System.out.println(BLAU + "Dein Rang: Meister" + RESET);
//        };


    // ***** Switch als Ausdruck (liefert einen Wert) *****

    // Wir berechnen direkt eine Belohnung basierend auf dem Level.

//        int spielerLevel = 7;

//        int belohnungCoins = switch (spielerLevel) {
//            case 1 -> 10;
//            case 2, 3 -> 25;
//            case 4, 5 -> 40;
//            case 6, 7, 8 -> 60;
//            default -> 100;
//        };
//
//        System.out.println(GRUEN + "Belohnung: +" + belohnungCoins + " Münzen" + RESET);


    // ***** Mehrzeiliger Fall (Block) mit „yield“ *****

    // Falls die Berechnung mehr Schritte braucht, nutzt man einen Block { } und „yield“ für den Rückgabewert.

//        int comboTreffer = 4;
//        int schaden = switch (comboTreffer) {
//            case 1 -> 10;
//            case 2 -> 20;
//            case 3 -> 35;
//            case 4 -> {
//                int basis = 40;
//               int bonus = 15; // Extra-Bonus bei 4er-Kombo
//                yield basis + bonus; // „yield“ gibt den Wert des switch-Ausdrucks zurück
//            }
//            default -> 0;
//        };
//        System.out.println(GRUEN + "Verursachter Schaden: " + schaden + RESET);


    // ***** Typische Fehlerhinweise *****

    // In einem switch-Ausdruck müssen alle Fälle einen Wert liefern (inkl. default), sonst kompiliert es nicht
    // Achte auf kompatible Typen: Alle Fälle müssen denselben Typ liefern (z. B. alle int oder alle String)
    // Für komplexe Fälle in einem Ausdruck: Block { ... } nutzen und „yield“ zurückgeben
  }
}
