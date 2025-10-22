# Error Handling

# Try-Catch

In der Programmierung passieren manchmal **Fehler während der Laufzeit** – zum Beispiel, wenn das Programm versucht, eine Datei zu öffnen, die nicht existiert, oder eine Zahl durch Null zu teilen. Diese Fehler nennt man **Ausnahmen** (*Exceptions*). Wenn solche Fehler nicht behandelt werden, **stürzt das Programm ab**.

Um das zu verhindern, gibt es in vielen Programmiersprachen wie Java und Kotlin den **`try-catch`-Block**.

## Was macht ein Try-Catch-Block?

Ein `try-catch`-Block erlaubt es dem Programm, **auf Fehler zu reagieren**, statt einfach aufzuhören zu laufen. Die Idee ist:

1. Der Code, der möglicherweise einen Fehler verursacht, kommt in den `try`-Block.
2. Wenn ein Fehler auftritt, wird er im `catch`-Block behandelt.

Beispiel:
```java
public class Beispiel {
    public static void main(String[] args) {
    try {
        int zahl = 10 / 0; // Das verursacht einen Fehler!
    } catch (ArithmeticException e) {
        System.out.println("Fehler: Division durch Null ist nicht erlaubt.");
    }
}
}
```
### Wie funktioniert das?
- Der Code in `try { ... }` wird normal ausgeführt.
- Wenn eine **Ausnahme** (z. B. `ArithmeticException`) auftritt, wird der Rest des `try`-Blocks übersprungen.
- Stattdessen springt das Programm direkt in den **`catch`-Block**.

## Warum ist das wichtig?
Ohne Try-Catch würde ein einfacher Fehler dein Programm stoppen. Mit Try-Catch kannst du Fehler **kontrolliert behandeln**, z. B. eine Fehlermeldung zeigen oder eine alternative Aktion durchführen.

## Mehrere Catch-Blöcke
Manchmal kann im gleichen Code **mehr als eine Art Fehler** auftreten. In so einem Fall kannst du mehrere `catch`-Blöcke verwenden:
```java
try {
    int[] zahlen = {1, 2, 3};
    System.out.println(zahlen); // ArrayIndexOutOfBoundsException
} catch (ArithmeticException e) {
    System.out.println("Mathematischer Fehler.");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Fehler: Index außerhalb des Arrays.");
}
```

## Zusammenfassung
- **`try`**: Hier steht der riskante Code.
- **`catch`**: Wird ausgeführt, wenn ein Fehler passiert.
- **Sinn**: Das Programm bleibt stabil und kann sinnvoll auf Fehler reagieren.


# Exceptions

Wenn du programmierst, läuft nicht immer alles perfekt. Manchmal passieren Dinge, die du **nicht vorhersehen kannst** – zum Beispiel:

- Eine Datei, die du laden willst, existiert nicht.
- Der Benutzer gibt den falschen Wert ein.
- Eine Zahl wird durch 0 geteilt.

Solche Fehler nennt man **Exceptions** (auf Deutsch: **Ausnahmen**).

## Was ist eine Exception?

Eine **Exception** ist ein Ereignis, das auftritt, **wenn im Programm etwas Unerwartetes passiert**.
Wenn dieser Fehler nicht behandelt wird, stoppt das Programm sofort.

### Beispiel
```java
public class Beispiel {
    public static void main(String[] args) {
        int zahl = 10 / 0; // Fehler beim Teilen durch Null
        System.out.println("Das wird nie ausgeführt!");
    }
}
```
Dieser Code erzeugt eine **`ArithmeticException`**, weil die Division durch 0 nicht erlaubt ist.
Das Programm stürzt ab, bevor es die zweite Zeile erreichen kann.

## Wie reagiert man auf Exceptions?

Um auf Fehler zu reagieren, benutzt man den **`try-catch`-Block**, den du schon im vorherigen Thema kennengelernt hast.
```java
try {
    int zahl = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Fehler: Division durch Null!");
}
```

So kann dein Programm **weiterlaufen**, auch wenn ein Fehler auftaucht.

## Arten von Exceptions

Es gibt viele verschiedene Arten von Exceptions. Hier sind einige wichtige:

- **ArithmeticException** – mathematischer Fehler (z. B. Division durch 0)
- **NullPointerException** – man versucht, auf etwas zuzugreifen, das „leer“ (null) ist
- **ArrayIndexOutOfBoundsException** – man versucht, auf ein Array-Element zuzugreifen, das es nicht gibt
- **FileNotFoundException** – eine Datei wurde nicht gefunden
- **IOException** – ein allgemeiner Eingabe/Ausgabe-Fehler (z. B. beim Lesen oder Schreiben von Dateien)

### Beispiel mit mehreren möglichen Exceptions
```java
try {
    String text = null;
    System.out.println(text.length()); // NullPointerException
} catch (NullPointerException e) {
    System.out.println("Fehler: Es wurde auf ein null-Objekt zugegriffen.");
}
```
## Exception-Hierarchie

In Java ist jede Exception ein **Objekt**, das von der Klasse `Exception` oder `Error` abstammt.
Man kann sich das wie einen **Stammbaum** vorstellen:
```
Throwable
├── Exception
│ ├── IOException
│ ├── RuntimeException
│ │ ├── ArithmeticException
│ │ ├── NullPointerException
│ │ └── ArrayIndexOutOfBoundsException
└── Error
```

- `Exception`: Dinge, die man abfangen und behandeln sollte.
- `Error`: Schwere Fehler (z. B. Speicherprobleme), die man **nicht** behandeln kann.

## Warum sind Exceptions nützlich?

Mit Exceptions kannst du:
- Fehler kontrolliert abfangen.
- Den Programmabsturz verhindern.
- Den Benutzern hilfreiche Fehlermeldungen zeigen.
- Deinen Code stabiler und sicherer machen.

## Zusammenfassung

- **Exceptions** sind unerwartete Ereignisse im Programm.
- Sie stoppen das Programm, wenn sie nicht behandelt werden.
- Mit `try-catch` kannst du sie abfangen.
- Es gibt viele verschiedene Exception-Typen, je nach Fehlerart.


