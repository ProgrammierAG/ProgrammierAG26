package programmierag.unterricht.__05__schleifen;

public class Main {

    public static void main(String[] args) {

        // Siehe: https://www.w3schools.com/java/java_while_loop.asp (für WHILE SCHLEIFEN)
        // Siehe: https://www.w3schools.com/java/java_for_loop.asp (für FOR SCHLEIFEN)
        // Siehe: https://www.w3schools.com/java/java_foreach_loop.asp (für FOREACH SCHLEIFEN)

        // Schleifen (Loops) = Code mehrfach ausführen, solange eine Bedingung erfüllt ist.
        // Ideal für Wiederholungen, Listen durchgehen oder Warten auf Ereignisse.
        // Macht den Code effizienter (Don't Repeat Yourself).

        // Farben für Konsole
        String ROT   = "\u001B[31m";
        String GRUEN = "\u001B[32m";
        String GELB  = "\u001B[33m";
        String BLAU  = "\u001B[34m";
        String RESET = "\u001B[0m";

        // ***** Die WHILE-Schleife *****
        // "Solange die Bedingung wahr ist, mache weiter."
        // Nutzen wir oft, wenn wir NICHT genau wissen, wie oft die Schleife laufen muss.

        /*
        int aktuelleEnergie = 10;
        int maxEnergie = 100;

        System.out.println("Lade Schild auf...");
        System.out.println(GELB + "Energie: " + aktuelleEnergie + "%");

        while (aktuelleEnergie < maxEnergie) {
            aktuelleEnergie = aktuelleEnergie + 30; // 30 Energie pro Tick

            // Sicherheitscheck (Cap), damit wir nicht über 100 gehen
            if (aktuelleEnergie > maxEnergie) {
                aktuelleEnergie = maxEnergie;
            }

            System.out.println(GELB + "Energie: " + aktuelleEnergie + "%");
        }
        System.out.println(GRUEN + "Schild vollständig geladen!");
        */

        // ***** Die FOR-Schleife (Der Klassiker) *****
        // "Wiederhole genau X mal."
        // Aufbau: for (Startwert; Bedingung; Schritt nach jeder Runde)

        // BEISPIEL 1: Hochzählen mit i++ (Inkrement)
        // Wir laufen 5 Trainingsrunden.

        /*
        System.out.println("Training beginnt:");

        for (int i = 1; i <= 5; i++) {
            // i++ bedeutet: i wird nach jeder Runde um 1 erhöht (i = i + 1)
            System.out.println(BLAU + "Laufe Runde " + i + RESET);
        }
        System.out.println(GRUEN + "Training beendet!" + RESET);
        */

        // BEISPIEL 2: Runterzählen mit i-- (Dekrement)
        // Ein Countdown vor dem Spielstart.

        /*
        System.out.println("\nSpiel startet in..."); // \n macht einen Zeilenumbruch

        for (int i = 5; i > 0; i--) {
            // i-- bedeutet: i wird nach jeder Runde um 1 verringert (i = i - 1)
            System.out.println(ROT + i + "..." + RESET);
        }
        System.out.println(GRUEN + "GO!" + RESET);
        */

        // ***** Die FOREACH-Schleife (Erweiterte For-Schleife) *****
        // "Gehe jedes Element in einer Sammlung durch."
        // Man muss sich nicht um Index-Zahlen (0, 1, 2...) kümmern.

        /*
        String[] rucksack = {"Heiltrank", "Schwert", "Karte", "Goldmünze"};

        System.out.println("\nDein Inventar:");

        for (String item : rucksack) {
            // "item" ist hier der Platzhalter für den Gegenstand, den wir gerade anschauen
            System.out.println(BLAU + "- " + item + RESET);
        }
        */

        // ***** Typische Fehlerhinweise *****
        // Endlosschleife: Wenn die Bedingung nie falsch wird (z.B. while(true)), läuft das Programm ewig.
        // Off-by-One Fehler: Achtung bei < vs <=. Eine Schleife `i < 5` läuft von 0 bis 4 (5 mal).
        //                    `i <= 5` läuft von 0 bis 5 (6 mal).
        // Variable Scope: Die Variable "i" in der for-Schleife existiert meistens nur INNERHALB der Schleife.
    }
}
