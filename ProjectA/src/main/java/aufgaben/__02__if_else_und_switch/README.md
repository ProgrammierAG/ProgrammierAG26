#  If-else Verzweigung

Die `if-else` Verzweigung ist eine grundlegende Kontrollstruktur in Java. Sie wird verwendet, um Entscheidungen zu treffen und verschiedene Code-Blöcke auszuführen je nachdem, ob eine Bedingung **wahr (`true`)** oder **falsch (`false`)** ist.

```java
public static void main(String[] args) {
    boolean condition1 = 1 > 2;
    boolean condition2 = 2 > 2;
    if (condition1) {
        System.out.println("1");
    } else if(condition2) {
        System.out.println("2");
    } else {
        System.out.println("3");
    }
}
```

#### Konsole
```text
3
```

---
# Switch-case Verzweigung

Die `Switch-case` Verzweigung ist eine Alternative zur `if-else`-Kette. Sie wird verwendet, wenn eine Variable mit **mehreren festen Werten** verglichen werden soll.

```java
public static void main(String[] args) {
    int zahl = 231;

    switch (zahl) {
        case 1:
            // Code, wenn variable == 1
            break;
        case 2:
            // Code, wenn variable == 2
            break; // Switch case wird verlassen

        case 3:
            // Code, wenn variable == 3
            // Code läuft weiter bis zum nächsten break

        case 4,5,6:
            // Code, wenn variable == 4
            break;

            // Weitere Fälle können hier hinzugefügt werden

        default:
            // Code, wenn kein anderer Fall passt
    }
}
```
---
