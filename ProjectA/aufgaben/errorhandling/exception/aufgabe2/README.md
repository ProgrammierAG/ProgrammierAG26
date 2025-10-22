#### Aufgabenstellung
Schreibe ein Programm, das versucht, eine Datei namens `daten.txt` zu öffnen und ihren Inhalt zu lesen. Wenn die Datei **nicht existiert**, soll eine `FileNotFoundException` behandelt werden.

1. Verwende `FileReader` und `BufferedReader` zum Lesen der Datei.
2. Lege den Code in einen `try`-Block.
3. Fange die Exception in einem `catch (FileNotFoundException e)`-Block ab.
4. Gib eine Fehlermeldung aus, z. B. `Die Datei wurde nicht gefunden!`

#### Console
```
Fehler: Die Datei wurde nicht gefunden!
```
