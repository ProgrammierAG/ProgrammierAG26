### Aufgabenstellung
Schreibe ein Java-Programm, das den Benutzer nach seinem Alter fragt und anschließend abhängig vom Alter eine passende Nachricht ausgibt:

- Wenn die Person **unter 18** ist, soll das Programm ausgeben:
  `"Du bist noch minderjährig."`

- Wenn die Person **genau 18** ist:
  `"Du bist gerade volljährig geworden!"`

- Wenn die Person **über 18** ist:
  `"Du bist volljährig."`

---

### Hinweise
- Verwende `Scanner scanner = new Scanner(System.in);` für die Eingabe.
- Du kannst `int alter = scanner.nextInt();` verwenden, um eine Zahl einzulesen.
- Denke daran, den `Scanner` am Ende mit `scanner.close();` zu schließen.
- Benutze `if`, `else if`, `else`, um die Bedingungen umzusetzen.

---

### Console

```plaintext
Wie alt bist du?
18
Du bist gerade volljährig geworden!
```
