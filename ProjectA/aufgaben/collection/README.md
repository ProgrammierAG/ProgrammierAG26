# collection

# Arrays

Ein **Array** ist eine Datenstruktur, die viele Werte **vom gleichen Datentyp** speichern kann – zum Beispiel mehrere Zahlen oder Wörter.
Du kannst dir ein Array wie eine Reihe von **Boxen mit Nummern** vorstellen, in denen Werte gespeichert werden.

---

## Beispiel
```
int[] zahlen = {1, 2, 3, 4, 5};
```

Hier speichern wir fünf ganze Zahlen in einem Array namens `zahlen`.

Jedes Element hat eine **Position (Index)**:

- `zahlen[0]` → 1
- `zahlen[1]` → 2
- `zahlen[4]` → 5

> Achtung: Der Index beginnt bei 0!

---

## Warum Arrays nützlich sind

- Man kann viele Daten **in einer einzigen Variable** speichern.
- Gut geeignet, wenn man **gleiche Datentypen** speichern möchte (z. B. Punkte, Noten oder Namen).


---

## Nachteil

- Die Größe des Arrays ist **festgelegt** und kann später nicht geändert werden.
- Nur **ein Datentyp** pro Array (zum Beispiel nur `int` oder nur `String`).

---

## Schleifenbeispiel

```java
for (int i = 0; i < zahlen.length; i++) {
    System.out.println("Element " + i + ": " + zahlen[i]);
}
```
Das Programm geht alle Elemente durch und druckt sie aus.

---

## Merksatz

Ein **Array** ist wie ein Regal **mit fester Länge**, in dem man viele ähnliche Dinge nebeneinander aufbewahren kann.




# Listen

Eine **Liste** (englisch *List*) ist eine **weiterentwickelte Form von Arrays**.
Im Gegensatz zu einem Array kann eine Liste **dynamisch wachsen oder schrumpfen** – das heißt, du kannst Elemente hinzufügen oder entfernen, ohne vorher die Größe festzulegen.

---

## Was ist eine Liste?

Eine Liste speichert ebenfalls mehrere Werte **vom gleichen Datentyp**, bietet aber zusätzlich viele praktische **Methoden**, um mit den Werten zu arbeiten.
In Java verwendet man dazu meist die Klasse **ArrayList** aus dem Paket `java.util`.

---

## Beispiel
```java
import java.util.ArrayList;

public class Beispiel {
    public static void main(String[] args) {
        ArrayList<String> namen = new ArrayList<>();
        namen.add("Anna");
        namen.add("Ben");
        namen.add("Lukas");

        System.out.println(namen.get(0)); // Gibt "Anna" aus
        System.out.println("Größe: " + namen.size());

        namen.remove("Ben"); // Entfernt ein Element

        System.out.println(namen); // Ausgabe: [Anna, Lukas]
    }
}

```

---

## Vorteile von Listen

- **Dynamisch:** Die Größe kann sich automatisch ändern.
- **Einfach:** Viele eingebaute Methoden wie `add`, `remove`, `get`, `size`.
- **Praktisch:** Man kann mit Schleifen sehr einfach durchlaufen.
```java
for (String name : namen) {
    System.out.println(name);
}
```

---
a
## Nachteile

- Etwas **langsamer** als ein einfaches Array, weil intern mehr verwaltet wird.
- Nur **ein Datentyp** pro Liste (z. B. `List<Integer>` oder `List<String>`).

---

## Merksatz

Eine **Liste** ist wie ein **flexibles Regal**, das automatisch größer oder kleiner wird, wenn du mehr oder weniger Dinge hineinlegst.

---



# Set

Ein **Set** ist eine besondere Sammlung von Daten, bei der **keine doppelten Werte** erlaubt sind.
Das bedeutet: Jedes Element ist einzigartig, und wenn du versuchst, ein Element zweimal hinzuzufügen, wird es nur einmal gespeichert.

---

## Was ist ein Set?

Sets speichern mehrere Werte, aber ohne Reihenfolge und ohne Duplikate.
In Java wird oft die Klasse **HashSet** verwendet.

---

## Beispiel

```java
import java.util.HashSet;

public class Beispiel {
public static void main(String[] args) {
    HashSet<String> farben = new HashSet<>();
    farben.add("rot");
    farben.add("blau");
    farben.add("grün");
    farben.add("rot"); // wird ignoriert, weil "rot" schon drin ist

        System.out.println(farben); // Ausgabe: [rot, blau, grün]
    }
}
```

---

## Vorteile von Sets

- Es gibt **keine mehrfachen Werte**.
- Gut für Dinge, bei denen Duplikate keinen Sinn machen (z. B. Sammeln von einmaligen IDs).
- Schnell bei **Überprüfen, ob ein Wert enthalten ist** (`contains`).

---

## Nachteile

- **Keine feste Reihenfolge** – man kann nicht mit Index darauf zugreifen.
- Nur **ein Datentyp** pro Set.

---

## Merksatz

Ein **Set** ist wie ein Sammelalbum, in das du nur jedes Sticker einmal einkleben darfst – keine doppelten Sticker!


# Map

Eine **Map** ist eine Sammlung von **Schlüssel-Wert-Paaren**.
Jedes Element in einer Map besteht aus einem Schlüssel (Key) und einem dazugehörigen Wert (Value).

---

## Was ist eine Map?

Maps speichern Daten in Paaren: Du suchst einen Wert über einen eindeutigen Schlüssel.
In Java verwendet man oft die Klasse **HashMap**.

---

## Beispiel

```java
import java.util.HashMap;

public class Beispiel {
    public static void main(String[] args) {
        HashMap<String, Integer> alter = new HashMap<>();
        alter.put("Anna", 16);
        alter.put("Ben", 17);
        alter.put("Lukas", 15);

        System.out.println(alter.get("Ben")); // Ausgabe: 17
    }
}

```

---

## Vorteile von Maps

- Daten sind gut organisiert durch **eindeutige Schlüssel**.
- Sehr schnell, wenn man Werte über den Schlüssel sucht (`get`).
- Einfach Werte hinzufügen, ändern oder entfernen.

---

## Nachteile

- Schlüssel müssen **einzigartig** sein.
- Nur eine Kombination aus **Schlüssel- und Werttyp** pro Map.

---

## Merksatz

Eine **Map** ist wie ein Wörterbuch: Du schlägst ein Wort (Schlüssel) nach und findest die Bedeutung (Wert).



# Stack

Ein **Stack** (auf Deutsch Stapel) ist eine Datenstruktur, bei der das **letzte Element, das hineinkommt, auch als erstes wieder herauskommt**.
Das nennt man das **LIFO-Prinzip** (Last In, First Out).

---

## Was ist ein Stack?

Man kann sich einen Stack wie einen Stapel Teller vorstellen: Du legst immer einen neuen Teller oben drauf und nimmst immer den obersten Teller wieder runter.

---

## Beispiel

```java
import java.util.Stack;

public class Beispiel {
    public static void main(String[] args) {
        Stack<String> stapel = new Stack<>();
        stapel.push("Erstes");
        stapel.push("Zweites");
        stapel.push("Drittes");

        System.out.println(stapel.pop()); // Ausgabe: "Drittes"
        System.out.println(stapel.peek()); // Ausgabe: "Zweites" (oberstes Element anschauen ohne zu entfernen)
    }
}
```

---

## Vorteile von Stacks

- Einfaches Speichern und Abrufen von Daten nach dem LIFO-Prinzip.
- Oft genutzt bei Undo-Funktionen, bei der Programmausführung (Methodenaufrufe) oder in Algorithmen.

---

## Nachteile

- Nur das **oberste Element** ist direkt zugreifbar.
- Nicht geeignet, wenn man auf alle Elemente gleichzeitig zugreifen will.

---

## Merksatz

Ein **Stack** ist wie ein Tellerstapel: Wenn du einen Teller oben drauflegst, musst du ihn zuerst wieder runternehmen.



# Queue

Eine **Queue** (auf Deutsch Warteschlange) ist eine Datenstruktur, bei der das **erste Element, das hineinkommt, auch als erstes wieder herauskommt**.
Das nennt man das **FIFO-Prinzip** (First In, First Out).

---

## Was ist eine Queue?

Man kann sich eine Queue wie eine Schlange an der Kasse vorstellen: Der erste, der kommt, ist auch der erste, der bedient wird.

---

## Beispiel
```java
import java.util.LinkedList;
import java.util.Queue;

public class Beispiel {
    public static void main(String[] args) {
        Queue<String> warteschlange = new LinkedList<>();
        warteschlange.add("Erstes");
        warteschlange.add("Zweites");
        warteschlange.add("Drittes");

        System.out.println(warteschlange.poll()); // Ausgabe: "Erstes"
    }
}
```

---

## Vorteile von Queues

- Einfaches Speichern und Abrufen von Daten nach dem FIFO-Prinzip.
- Sehr nützlich für Aufgaben wie Druckaufträge, Warteschlangen im Betriebssystem oder bei Netzwerken.

---

## Nachteile

- Nur das **erste Element** ist direkt zugreifbar.
- Nicht geeignet für schnellen Zugriff auf Elemente in der Mitte.

---

## Merksatz

Eine **Queue** ist wie eine Schlange an der Kasse: Wer zuerst kommt, wird zuerst bedient.



# Tree

Ein **Tree** (auf Deutsch Baum) ist eine hierarchische Datenstruktur, bei der Daten in **Knoten** (Nodes) organisiert sind.
Jeder Knoten kann mehrere untergeordnete Knoten (Kinder) haben, aber nur einen übergeordneten Knoten (Elternteil), außer der **Wurzel**, die keinen Elternknoten hat.

---

## Was ist ein Baum?

Man kann sich einen Baum wie einen Familienstammbaum vorstellen, bei dem jede Person Eltern und Kinder haben kann.

---

## Beispiel

```java
class Node {
    int wert;
    Node links, rechts;

    public Node(int wert) {
        this.wert = wert;
        links = rechts = null;
    }
}
public class Baum {
    Node wurzel;

    public Baum() {
        wurzel = null;
    }

    void einfuegen(int wert) {
        wurzel = einfuegenRekursiv(wurzel, wert);
    }

    Node einfuegenRekursiv(Node wurzel, int wert) {
        if (wurzel == null) {
            wurzel = new Node(wert);
            return wurzel;
        }

        if (wert < wurzel.wert) {
            wurzel.links = einfuegenRekursiv(wurzel.links, wert);
        } else if (wert > wurzel.wert) {
            wurzel.rechts = einfuegenRekursiv(wurzel.rechts, wert);
        }

        return wurzel;
    }
}

```

---

## Vorteile von Bäumen

- Gut geeignet für **schnelle Suche und Sortierung**.
- Organisieren Daten in einer **hierarchischen Struktur**.
- Werden oft für Datenbanken, Dateisysteme und KIs verwendet.

---

## Nachteile

- Können komplex sein zu verstehen und zu implementieren.
- Nicht so einfach wie Listen oder Arrays.

---

## Merksatz

Ein **Baum** ist wie ein Familienstammbaum, bei dem jeder Knoten Kinder haben kann – das macht die Struktur übersichtlich.


# Linked List

Eine **Linked List** (verkettete Liste) ist eine Datenstruktur, bei der jedes Element (Knoten) eine Referenz auf das **nächste Element** hat.
Das bedeutet, die Elemente sind nicht zusammenhängend im Speicher, sondern über Verweise verbunden.

---

## Was ist eine Linked List?

Man kann sich eine Linked List wie eine Kette von Perlen vorstellen. Jede Perle zeigt zur nächsten Perle.

---

## Beispiel
```java
class Node {
    int daten;
    Node naechster;
    public Node(int daten) {
        this.daten = daten;
        this.naechster = null;
    }
}

public class LinkedList {
    Node kopf;

    public void einfuegen(int daten) {
        Node neu = new Node(daten);
        neu.naechster = kopf;
        kopf = neu;
    }

    public void ausgeben() {
        Node aktuell = kopf;
        while (aktuell != null) {
            System.out.println(aktuell.daten);
            aktuell = aktuell.naechster;
        }
    }
}
```

---

## Vorteile von Linked Lists

- Einfaches **Einfügen und Entfernen** von Elementen, besonders am Anfang oder Ende.
- Die Größe der Liste kann dynamisch wachsen.

---

## Nachteile

- Zugriff auf ein bestimmtes Element ist langsamer als bei Arrays – man muss von vorne durchgehen.
- Benötigt mehr Speicher, weil jeder Knoten einen Verweis auf das nächste Element speichert.

---

## Merksatz

Eine **Linked List** ist wie eine Perlenkette, bei der jede Perle zur nächsten zeigt.


