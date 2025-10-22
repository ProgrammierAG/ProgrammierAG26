# while-Schleife

Mit while wiederholst du Code, solange eine Bedingung true ist.

Syntax
```
while (Bedingung) { // wiederholter Code }

Beispiel
int i = 0; while (i < 3) { System.out.println("i = " + i); i++; // wichtig: i verändern, sonst Endlosschleife }
```

Typische Fehler

Endlosschleife: Vergisst du, Variablen im Schleifenblock zu ändern, bleibt die Bedingung immer true.

Off-by-one: Überlege, ob du <, <=, >, >= brauchst.
