#### Aufgabenstellung

Schreibe ein Programm, das den Namen eines Benutzers einliest. Wenn der Benutzer **nichts eingibt** (also einen leeren String), soll das Programm eine **`IllegalArgumentException`** auslösen.

1. Lies eine Texteingabe mit `Scanner` ein.
2. Prüfe, ob der Text leer ist (`text.isEmpty()`).
3. Wenn ja, wirf eine neue Exception mit `throw new IllegalArgumentException("Name darf nicht leer sein!");`
4. Fange sie mit `try-catch` ab und zeige eine passende Fehlermeldung an.

#### Console:
```
Gib deinen Namen ein:

Fehler: Name darf nicht leer sein!
```
