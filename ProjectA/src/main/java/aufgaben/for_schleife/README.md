# for-Schleife

Die for-Schleife eignet sich gut, wenn du eine Zählschleife brauchst (Start–Ende–Schritt).

Syntax

```
for (Initialisierung; Bedingung; Aktualisierung) {
// wiederholter Code
}
```

Beispiel:
```
for (int k = 1; k <= 5; k++) {
System.out.println("k = " + k);
}
```

Typische Fehler

Variable außerhalb der Schleife nicht sichtbar, wenn du int k = ... direkt im Kopf deklarierst.

Falsche Bedingung (<= vs. <) führt zu einem Durchlauf mehr/weniger als gedacht.
