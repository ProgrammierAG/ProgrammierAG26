## Datentypen

| Datentyp  | Wertebereich                                             | Beschreibung                                                   | Beispielwert                  |
|-----------|----------------------------------------------------------|----------------------------------------------------------------|-------------------------------|
| `boolean` | `true` / `false`                                         | Wahrheitswert, speichert nur zwei Zustände                     | `true`, `false`               |
| `char`    | 0 bis 65.535 (Unicode)                                   | Einzelnes Unicode-Zeichen, intern als Zahl gespeichert         | `'A'`, `'1'`                  |
| `byte`    | -128 bis 127                                             | Sehr kleiner Ganzzahltyp (z. B. für Speicheroptimierung)       | `100`, `-50`                  |
| `short`   | -32.768 bis 32.767                                       | Kleiner Ganzzahltyp                                            | `32000`, `-1500`              |
| `int`     | -2.147.483.648 bis 2.147.483.647                         | Standard-Ganzzahltyp                                           | `42`, `-1000000`              |
| `long`    | -9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807 | Sehr großer Ganzzahltyp                                        | `100000000000L`, `-5000L`     |
| `float`   | ca. ±1.4×10⁻⁴⁵ bis ±3.4×10³⁸ (7 Dezimalstellen genau)    | Gleitkommazahl mit einfacher Genauigkeit                       | `3.14f`, `-0.001f`            |
| `double`  | ca. ±4.9×10⁻³²⁴ bis ±1.8×10³⁰⁸ (15 Dezimalstellen genau) | Gleitkommazahl mit doppelter Genauigkeit                       | `3.14159265358979`, `-1.23e4` |
| `string`  | abhängig von Länge und Inhalt                            | Zeichenkette, speichert Text, besteht intern aus `char`-Werten | `"Hallo"`, `"12345"`          |

## Deklaration

Deklaration bedeutet, eine Variable mit einem bestimmten Typ zu **definieren** und zu benennen aber noch **keinen Wert
zuzuweisen**. Java-Variablennamen müssen mit einem Buchstaben, Unterstrich oder Dollarzeichen beginnen und können Buchstaben, Zahlen, Unterstriche und Dollarzeichen enthalten..

### Beispiel:

```java
public static void main(String[] args) {
    int $zahl;
    String _name;
    float ko$mma_zahl22;
    char buchst_abe;
}
```

## Initialisierung

Initialisierung bedeutet, eine Variable ihre ersten wert zuzuweisen.

### Beispiel:

```java

public static void main(String[] args) {
    int alter;
    alter = 25;

    String stadt = "Berlin";
    boolean istAngemeldet = true;
    char symbol = '#';
}

```

---

# Operatoren

Vergleich & Logische operatoren geben immer einen boolean wert den man wieder zur einer varriabel zuweisen kann.
Arithmetische Operatoren sind da um mathematische rechnung zu machen.
Inkrement & Dekrement operatoren sind ein schneller un einfacher weg um +1 oder -1 zu rechnen.

### Beispiel:

```java

public static void main(String[] args) {
    int two = -99;
    boolean isSmallerThenOne = 1 > two;

    System.out.println(isSmallerThenOne);
}

```

### Console:

```text
true
```

## Vergleichsoperatoren

| Operator | Bedeutung           | Beispiel | Ergebnis |
|----------|---------------------|----------|----------|
| `==`     | gleich              | `5 == 5` | `true`   |
|          |                     | `5 == 4` | `false`  |
| `!=`     | ungleich            | `3 != 4` | `true`   |
|          |                     | `5 != 5` | `false`  |
| `>`      | größer als          | `7 > 3`  | `true`   |
|          |                     | `3 > 7`  | `false`  |
| `<`      | kleiner als         | `2 < 1`  | `false`  |
|          |                     | `1 < 2`  | `true`   |
| `>=`     | größer oder gleich  | `4 >= 4` | `true`   |
|          |                     | `3 >= 4` | `false`  |
| `<=`     | kleiner oder gleich | `5 <= 6` | `true`   |
|          |                     | `7 <= 6` | `false`  |

## Logische Operatoren

| Operator | Name            | Beschreibung                                 | Beispiel                     |
|----------|-----------------|----------------------------------------------|------------------------------|
| `&&`     | logisches UND   | true, wenn **beide Bedingungen** true sind   | `true && true` → `true`      |
|          |                 |                                              | `true && false` → `false`    |
|          |                 |                                              | `false && true` → `false`    |
|          |                 |                                              | `false && false` → `false`   |
| `\|\|`   | logisches ODER  | true, wenn **mind. eine Bedingung** true ist | `true \|\| true` → `true`    |
|          |                 |                                              | `true \|\| false` → `true`   |
|          |                 |                                              | `false \|\| true` → `true`   |
|          |                 |                                              | `false \|\| false` → `false` |
| `!`      | logisches NICHT | kehrt den Wahrheitswert um                   | `!true` → `false`            |
|          |                 |                                              | `!false` → `true`            |



## Arithmetische Operatoren

| Operator | Name              | Beschreibung                                | Beispiel          | Ergebnis         |
|----------|-------------------|---------------------------------------------|-------------------|------------------|
| `+`      | Addition          | Zwei Werte werden addiert                   | `5 + 3`           | `8`              |
| `-`      | Subtraktion       | Ein Wert wird von einem anderen abgezogen   | `10 - 4`          | `6`              |
| `*`      | Multiplikation    | Zwei Werte werden multipliziert             | `7 * 2`           | `14`             |
| `/`      | Division          | Ein Wert wird durch einen anderen geteilt   | `8 / 2`           | `4`              |
| `%`      | Modulo (Rest)     | Gibt den Rest einer Division zurück         | `9 % 4`           | `1`              |


## Inkrement-/Dekrementoperatoren
| Operator | Name              | Beschreibung                                | Beispiel          | Ergebnis         |
|----------|-------------------|---------------------------------------------|-------------------|------------------|
| `++x`    | Präfix-Inkrement  | Erhöht `x` um 1 **vor der Verwendung**      | `x = 3; y = ++x;` | `y = 4`          |
| `x++`    | Postfix-Inkrement | Erhöht `x` um 1 **nach der Verwendung**     | `x = 3; y = x++;` | `y = 3`, `x = 4` |
| `--x`    | Präfix-Dekrement  | Verringert `x` um 1 **vor der Verwendung**  | `x = 3; y = --x;` | `y = 2`          |
| `x--`    | Postfix-Dekrement | Verringert `x` um 1 **nach der Verwendung** | `x = 3; y = x--;` | `y = 3`, `x = 2` |

---

# Ein- und Ausgabe in der Konsole

Um text oder varriabel information in die console auzugeben kannst du die methode `System.out.print("Dein Text")` benutzen. Die IDE ermöglich dir wenn du innerhalb einer methode ´sout´ eingibst daraus ein ´System.out.println()´ zu generieren.
Um konsolen eingaben vom benutzer lesen zu können brauchst du einen Scanner der kann den den text lesen und direkt in den passenden datentyp umwandeln siehe dafür die möglichen methoden an die ´Scanner´ besitzt.

##  Ausgabe

### Beispiel:

```java

public static void main(String[] args) {
    int planeten = 8;
    System.out.println();
// Ausgabe ohne Zeilenumbruch
    System.out.print("Hallo, ");
    System.out.print("Welt!");

// Ausgabe mit Zeilenumbruch
    System.out.println("Hallo, Welt!");

// Ausgabe mit Variablen
    System.out.println("Es gibt " + planeten + " Planeten in unserem Sonnensystem!");
}
```

### Konsole:

```text
Hallo,Welt!
Hallo,Welt!
Es gibt 8 Planeten in unserem Sonnensystem!
```

##  Eingabe

### Beispiel:

```java
import java.util.Scanner;

public static void main(String[] args) {
    // Scanner-Objekt erstellen, um Benutzereingaben zu lesen
    Scanner scanner = new Scanner(System.in);

    // Liest die nächste ganze Zahl vom Datentyp (Int) aus Konsole und speichert sie in Variable alter
    int alter = scanner.nextInt();

    // Liest den nächste zeile vom Datentyp (String) aus der Konsole und speicher sie in Variable text
    String text = scanner.nextLine();

    // Scanner bei Programmende deaktivieren, um Ressourcen freizugeben
    scanner.close();
}

```

---

# Datentypen Umwandlung

## Automatische Umwandlung

Bei der **automatischen Umwandlung** wird ein Datentyp in einen anderen größeren Datentyp umgewandelt, ohne dass der
Entwickler dies explizit angeben muss. Diese Umwandlung geschieht automatisch, wenn der Wert in den Zieltyp passt.

### Beispiel:

```java
public static void main(String[] args) {
    int zahl = 10;
    double ergebnis = zahl; // int wird automatisch in double umgewandelt
}
```

## Manuelle Umwandlung

Bei der manuellen Umwandlung muss der Entwickler explizit angeben, dass ein Datentyp in einen kleineren Datentyp
umgewandelt werden soll. Diese Umwandlung kann zu einem Verlust von Informationen führen, insbesondere bei
Gleitkommazahlen, die in Ganzzahlen umgewandelt werden.

### Beispiel:

```java
public static void main(String[] args) {
    double zahl = 10.99;
    int ergebnis = (int) zahl; // double wird manuell in int umgewandelt
    System.out.println(ergebnis); // Ausgabe: 10
}
```

In diesem Beispiel wird der Dezimalteil der Zahl 10.99 abgeschnitten, und die Zahl wird als 10 gespeichert. Es findet
ein Verlust der Nachkommastellen statt.

## Umwandlung von String zu primitiven Datentypen

Ein häufiger Fall ist die Umwandlung von Strings in primitive Datentypen, z. B. bei Benutzereingaben. Dies kann durch
die Verwendung von Wrapper-Klassen erfolgen, die die parse-Methoden bieten.

### Beispiel:

```java
public static void main(String[] args) {
    String zahlString = "123";
    int zahl = Integer.parseInt(zahlString);  // Umwandlung von String zu int

    String doubleString = "3.14";
    double pi = Double.parseDouble(doubleString);  // Umwandlung von String zu double
}
```

## Umwandlung von primitiven Datentypen zu String

Um einen primitiven Datentyp in einen String zu konvertieren, kannst du entweder die String.valueOf()-Methode oder den
+Operator-Überladung verwenden.### Beispiel:

### Beispiel:

```java
  public static void main(String[] args) {
    int zahl = 42;
    String zahlString = String.valueOf(zahl);  // Eine Möglichkeit primitive datentyp zu String zu konvertieren
    // -> "42"

    double pi = 3.14;
    String piString = pi + "";  // Eine Möglichkeit primitive datentyp zu String zu konvertieren
    // -> "3.14"

    double tage = 7;
    String tageString = "" + tage;  // Eine Möglichkeit primitive datentyp zu String zu konvertieren
    // -> "7"
}
```

## ASCII-Tabelle

Da char intern als Zahl gespeichert wird, kann man zwischen char und int umwandeln, das bedeutet das jeder char eine zahl entrpicht wie als beispiel der buchstabe A entrpicht der Zahl 65:

[ASCII-Tabelle auf ascii-code.com](https://www.ascii-code.com/)

### Beispiel:

```java
public static void main(String[] args) {
    char character = 'A';
    int decimalAsciiCode = character;

    System.out.println(character);
    System.out.println(decimalAsciiCode);
}
```

### Console:

```text
65
A
```

---
