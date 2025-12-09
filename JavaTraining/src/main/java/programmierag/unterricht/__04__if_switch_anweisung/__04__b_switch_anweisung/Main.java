package programmierag.unterricht.__04__if_switch_anweisung.__04__b_switch_anweisung;

public class Main {


  public static void main(String[] args) {

    // Siehe: (Erklärung ohne externe Seite; „Enhanced Switch“ seit Java 14+)

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
//                int bonus = 15; // Extra-Bonus bei 4er-Kombo
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
