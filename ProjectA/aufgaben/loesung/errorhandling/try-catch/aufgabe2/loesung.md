## Lösung

```java
import java.util.Scanner;

import java.util.Scanner;

public class ArrayZugriffMitFehlerbehandlung {
    public static void main(String[] args) {
        int[] zahlen = {5, 10, 15};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib einen Index ein: ");
        int index = scanner.nextInt();

        try {
            System.out.println("Element: " + zahlen[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Fehler: Index außerhalb des Arrays!");
        }
    }
}

```
