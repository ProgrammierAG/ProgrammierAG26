package Versuch2.Leiterspiel;



import java.util.Random;

import java.util.Arrays;

public class matlab2 {

    /*
1.Zufallszahl
    2.Bewegung
    3.Erkennung und Benutzung von "Leiterfeldern"
    4.Zielerreichung (genau 100 oder drüber,-zurück gehen)

Zusätze:
    Würfel- /Zuganzahl
    AktuellesFeld (für alle Züge)
    Fortbewegungszahl (für alle Züge)


        int aktuelleFelderzahl = 0;
        int maxFelderzahl = 100

            while (aktuelleFelderzahl < maxFelderzahl) {
            aktuelleFelderzahl = aktuelleFelderzahl + wurfzahl;

                if (aktuelleFelderzahl > maxFelderzahl) {
                aktuelleFelderzahl = maxFelderzahl;
            }
// Java program to print a new line in string
// Using System.lineSeparator() method

// Main class
class GFG {
    // Main Driver Code
    public static void main(String[] args)
    {
        // Calling the System.lineSeparator() function to
        // print newline in between some specified strings
        String newline = System.lineSeparator();

        // Printing new line
        System.out.println("GFG" + newline + "gfg");
    }
}
+"Zug: "+ zugAnzahl

einsenAnzahl
zweienAnzahl
dreienAnzahl
vierenAnzahl
fuenfenAnzahl
sechsenAnzahl
    */

    public static void main(String[] args) {

        String ROT = "\u001B[31m";
        String GRUEN = "\u001B[32m";
        String GELB = "\u001B[33m";
        String BLAU = "\u001B[34m";
        String RESET = "\u001B[0m";

        String newline = System.lineSeparator();

        Random random = new Random();


        //Player1
        int einsenAnzahlPlayer1 = 0;
        int zweienAnzahlPlayer1 = 0;
        int dreienAnzahlPlayer1 = 0;
        int vierenAnzahlPlayer1 = 0;
        int fuenfenAnzahlPlayer1 = 0;
        int sechsenAnzahlPlayer1 = 0;


        int zurueckBewegtInsgesamtPlayer1 = 0;
        int hunderterVersuchePlayer1 = 0;
        int bewegungInsgesamtPlayer1 = 0;
        int leiterNutzungPlayer1 = 0;
        int zugAnzahlPlayer1 = 0;
        int aktuelleFelderzahl1 = 0;
        boolean Fertig1 = false;

        //Player2
        int einsenAnzahlPlayer2 = 0;
        int zweienAnzahlPlayer2 = 0;
        int dreienAnzahlPlayer2 = 0;
        int vierenAnzahlPlayer2 = 0;
        int fuenfenAnzahlPlayer2 = 0;
        int sechsenAnzahlPlayer2 = 0;


        int zurueckBewegtInsgesamtPlayer2 = 0;
        int hunderterVersuchePlayer2 = 0;
        int bewegungInsgesamtPlayer2 = 0;
        int leiterNutzungPlayer2 = 0;
        int zugAnzahlPlayer2 = 0;
        int aktuelleFelderzahl2 = 0;
        boolean Fertig2 = false;

        //Player3
        int einsenAnzahlPlayer3 = 0;
        int zweienAnzahlPlayer3 = 0;
        int dreienAnzahlPlayer3 = 0;
        int vierenAnzahlPlayer3 = 0;
        int fuenfenAnzahlPlayer3 = 0;
        int sechsenAnzahlPlayer3 = 0;


        int zurueckBewegtInsgesamtPlayer3 = 0;
        int hunderterVersuchePlayer3 = 0;
        int bewegungInsgesamtPlayer3 = 0;
        int leiterNutzungPlayer3 = 0;
        int zugAnzahlPlayer3 = 0;
        int aktuelleFelderzahl3 = 0;
        boolean Fertig3 = false;

        //Player4
        int einsenAnzahlPlayer4 = 0;
        int zweienAnzahlPlayer4 = 0;
        int dreienAnzahlPlayer4 = 0;
        int vierenAnzahlPlayer4 = 0;
        int fuenfenAnzahlPlayer4 = 0;
        int sechsenAnzahlPlayer4 = 0;


        int zurueckBewegtInsgesamtPlayer4 = 0;
        int hunderterVersuchePlayer4 = 0;
        int bewegungInsgesamtPlayer4 = 0;
        int leiterNutzungPlayer4 = 0;
        int zugAnzahlPlayer4 = 0;
        int aktuelleFelderzahl4 = 0;
        boolean Fertig4 = false;





        int zugAnzahl = 0;

        int maxFelderzahl = 100;

        System.out.print( ROT + "ES BEGINNT." + RESET + newline + GELB + "Du bist am Anfang." + RESET );

        System.out.print( BLAU + newline  + "-------------------------------------------" + RESET + newline );



        while ( ! ( Fertig4 & Fertig3 & Fertig2 & Fertig1 ) ) {

            zugAnzahl += 1;

            System.out.print(BLAU +"Zug: "+ zugAnzahl + RESET + newline );


            System.out.print( ROT + "Player1:" + BLAU + "-----------------------------------" + RESET + newline );

            if (aktuelleFelderzahl1 < maxFelderzahl) {



                int wurfzahl1 = random.nextInt(1, 7); // Zahl von inklusive 1 bis exclusive 7

                bewegungInsgesamtPlayer1 += wurfzahl1;

                switch (wurfzahl1) {
                    case 1 -> einsenAnzahlPlayer1 += 1;
                    case 2 -> zweienAnzahlPlayer1 += 1;
                    case 3 -> dreienAnzahlPlayer1 += 1;
                    case 4 -> vierenAnzahlPlayer1 += 1;
                    case 5 -> fuenfenAnzahlPlayer1 += 1;
                    case 6 -> sechsenAnzahlPlayer1 += 1;
                    default -> System.out.print( RESET + "ERROR" + RESET + newline );
                }


                System.out.print(GELB + "Du hast dich um " + wurfzahl1 + " bewegt." + RESET + newline );

                if (aktuelleFelderzahl1 + wurfzahl1 > maxFelderzahl) {

                    wurfzahl1 -= maxFelderzahl - aktuelleFelderzahl1; //z.B aktuellesFeld = 97; wurfzahl = 6; 97 + 6 > 100;
                    aktuelleFelderzahl1 = maxFelderzahl;                        //    wurfzahl = 100 - 97 = 3;
                    aktuelleFelderzahl1 -= wurfzahl1;                  //    aktuellesFeld -= 100 - 3;
                    hunderterVersuchePlayer1 += 1;
                    zurueckBewegtInsgesamtPlayer1 += wurfzahl1;
                    System.out.print(ROT + "DU BIST ZU WEIT GEGANGEN." + RESET + newline );
                    System.out.print(ROT + "DU hast dich um " + wurfzahl1 + " zurückbewegt." + RESET + newline );
                } else {
                    aktuelleFelderzahl1 = aktuelleFelderzahl1 + wurfzahl1;

                }

                switch (aktuelleFelderzahl1) {
                    case 6 ->{
                        aktuelleFelderzahl1 = 27;
                        System.out.print( GRUEN + "Du hast eine Leiter von 6 zu 27 benutzt." + RESET + newline);
                        leiterNutzungPlayer1 += 1;
                    }
                    case 27 ->{
                        aktuelleFelderzahl1 = 6;
                        System.out.print( ROT + "Du hast eine Leiter von 27 zu 6 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 14 ->{
                        aktuelleFelderzahl1 = 19;
                        System.out.print( GRUEN + "Du hast eine Leiter von 14 zu 19 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 19 ->{
                        aktuelleFelderzahl1 = 14;
                        System.out.print( ROT + "Du hast eine Leiter von 19 zu 14 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 21 ->{
                        aktuelleFelderzahl1 = 53;
                        System.out.print( GRUEN + "Du hast eine Leiter von 21 zu 53 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 53 ->{
                        aktuelleFelderzahl1 = 21;
                        System.out.print( ROT + "Du hast eine Leiter von 53 zu 21 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 31 ->{
                        aktuelleFelderzahl1 = 42;
                        System.out.print( GRUEN + "Du hast eine Leiter von 31 zu 42 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 42 ->{
                        aktuelleFelderzahl1 = 31;
                        System.out.print( ROT + "Du hast eine Leiter von 42 zu 31 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 33 ->{
                        aktuelleFelderzahl1 = 38;
                        System.out.print( GRUEN + "Du hast eine Leiter von 33 zu 38 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 38 ->{
                        aktuelleFelderzahl1 = 33;
                        System.out.print( ROT + "Du hast eine Leiter von 38 zu 33 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 46 ->{
                        aktuelleFelderzahl1 = 62;
                        System.out.print( GRUEN + "Du hast eine Leiter von 46 zu 62 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 62 ->{
                        aktuelleFelderzahl1 = 46;
                        System.out.print( ROT + "Du hast eine Leiter von 62 zu 46 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 51 ->{
                        aktuelleFelderzahl1 = 59;
                        System.out.print( GRUEN + "Du hast eine Leiter von 51 zu 59 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 59 ->{
                        aktuelleFelderzahl1 = 51;
                        System.out.print( ROT + "Du hast eine Leiter von 59 zu 51 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 57 ->{
                        aktuelleFelderzahl1 = 96;
                        System.out.print( GRUEN + "Du hast eine Leiter von 57 zu 69 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 96 ->{
                        aktuelleFelderzahl1 = 57;
                        System.out.print( ROT + "Du hast eine Leiter von 69 zu 57 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 65 ->{
                        aktuelleFelderzahl1 = 85;
                        System.out.print( GRUEN + "Du hast eine Leiter von 65 zu 85 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 85 ->{
                        aktuelleFelderzahl1 = 65;
                        System.out.print( ROT + "Du hast eine Leiter von 85 zu 65 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 68 ->{
                        aktuelleFelderzahl1 = 80;
                        System.out.print( GRUEN + "Du hast eine Leiter von 68 zu 80 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 80 ->{
                        aktuelleFelderzahl1 = 68;
                        System.out.print( ROT + "Du hast eine Leiter von 80 zu 68 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 70 ->{
                        aktuelleFelderzahl1 = 76;
                        System.out.print( GRUEN + "Du hast eine Leiter von 70 zu 76 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 76 ->{
                        aktuelleFelderzahl1 = 70;
                        System.out.print( ROT + "Du hast eine Leiter von 76 zu 70 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }

                    case 92 ->{
                        aktuelleFelderzahl1 = 98;
                        System.out.print( GRUEN + "Du hast eine Leiter von 92 zu 98 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }
                    case 98 ->{
                        aktuelleFelderzahl1 = 92;
                        System.out.print( ROT + "Du hast eine Leiter von 98 zu 92 benutzt." + RESET + newline );
                        leiterNutzungPlayer1 += 1;
                    }


                    default -> System.out.print( RESET + "Du hast keine Leiter benutzt." + newline );



                }




                System.out.print(GELB + "Du bist auf Feld "+ aktuelleFelderzahl1 + "." + RESET);

                if ( aktuelleFelderzahl1 == maxFelderzahl ){

                    Fertig1 = true;

                }




                if( Fertig1 ) {

                    zugAnzahlPlayer1 = zugAnzahl;


                    System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline);

                    System.out.print( ROT + "Du hast Feld 100 erreicht." + newline + "Und du hast " + zugAnzahl + " Züge benötigt." + RESET + newline);

                }


            }


            System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline + newline + newline );



            System.out.print( GELB + "Player2:" + BLAU + "-----------------------------------" + RESET + newline );

            if (aktuelleFelderzahl2 < maxFelderzahl) {



                int wurfzahl2 = random.nextInt(1, 7); // Zahl von inklusive 1 bis exclusive 7

                bewegungInsgesamtPlayer2 += wurfzahl2;

                switch (wurfzahl2) {
                    case 1 -> einsenAnzahlPlayer2 += 1;
                    case 2 -> zweienAnzahlPlayer2 += 1;
                    case 3 -> dreienAnzahlPlayer2 += 1;
                    case 4 -> vierenAnzahlPlayer2 += 1;
                    case 5 -> fuenfenAnzahlPlayer2 += 1;
                    case 6 -> sechsenAnzahlPlayer2 += 1;
                    default -> System.out.print( RESET + "ERROR" + RESET + newline );
                }


                System.out.print(GELB + "Du hast dich um " + wurfzahl2 + " bewegt." + RESET + newline );

                if (aktuelleFelderzahl2 + wurfzahl2 > maxFelderzahl) {

                    wurfzahl2 -= maxFelderzahl - aktuelleFelderzahl2; //z.B aktuellesFeld = 97; wurfzahl = 6; 97 + 6 > 100;
                    aktuelleFelderzahl2 = maxFelderzahl;                        //    wurfzahl = 100 - 97 = 3;
                    aktuelleFelderzahl2 -= wurfzahl2;                  //    aktuellesFeld -= 100 - 3;
                    hunderterVersuchePlayer2 += 1;
                    zurueckBewegtInsgesamtPlayer2 += wurfzahl2;
                    System.out.print(ROT + "DU BIST ZU WEIT GEGANGEN." + RESET + newline );
                    System.out.print(ROT + "DU hast dich um " + wurfzahl2 + " zurückbewegt." + RESET + newline );
                } else {
                    aktuelleFelderzahl2 = aktuelleFelderzahl2 + wurfzahl2;

                }

                switch (aktuelleFelderzahl2) {
                    case 6 ->{
                        aktuelleFelderzahl2 = 27;
                        System.out.print( GRUEN + "Du hast eine Leiter von 6 zu 27 benutzt." + RESET + newline);
                        leiterNutzungPlayer2 += 1;
                    }
                    case 27 ->{
                        aktuelleFelderzahl2 = 6;
                        System.out.print( ROT + "Du hast eine Leiter von 27 zu 6 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 14 ->{
                        aktuelleFelderzahl2 = 19;
                        System.out.print( GRUEN + "Du hast eine Leiter von 14 zu 19 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 19 ->{
                        aktuelleFelderzahl2 = 14;
                        System.out.print( ROT + "Du hast eine Leiter von 19 zu 14 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 21 ->{
                        aktuelleFelderzahl2 = 53;
                        System.out.print( GRUEN + "Du hast eine Leiter von 21 zu 53 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 53 ->{
                        aktuelleFelderzahl2 = 21;
                        System.out.print( ROT + "Du hast eine Leiter von 53 zu 21 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 31 ->{
                        aktuelleFelderzahl2 = 42;
                        System.out.print( GRUEN + "Du hast eine Leiter von 31 zu 42 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 42 ->{
                        aktuelleFelderzahl2 = 31;
                        System.out.print( ROT + "Du hast eine Leiter von 42 zu 31 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 33 ->{
                        aktuelleFelderzahl2 = 38;
                        System.out.print( GRUEN + "Du hast eine Leiter von 33 zu 38 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 38 ->{
                        aktuelleFelderzahl2 = 33;
                        System.out.print( ROT + "Du hast eine Leiter von 38 zu 33 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 46 ->{
                        aktuelleFelderzahl2 = 62;
                        System.out.print( GRUEN + "Du hast eine Leiter von 46 zu 62 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 62 ->{
                        aktuelleFelderzahl2 = 46;
                        System.out.print( ROT + "Du hast eine Leiter von 62 zu 46 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 51 ->{
                        aktuelleFelderzahl2 = 59;
                        System.out.print( GRUEN + "Du hast eine Leiter von 51 zu 59 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 59 ->{
                        aktuelleFelderzahl2 = 51;
                        System.out.print( ROT + "Du hast eine Leiter von 59 zu 51 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 57 ->{
                        aktuelleFelderzahl2 = 96;
                        System.out.print( GRUEN + "Du hast eine Leiter von 57 zu 69 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 96 ->{
                        aktuelleFelderzahl2 = 57;
                        System.out.print( ROT + "Du hast eine Leiter von 69 zu 57 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 65 ->{
                        aktuelleFelderzahl2 = 85;
                        System.out.print( GRUEN + "Du hast eine Leiter von 65 zu 85 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 85 ->{
                        aktuelleFelderzahl2 = 65;
                        System.out.print( ROT + "Du hast eine Leiter von 85 zu 65 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 68 ->{
                        aktuelleFelderzahl2 = 80;
                        System.out.print( GRUEN + "Du hast eine Leiter von 68 zu 80 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 80 ->{
                        aktuelleFelderzahl2 = 68;
                        System.out.print( ROT + "Du hast eine Leiter von 80 zu 68 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 70 ->{
                        aktuelleFelderzahl2 = 76;
                        System.out.print( GRUEN + "Du hast eine Leiter von 70 zu 76 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 76 ->{
                        aktuelleFelderzahl2 = 70;
                        System.out.print( ROT + "Du hast eine Leiter von 76 zu 70 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }

                    case 92 ->{
                        aktuelleFelderzahl2 = 98;
                        System.out.print( GRUEN + "Du hast eine Leiter von 92 zu 98 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }
                    case 98 ->{
                        aktuelleFelderzahl2 = 92;
                        System.out.print( ROT + "Du hast eine Leiter von 98 zu 92 benutzt." + RESET + newline );
                        leiterNutzungPlayer2 += 1;
                    }


                    default -> System.out.print( RESET + "Du hast keine Leiter benutzt." + newline );



                }




                System.out.print(GELB + "Du bist auf Feld "+ aktuelleFelderzahl2 + "." + RESET);

                if ( aktuelleFelderzahl2 == maxFelderzahl ){

                    Fertig2 = true;

                }




                if( Fertig2 ) {

                    zugAnzahlPlayer2 = zugAnzahl;


                    System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline);

                    System.out.print( ROT + "Du hast Feld 100 erreicht." + newline + "Und du hast " + zugAnzahl + " Züge benötigt." + RESET + newline);

                }
            }


            System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline + newline + newline );



            System.out.print( GRUEN + "Player3:" + BLAU + "-----------------------------------" + RESET + newline );

            if (aktuelleFelderzahl3 < maxFelderzahl) {



                int wurfzahl3 = random.nextInt(1, 7); // Zahl von inklusive 1 bis exclusive 7

                bewegungInsgesamtPlayer1 += wurfzahl3;

                switch (wurfzahl3) {
                    case 1 -> einsenAnzahlPlayer3 += 1;
                    case 2 -> zweienAnzahlPlayer3 += 1;
                    case 3 -> dreienAnzahlPlayer3 += 1;
                    case 4 -> vierenAnzahlPlayer3 += 1;
                    case 5 -> fuenfenAnzahlPlayer3 += 1;
                    case 6 -> sechsenAnzahlPlayer3 += 1;
                    default -> System.out.print( RESET + "ERROR" + RESET + newline );
                }


                System.out.print(GELB + "Du hast dich um " + wurfzahl3 + " bewegt." + RESET + newline );

                if (aktuelleFelderzahl3 + wurfzahl3 > maxFelderzahl) {

                    wurfzahl3 -= maxFelderzahl - aktuelleFelderzahl3; //z.B aktuellesFeld = 97; wurfzahl = 6; 97 + 6 > 100;
                    aktuelleFelderzahl3 = maxFelderzahl;                        //    wurfzahl = 100 - 97 = 3;
                    aktuelleFelderzahl3 -= wurfzahl3;                  //    aktuellesFeld -= 100 - 3;
                    hunderterVersuchePlayer3 += 1;
                    zurueckBewegtInsgesamtPlayer3 += wurfzahl3;
                    System.out.print(ROT + "DU BIST ZU WEIT GEGANGEN." + RESET + newline );
                    System.out.print(ROT + "DU hast dich um " + wurfzahl3 + " zurückbewegt." + RESET + newline );
                } else {
                    aktuelleFelderzahl3 = aktuelleFelderzahl3 + wurfzahl3;

                }

                switch (aktuelleFelderzahl3) {
                    case 6 ->{
                        aktuelleFelderzahl3 = 27;
                        System.out.print( GRUEN + "Du hast eine Leiter von 6 zu 27 benutzt." + RESET + newline);
                        leiterNutzungPlayer3 += 1;
                    }
                    case 27 ->{
                        aktuelleFelderzahl3 = 6;
                        System.out.print( ROT + "Du hast eine Leiter von 27 zu 6 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 14 ->{
                        aktuelleFelderzahl3 = 19;
                        System.out.print( GRUEN + "Du hast eine Leiter von 14 zu 19 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 19 ->{
                        aktuelleFelderzahl3 = 14;
                        System.out.print( ROT + "Du hast eine Leiter von 19 zu 14 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 21 ->{
                        aktuelleFelderzahl3 = 53;
                        System.out.print( GRUEN + "Du hast eine Leiter von 21 zu 53 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 53 ->{
                        aktuelleFelderzahl3 = 21;
                        System.out.print( ROT + "Du hast eine Leiter von 53 zu 21 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 31 ->{
                        aktuelleFelderzahl3 = 42;
                        System.out.print( GRUEN + "Du hast eine Leiter von 31 zu 42 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 42 ->{
                        aktuelleFelderzahl3 = 31;
                        System.out.print( ROT + "Du hast eine Leiter von 42 zu 31 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 33 ->{
                        aktuelleFelderzahl3 = 38;
                        System.out.print( GRUEN + "Du hast eine Leiter von 33 zu 38 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 38 ->{
                        aktuelleFelderzahl3 = 33;
                        System.out.print( ROT + "Du hast eine Leiter von 38 zu 33 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 46 ->{
                        aktuelleFelderzahl3 = 62;
                        System.out.print( GRUEN + "Du hast eine Leiter von 46 zu 62 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 62 ->{
                        aktuelleFelderzahl3 = 46;
                        System.out.print( ROT + "Du hast eine Leiter von 62 zu 46 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 51 ->{
                        aktuelleFelderzahl3 = 59;
                        System.out.print( GRUEN + "Du hast eine Leiter von 51 zu 59 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 59 ->{
                        aktuelleFelderzahl3 = 51;
                        System.out.print( ROT + "Du hast eine Leiter von 59 zu 51 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 57 ->{
                        aktuelleFelderzahl3 = 96;
                        System.out.print( GRUEN + "Du hast eine Leiter von 57 zu 69 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 96 ->{
                        aktuelleFelderzahl3 = 57;
                        System.out.print( ROT + "Du hast eine Leiter von 69 zu 57 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 65 ->{
                        aktuelleFelderzahl1 = 85;
                        System.out.print( GRUEN + "Du hast eine Leiter von 65 zu 85 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 85 ->{
                        aktuelleFelderzahl3 = 65;
                        System.out.print( ROT + "Du hast eine Leiter von 85 zu 65 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 68 ->{
                        aktuelleFelderzahl3 = 80;
                        System.out.print( GRUEN + "Du hast eine Leiter von 68 zu 80 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 80 ->{
                        aktuelleFelderzahl3 = 68;
                        System.out.print( ROT + "Du hast eine Leiter von 80 zu 68 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 70 ->{
                        aktuelleFelderzahl3 = 76;
                        System.out.print( GRUEN + "Du hast eine Leiter von 70 zu 76 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 76 ->{
                        aktuelleFelderzahl3 = 70;
                        System.out.print( ROT + "Du hast eine Leiter von 76 zu 70 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }

                    case 92 ->{
                        aktuelleFelderzahl3 = 98;
                        System.out.print( GRUEN + "Du hast eine Leiter von 92 zu 98 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }
                    case 98 ->{
                        aktuelleFelderzahl3 = 92;
                        System.out.print( ROT + "Du hast eine Leiter von 98 zu 92 benutzt." + RESET + newline );
                        leiterNutzungPlayer3 += 1;
                    }


                    default -> System.out.print( RESET + "Du hast keine Leiter benutzt." + newline );



                }




                System.out.print(GELB + "Du bist auf Feld "+ aktuelleFelderzahl3 + "." + RESET);

                if ( aktuelleFelderzahl3 == maxFelderzahl ){

                    Fertig3 = true;

                }




                if( Fertig3 ) {

                    zugAnzahlPlayer3 = zugAnzahl;


                    System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline);

                    System.out.print( ROT + "Du hast Feld 100 erreicht." + newline + "Und du hast " + zugAnzahl + " Züge benötigt." + RESET + newline);

                }


            }




            System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline + newline + newline );



            System.out.print( BLAU + "Player4:" + BLAU + "-----------------------------------" + RESET + newline );

            if (aktuelleFelderzahl4 < maxFelderzahl) {



                int wurfzahl4 = random.nextInt(1, 7); // Zahl von inklusive 1 bis exclusive 7

                bewegungInsgesamtPlayer4 += wurfzahl4;

                switch (wurfzahl4) {
                    case 1 -> einsenAnzahlPlayer4 += 1;
                    case 2 -> zweienAnzahlPlayer4 += 1;
                    case 3 -> dreienAnzahlPlayer4 += 1;
                    case 4 -> vierenAnzahlPlayer4 += 1;
                    case 5 -> fuenfenAnzahlPlayer4 += 1;
                    case 6 -> sechsenAnzahlPlayer4 += 1;
                    default -> System.out.print( RESET + "ERROR" + RESET + newline );
                }


                System.out.print(GELB + "Du hast dich um " + wurfzahl4 + " bewegt." + RESET + newline );

                if (aktuelleFelderzahl4 + wurfzahl4 > maxFelderzahl) {

                    wurfzahl4 -= maxFelderzahl - aktuelleFelderzahl4; //z.B aktuellesFeld = 97; wurfzahl = 6; 97 + 6 > 100;
                    aktuelleFelderzahl4 = maxFelderzahl;                        //    wurfzahl = 100 - 97 = 3;
                    aktuelleFelderzahl4 -= wurfzahl4;                  //    aktuellesFeld -= 100 - 3;
                    hunderterVersuchePlayer4 += 1;
                    zurueckBewegtInsgesamtPlayer4 += wurfzahl4;
                    System.out.print(ROT + "DU BIST ZU WEIT GEGANGEN." + RESET + newline );
                    System.out.print(ROT + "DU hast dich um " + wurfzahl4 + " zurückbewegt." + RESET + newline );
                } else {
                    aktuelleFelderzahl4 = aktuelleFelderzahl4 + wurfzahl4;

                }

                switch (aktuelleFelderzahl4) {
                    case 6 ->{
                        aktuelleFelderzahl4 = 27;
                        System.out.print( GRUEN + "Du hast eine Leiter von 6 zu 27 benutzt." + RESET + newline);
                        leiterNutzungPlayer4 += 1;
                    }
                    case 27 ->{
                        aktuelleFelderzahl4 = 6;
                        System.out.print( ROT + "Du hast eine Leiter von 27 zu 6 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 14 ->{
                        aktuelleFelderzahl4 = 19;
                        System.out.print( GRUEN + "Du hast eine Leiter von 14 zu 19 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 19 ->{
                        aktuelleFelderzahl4 = 14;
                        System.out.print( ROT + "Du hast eine Leiter von 19 zu 14 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 21 ->{
                        aktuelleFelderzahl4 = 53;
                        System.out.print( GRUEN + "Du hast eine Leiter von 21 zu 53 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 53 ->{
                        aktuelleFelderzahl4 = 21;
                        System.out.print( ROT + "Du hast eine Leiter von 53 zu 21 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 31 ->{
                        aktuelleFelderzahl4 = 42;
                        System.out.print( GRUEN + "Du hast eine Leiter von 31 zu 42 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 42 ->{
                        aktuelleFelderzahl4 = 31;
                        System.out.print( ROT + "Du hast eine Leiter von 42 zu 31 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 33 ->{
                        aktuelleFelderzahl4 = 38;
                        System.out.print( GRUEN + "Du hast eine Leiter von 33 zu 38 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 38 ->{
                        aktuelleFelderzahl4 = 33;
                        System.out.print( ROT + "Du hast eine Leiter von 38 zu 33 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 46 ->{
                        aktuelleFelderzahl4 = 62;
                        System.out.print( GRUEN + "Du hast eine Leiter von 46 zu 62 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 62 ->{
                        aktuelleFelderzahl4 = 46;
                        System.out.print( ROT + "Du hast eine Leiter von 62 zu 46 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 51 ->{
                        aktuelleFelderzahl4 = 59;
                        System.out.print( GRUEN + "Du hast eine Leiter von 51 zu 59 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 59 ->{
                        aktuelleFelderzahl4 = 51;
                        System.out.print( ROT + "Du hast eine Leiter von 59 zu 51 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 57 ->{
                        aktuelleFelderzahl4 = 96;
                        System.out.print( GRUEN + "Du hast eine Leiter von 57 zu 69 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 96 ->{
                        aktuelleFelderzahl4 = 57;
                        System.out.print( ROT + "Du hast eine Leiter von 69 zu 57 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 65 ->{
                        aktuelleFelderzahl4 = 85;
                        System.out.print( GRUEN + "Du hast eine Leiter von 65 zu 85 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 85 ->{
                        aktuelleFelderzahl4 = 65;
                        System.out.print( ROT + "Du hast eine Leiter von 85 zu 65 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 68 ->{
                        aktuelleFelderzahl4 = 80;
                        System.out.print( GRUEN + "Du hast eine Leiter von 68 zu 80 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 80 ->{
                        aktuelleFelderzahl4 = 68;
                        System.out.print( ROT + "Du hast eine Leiter von 80 zu 68 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 70 ->{
                        aktuelleFelderzahl4 = 76;
                        System.out.print( GRUEN + "Du hast eine Leiter von 70 zu 76 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 76 ->{
                        aktuelleFelderzahl4 = 70;
                        System.out.print( ROT + "Du hast eine Leiter von 76 zu 70 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }

                    case 92 ->{
                        aktuelleFelderzahl4 = 98;
                        System.out.print( GRUEN + "Du hast eine Leiter von 92 zu 98 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }
                    case 98 ->{
                        aktuelleFelderzahl4 = 92;
                        System.out.print( ROT + "Du hast eine Leiter von 98 zu 92 benutzt." + RESET + newline );
                        leiterNutzungPlayer4 += 1;
                    }


                    default -> System.out.print( RESET + "Du hast keine Leiter benutzt." + newline );



                }




                System.out.print(GELB + "Du bist auf Feld "+ aktuelleFelderzahl4 + "." + RESET);

                if ( aktuelleFelderzahl4 == maxFelderzahl ){

                    Fertig4 = true;

                }




                if( Fertig4 ) {

                    zugAnzahlPlayer4 = zugAnzahl;


                    System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline);

                    System.out.print( ROT + "Du hast Feld 100 erreicht." + newline + "Und du hast " + zugAnzahl + " Züge benötigt." + RESET + newline);

                }
            }

            System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline + newline + newline );

        }




        System.out.print( ROT + "Das Spiel ist Fertig." + newline + "Und du hast " + zugAnzahl + " Züge benötigt." + RESET + newline);

        System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline );




        /*
einsenAnzahl
zweienAnzahl
dreienAnzahl
vierenAnzahl
fuenfenAnzahl
sechsenAnzahl
zurueckBewegtInsgesamt




 */




        System.out.print( BLAU + newline + "ZUSATZ:" + RESET + newline );


        System.out.print( newline + ROT + "Player1:" + BLAU + "-----------------------------------" + RESET + newline );

        System.out.print( RESET + "Du hast " + BLAU + einsenAnzahlPlayer1 + RESET + "mal 1 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + zweienAnzahlPlayer1 + RESET + "mal 2 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + dreienAnzahlPlayer1 + RESET + "mal 3 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + vierenAnzahlPlayer1 + RESET + "mal 4 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + fuenfenAnzahlPlayer1 + RESET + "mal 5 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + sechsenAnzahlPlayer1 + RESET + "mal 6 gewürfelt." + RESET + newline );

        System.out.print( RESET + newline + "Du hast " + BLAU + leiterNutzungPlayer1 + RESET + "mal Leiter(n) benutzt." + RESET + newline );

        System.out.print( RESET + "Du hast dich über insgesamt " + BLAU + bewegungInsgesamtPlayer1 + RESET + " Felder bewegt." + RESET + newline );

        System.out.print( RESET + "Du musstest dich " + BLAU + hunderterVersuchePlayer1 + RESET + "mal zurückbewegen und dies um insgesamt "+ BLAU + zurueckBewegtInsgesamtPlayer1 + RESET + " Feld(er)." + RESET + newline );

        System.out.print( "Du hast " + BLAU + zugAnzahlPlayer1 + RESET + " Züge benötigt." + RESET + newline);


        System.out.print( newline + GELB + "Player2:" + BLAU + "-----------------------------------" + RESET + newline );

        System.out.print( RESET + "Du hast " + BLAU + einsenAnzahlPlayer2 + RESET + "mal 1 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + zweienAnzahlPlayer2 + RESET + "mal 2 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + dreienAnzahlPlayer2 + RESET + "mal 3 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + vierenAnzahlPlayer2 + RESET + "mal 4 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + fuenfenAnzahlPlayer2 + RESET + "mal 5 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + sechsenAnzahlPlayer2 + RESET + "mal 6 gewürfelt." + RESET + newline );

        System.out.print( RESET + newline + "Du hast " + BLAU + leiterNutzungPlayer2 + RESET + "mal Leiter(n) benutzt." + RESET + newline );

        System.out.print( RESET + "Du hast dich über insgesamt " + BLAU + bewegungInsgesamtPlayer2 + RESET + " Felder bewegt." + RESET + newline );

        System.out.print( RESET + "Du musstest dich " + BLAU + hunderterVersuchePlayer2 + RESET + "mal zurückbewegen und dies um insgesamt "+ BLAU + zurueckBewegtInsgesamtPlayer1 + RESET + " Feld(er)." + RESET + newline );

        System.out.print( "Du hast " + BLAU + zugAnzahlPlayer2 + RESET + " Züge benötigt." + RESET + newline);



        System.out.print( newline + GRUEN + "Player3:" + BLAU + "-----------------------------------" + RESET + newline );

        System.out.print( RESET + "Du hast " + BLAU + einsenAnzahlPlayer3 + RESET + "mal 1 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + zweienAnzahlPlayer3 + RESET + "mal 2 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + dreienAnzahlPlayer3 + RESET + "mal 3 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + vierenAnzahlPlayer3 + RESET + "mal 4 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + fuenfenAnzahlPlayer3 + RESET + "mal 5 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + sechsenAnzahlPlayer3 + RESET + "mal 6 gewürfelt." + RESET + newline );

        System.out.print( RESET + newline + "Du hast " + BLAU + leiterNutzungPlayer3 + RESET + "mal Leiter(n) benutzt." + RESET + newline );

        System.out.print( RESET + "Du hast dich über insgesamt " + BLAU + bewegungInsgesamtPlayer3 + RESET + " Felder bewegt." + RESET + newline );

        System.out.print( RESET + "Du musstest dich " + BLAU + hunderterVersuchePlayer3 + RESET + "mal zurückbewegen und dies um insgesamt "+ BLAU + zurueckBewegtInsgesamtPlayer1 + RESET + " Feld(er)." + RESET + newline );

        System.out.print( "Du hast " + BLAU + zugAnzahlPlayer3 + RESET + " Züge benötigt." + RESET + newline);


        System.out.print( newline + BLAU + "Player4:" + BLAU + "-----------------------------------" + RESET + newline );

        System.out.print( RESET + "Du hast " + BLAU + einsenAnzahlPlayer4 + RESET + "mal 1 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + zweienAnzahlPlayer4 + RESET + "mal 2 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + dreienAnzahlPlayer4 + RESET + "mal 3 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + vierenAnzahlPlayer4 + RESET + "mal 4 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + fuenfenAnzahlPlayer4 + RESET + "mal 5 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + sechsenAnzahlPlayer4 + RESET + "mal 6 gewürfelt." + RESET + newline );

        System.out.print( RESET + newline + "Du hast " + BLAU + leiterNutzungPlayer4 + RESET + "mal Leiter(n) benutzt." + RESET + newline );

        System.out.print( RESET + "Du hast dich über insgesamt " + BLAU + bewegungInsgesamtPlayer4 + RESET + " Felder bewegt." + RESET + newline );

        System.out.print( RESET + "Du musstest dich " + BLAU + hunderterVersuchePlayer4 + RESET + "mal zurückbewegen und dies um insgesamt "+ BLAU + zurueckBewegtInsgesamtPlayer1 + RESET + " Feld(er)." + RESET + newline );

        System.out.print( "Du hast " + BLAU + zugAnzahlPlayer4 + RESET + " Züge benötigt." + RESET + newline);



        System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline + newline );



        int[] a = {einsenAnzahlPlayer1, einsenAnzahlPlayer2, einsenAnzahlPlayer3, einsenAnzahlPlayer4};

        Arrays.sort(a);


        System.out.println( RESET + "Einsenanzahl: " + BLAU +  Arrays.toString(a) + RESET + newline );



        int[] b = {zweienAnzahlPlayer1, zweienAnzahlPlayer2, zweienAnzahlPlayer3, zweienAnzahlPlayer4};

        Arrays.sort(b);


        System.out.println( RESET + "Zweienanzahl: " + BLAU +  Arrays.toString(b) + RESET + newline );



        int[] c = {dreienAnzahlPlayer1, dreienAnzahlPlayer2, dreienAnzahlPlayer3, dreienAnzahlPlayer4};

        Arrays.sort(c);


        System.out.println( RESET + "Dreienanzahl: " + BLAU +  Arrays.toString(c) + RESET + newline );



        int[] d = {vierenAnzahlPlayer1, vierenAnzahlPlayer2, vierenAnzahlPlayer3, vierenAnzahlPlayer4};

        Arrays.sort(d);


        System.out.println( RESET + "Vierenanzahl: " + BLAU +  Arrays.toString(d) + RESET + newline );


        int[] e = {fuenfenAnzahlPlayer1, fuenfenAnzahlPlayer2, fuenfenAnzahlPlayer3, fuenfenAnzahlPlayer4};

        Arrays.sort(e);


        System.out.println( RESET + "Fünfenanzahl: " + BLAU +  Arrays.toString(e) + RESET + newline );



        int[] f = {sechsenAnzahlPlayer1, sechsenAnzahlPlayer2, sechsenAnzahlPlayer3, sechsenAnzahlPlayer4};

        Arrays.sort(f);


        System.out.println( RESET + "Sechsenanzahl: " + BLAU +  Arrays.toString(f) + RESET + newline );



        int[] g = {leiterNutzungPlayer1, leiterNutzungPlayer2, leiterNutzungPlayer3, leiterNutzungPlayer4};

        Arrays.sort(g);


        System.out.println( RESET + "Leiternutzung: " + BLAU +  Arrays.toString(g) + RESET + newline );



        int[] h = {bewegungInsgesamtPlayer1, bewegungInsgesamtPlayer2, bewegungInsgesamtPlayer3, bewegungInsgesamtPlayer4};

        Arrays.sort(h);


        System.out.println( RESET + "Bewegung insgesamt: " + BLAU +  Arrays.toString(h) + RESET + newline );



        int[] i = {hunderterVersuchePlayer1, hunderterVersuchePlayer2, hunderterVersuchePlayer3, hunderterVersuchePlayer4};

        Arrays.sort(i);


        System.out.println( RESET + "Versuche Hunder zu erreichen: " + BLAU +  Arrays.toString(i) + RESET + newline );



        int[] j = {zurueckBewegtInsgesamtPlayer1, zurueckBewegtInsgesamtPlayer2, zurueckBewegtInsgesamtPlayer3, zurueckBewegtInsgesamtPlayer4};

        Arrays.sort(j);


        System.out.println( RESET + "Zurückbewegt insgesamt: " + BLAU +  Arrays.toString(j) + RESET + newline );



        int[] k = {zugAnzahlPlayer1, zugAnzahlPlayer2, zugAnzahlPlayer3, zugAnzahlPlayer4};

        Arrays.sort(k);


        System.out.println( RESET + "Zuganzahl: " + BLAU +  Arrays.toString(k) + RESET + newline );




        System.out.print( BLAU + newline + "-------------------------------------------" + RESET );




    }



}