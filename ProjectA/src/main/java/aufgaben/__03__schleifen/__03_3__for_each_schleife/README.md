# for-each (erweiterte for-Schleife)

Die erweiterte for-Schleife iteriert bequem über Arrays oder Collections, ohne Indexverwaltung.

Syntax

```
for (ElementTyp elementName : sammlung) {
// benutze elementName
}
```

Beispiel:

```
String[] namen = {"Ava", "Ben", "Cem"};
for (String name : namen) {
System.out.println("Hallo, " + name);
}
```
Hinweise

for-each eignet sich nicht zum Verändern von Elementen per Index. Wenn du den Index brauchst oder Elemente ersetzen willst, nimm eine normale for-Schleife.

Für Listen/Collections brauchst du die passenden Importe/Typen (z.B. java.util.List).

---

# Break und Continue

- break: beende die Schleife sofort.

- continue: springe zum nächsten Durchlauf, überspringe den Rest des aktuellen Blocks.
Beispiel:

```
for (int i = 1; i <= 10; i++) {
if (i % 2 == 0) continue; // überspringe gerade Zahlen
if (i > 7) break; // beende die Schleife, wenn i > 7
System.out.println(i);
}
```
