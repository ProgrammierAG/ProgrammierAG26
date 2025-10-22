## Lösung

```java
import java.util.Scanner;

public class NamePruefen {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Gib deinen Namen ein: ");
    String name = scanner.nextLine();

    try {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name darf nicht leer sein!");
        }
        System.out.println("Hallo, " + name + "!");
    } catch (IllegalArgumentException e) {
        System.out.println("Fehler: " + e.getMessage());
    }
}
}


```
