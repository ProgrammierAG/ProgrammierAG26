
package Versuch1.Leiterspiel;

import java.util.Random;


public class matlab {

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

        int einsenAnzahl = 0;
        int zweienAnzahl = 0;
        int dreienAnzahl = 0;
        int vierenAnzahl = 0;
        int fuenfenAnzahl = 0;
        int sechsenAnzahl = 0;


        int zurueckBewegtInsgesamt = 0;
        int hunderterVersuche = 0;
        int bewegungInsgesamt = 0;
        int leiterNutzung = 0;
        int zugAnzahl = 0;
        int aktuelleFelderzahl = 0;
        int maxFelderzahl = 100;

        System.out.print( ROT + "ES BEGINNT." + RESET + newline + GELB + "Du bist am Anfang." + RESET );

        System.out.print( BLAU + newline  + "-------------------------------------------" + RESET + newline );

        while (aktuelleFelderzahl < maxFelderzahl) {

            zugAnzahl += 1 ;

            System.out.print(BLAU +"Zug: "+ zugAnzahl + RESET + newline );






            int wurfzahl = random.nextInt(1, 7); // Zahl von inklusive 1 bis exclusive 7

            bewegungInsgesamt += wurfzahl;

            switch (wurfzahl) {
                case 1 -> einsenAnzahl += 1;
                case 2 -> zweienAnzahl += 1;
                case 3 -> dreienAnzahl += 1;
                case 4 -> vierenAnzahl += 1;
                case 5 -> fuenfenAnzahl += 1;
                case 6 -> sechsenAnzahl += 1;
                default -> System.out.print( RESET + "ERROR" + RESET + newline );
            }


            System.out.print(GELB + "Du hast dich um " + wurfzahl + " bewegt." + RESET + newline );

            if (aktuelleFelderzahl + wurfzahl > maxFelderzahl) {

                wurfzahl -= maxFelderzahl - aktuelleFelderzahl; //z.B aktuellesFeld = 97; wurfzahl = 6; 97 + 6 > 100;
                aktuelleFelderzahl = maxFelderzahl;                        //    wurfzahl = 100 - 97 = 3;
                aktuelleFelderzahl -= wurfzahl;                  //    aktuellesFeld -= 100 - 3;
                hunderterVersuche += 1;
                zurueckBewegtInsgesamt += wurfzahl;
                System.out.print(ROT + "DU BIST ZU WEIT GEGANGEN." + RESET + newline );
                System.out.print(ROT + "Du hast dich um " + wurfzahl + " zurückbewegt." + RESET + newline );
            } else {
                aktuelleFelderzahl = aktuelleFelderzahl + wurfzahl;

            }

            switch (aktuelleFelderzahl) {
                case 6 ->{
                    aktuelleFelderzahl = 27;
                    System.out.print( GRUEN + "Du hast eine Leiter von 6 zu 27 benutzt." + RESET + newline);
                    leiterNutzung += 1;
                }
                case 27 ->{
                    aktuelleFelderzahl = 6;
                    System.out.print( ROT + "Du hast eine Leiter von 27 zu 6 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 14 ->{
                    aktuelleFelderzahl = 19;
                    System.out.print( GRUEN + "Du hast eine Leiter von 14 zu 19 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 19 ->{
                    aktuelleFelderzahl = 14;
                    System.out.print( ROT + "Du hast eine Leiter von 19 zu 14 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 21 ->{
                    aktuelleFelderzahl = 53;
                    System.out.print( GRUEN + "Du hast eine Leiter von 21 zu 53 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 53 ->{
                    aktuelleFelderzahl = 21;
                    System.out.print( ROT + "Du hast eine Leiter von 53 zu 21 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 31 ->{
                    aktuelleFelderzahl = 42;
                    System.out.print( GRUEN + "Du hast eine Leiter von 31 zu 42 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 42 ->{
                    aktuelleFelderzahl = 31;
                    System.out.print( ROT + "Du hast eine Leiter von 42 zu 31 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 33 ->{
                    aktuelleFelderzahl = 38;
                    System.out.print( GRUEN + "Du hast eine Leiter von 33 zu 38 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 38 ->{
                    aktuelleFelderzahl = 33;
                    System.out.print( ROT + "Du hast eine Leiter von 38 zu 33 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 46 ->{
                    aktuelleFelderzahl = 62;
                    System.out.print( GRUEN + "Du hast eine Leiter von 46 zu 62 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 62 ->{
                    aktuelleFelderzahl = 46;
                    System.out.print( ROT + "Du hast eine Leiter von 62 zu 46 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 51 ->{
                    aktuelleFelderzahl = 59;
                    System.out.print( GRUEN + "Du hast eine Leiter von 51 zu 59 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 59 ->{
                    aktuelleFelderzahl = 51;
                    System.out.print( ROT + "Du hast eine Leiter von 59 zu 51 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 57 ->{
                    aktuelleFelderzahl = 96;
                    System.out.print( GRUEN + "Du hast eine Leiter von 57 zu 69 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 96 ->{
                    aktuelleFelderzahl = 57;
                    System.out.print( ROT + "Du hast eine Leiter von 69 zu 57 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 65 ->{
                    aktuelleFelderzahl = 85;
                    System.out.print( GRUEN + "Du hast eine Leiter von 65 zu 85 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 85 ->{
                    aktuelleFelderzahl = 65;
                    System.out.print( ROT + "Du hast eine Leiter von 85 zu 65 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 68 ->{
                    aktuelleFelderzahl = 80;
                    System.out.print( GRUEN + "Du hast eine Leiter von 68 zu 80 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 80 ->{
                    aktuelleFelderzahl = 68;
                    System.out.print( ROT + "Du hast eine Leiter von 80 zu 68 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 70 ->{
                    aktuelleFelderzahl = 76;
                    System.out.print( GRUEN + "Du hast eine Leiter von 70 zu 76 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 76 ->{
                    aktuelleFelderzahl = 70;
                    System.out.print( ROT + "Du hast eine Leiter von 76 zu 70 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }

                case 92 ->{
                    aktuelleFelderzahl = 98;
                    System.out.print( GRUEN + "Du hast eine Leiter von 92 zu 98 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }
                case 98 ->{
                    aktuelleFelderzahl = 92;
                    System.out.print( ROT + "Du hast eine Leiter von 98 zu 92 benutzt." + RESET + newline );
                    leiterNutzung += 1;
                }


                default -> System.out.print( RESET + "Du hast keine Leiter benutzt." + newline );



            }




            System.out.print(GELB + "Du bist auf Feld "+ aktuelleFelderzahl + "." + RESET);

            System.out.print( BLAU + newline + "-------------------------------------------" + RESET + newline );

        }

        System.out.print( ROT + "Du hast Feld 100 erreicht." + newline + "Und du hast " + zugAnzahl + " Züge benötigt." + RESET + newline);

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


        System.out.print( RESET + "Du hast " + BLAU + einsenAnzahl + RESET + "mal 1 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + zweienAnzahl + RESET + "mal 2 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + dreienAnzahl + RESET + "mal 3 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + vierenAnzahl + RESET + "mal 4 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + fuenfenAnzahl + RESET + "mal 5 gewürfelt." + RESET + newline );
        System.out.print( RESET + "Du hast " + BLAU + sechsenAnzahl + RESET + "mal 6 gewürfelt." + RESET + newline );

        System.out.print( RESET + newline + "Du hast " + BLAU + leiterNutzung + RESET + "mal Leiter(n) benutzt." + RESET + newline );

        System.out.print( RESET + "Du hast dich über insgesamt " + BLAU + bewegungInsgesamt + RESET + " Felder bewegt." + RESET + newline );

        System.out.print( RESET + "Du musstest dich " + BLAU + hunderterVersuche + RESET + "mal zurückbewegen/-t und dies um insgesamt "+ BLAU + zurueckBewegtInsgesamt + RESET + " Feld(er)." + RESET + newline );


        System.out.print( BLAU + newline + "-------------------------------------------" + RESET );

    }
}