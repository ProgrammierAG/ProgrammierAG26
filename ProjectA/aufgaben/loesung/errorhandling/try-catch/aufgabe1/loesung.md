## Lösung

```java
import java.util.Scanner;

public class DivisionMitFehlerbehandlung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib die erste Zahl ein: ");
        int zahl1 = scanner.nextInt();

        System.out.print("Gib die zweite Zahl ein: ");
        int zahl2 = scanner.nextInt();

        try {
            int ergebnis = zahl1 / zahl2;
            System.out.println("Ergebnis: " + ergebnis);
        } catch (ArithmeticException e) {
            System.out.println("Fehler: Division durch Null ist nicht erlaubt!");
        }
    }
}

```
