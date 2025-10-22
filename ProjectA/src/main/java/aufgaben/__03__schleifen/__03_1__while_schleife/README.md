# schleifen

## While-Schleife

Eine while Schleife führt einen Anweisungsblock so lange aus, bis die Prüf**bedingung** nicht mehr wahr ist

Eine **Iteration** ist ein einzelner Durchlauf einer Schleife, bei dem der enthaltene Anweisungsblock einmal ausgeführt wird, solange die Bedingung erfüllt ist.

Wie oft wird der Schleifenblock (also eine Iteration) bei dieser Bedingung ausgeführt?

```java
public static void main(String[] args) {
    boolean bedingung = true;
    int zähler = 0;
    int iterationen = 9;

    while (bedingung == true) {
        System.out.println("Wert von zähler: " + zähler);

        if (zähler >= iterationen - 1) {
            bedingung = false;
        } else {
            zähler++;
        }
    }
}
```

### Konsole:
```text
Wert von zähler: 0
Wert von zähler: 1
Wert von zähler: 2
Wert von zähler: 3
Wert von zähler: 4
Wert von zähler: 5
Wert von zähler: 6
Wert von zähler: 7
Wert von zähler: 8
```

## Do-While-Schleife

Eine **do-while** Schleife führt einen Anweisungsblock mindestens einmal aus, bevor die Prüfbedingung überprüft wird. Sie prüft die Bedingung nach der ersten Ausführung des Schleifenblocks, wodurch der Block immer mindestens einmal ausgeführt wird, auch wenn die Bedingung zu Beginn **falsch** ist.

Wie oft wird der Schleifenblock (also eine Iteration) bei dieser Bedingung ausgeführt?

### Beispiel:
```java
public static void main(String[] args) {
    int zähler = 10;  // Der Zähler beginnt bei 10
    int iterationen = 5;  // Die Schleife sollte 5 Mal durchlaufen

    do {
        System.out.println("Wert von zähler: " + zähler);
        zähler++;
    } while (zähler < iterationen);  // Die Bedingung ist von Anfang an falsch
}
```

#### Konsole:
```text
Wert von zähler: 10
```

### Unterschiede zur While-Schleife:
- Bei einer **while**-Schleife würde der Schleifenblock nicht ausgeführt werden, wenn die Bedingung von Anfang an falsch ist.
- Bei einer **do-while**-Schleife wird der Schleifenblock **mindestens einmal** ausgeführt, selbst wenn die Bedingung nach dem ersten Durchlauf falsch ist.
---
