# IT-Arbeitsgemeinschaft – PMHG

Willkommen im Repository der **IT-Arbeitsgemeinschaft** des Philipp-Matthäus-Hahn-Gymnasiums (PMHG).
Dieses Repository enthält alle Materialien, Übungen und Ressourcen, die im Rahmen des Programmierungskurses verwendet werden.

---

## Kursbeschreibung

Der Kurs richtet sich an Einsteiger und vermittelt grundlegende Kenntnisse in der Softwareentwicklung.
Ziel ist es, ein erstes Verständnis für Programmierlogik, Versionsverwaltung und praktische Anwendungen zu entwickeln.

---

## Lerninhalte

Folgende Themen werden im Kurs behandelt:

-   **GitHub Einführung**
    Grundlagen der Plattform, Repositories, Commits und Zusammenarbeit

-   **Git Einführung**
    Lokale Versionskontrolle, Branches, Merge

-   **Grundlegende Git-Befehle**
    Praktische Übungen mit `git init`, `git add`, `git commit`, `git push` u.v.m.

-   **Logisches Denken üben mit Karel**
    Spielerisches Training des logischen Denkens durch visuelle Programmierung mit dem Karel-Roboter – Schritt für Schritt Aufgaben lösen und Abläufe verstehen

---

# if / else / else if

## Mit if/else triffst du Entscheidungen basierend auf Bedingungen (Booleans: true/false).

Syntax

if (Bedingung) {
// Code, wenn Bedingung true ist
} else if (andereBedingung) {
// Code, wenn erste Bedingung false, aber diese true ist
} else {
// Code, wenn alle obigen Bedingungen false sind
}

# Typische Fehler

## Einzelnes = statt == in Vergleichen (in if braucht man einen Vergleich, nicht eine Zuweisung).

## Klammern vergessen: In Java sind {} bei mehrzeiligem Block Pflicht (und auch bei einzeiligem Code empfehlenswert).

# Übung 1 – Noten-Text

## Aufgabe: Schreibe ein Programm, das eine ganze Zahl punkte (0–100) in eine Schulnote umwandelt und als Text ausgibt:

>= 90: "Note 1"

>= 80: "Note 2"

>= 70: "Note 3"

>= 60: "Note 4"

sonst: "Note 5"

Hinweise: Teste mehrere Werte (z. B. 95, 83, 72, 61, 12).

---

# while-Schleife

## Mit while wiederholst du Code, solange eine Bedingung true ist.

Syntax

while (Bedingung) {
// wiederholter Code
}

## Beispiel

int i = 0;
while (i < 3) {
System.out.println("i = " + i);
i++; // wichtig: i verändern, sonst Endlosschleife
}

## Typische Fehler

# Endlosschleife: Vergisst du, Variablen im Schleifenblock zu ändern, bleibt die Bedingung immer true.

Off-by-one: Überlege, ob du <, <=, >, >= brauchst.

# Übung 1 - Countdown

## Aufgabe: Erstelle einen Countdown von 5 bis 0 mit while und gib danach "Start!" aus.

public class Countdown {
public static void main(String[] args) {
int n = 5;
while (n >= 0) {
System.out.println(n);
n--;
}
System.out.println("Start!");
}
}

---

# for-Schleife

## Die for-Schleife eignet sich gut, wenn du eine Zählschleife brauchst (Start–Ende–Schritt).

Syntax

for (Initialisierung; Bedingung; Aktualisierung) {
// wiederholter Code
}

## Beispiel:

for (int k = 1; k <= 5; k++) {
System.out.println("k = " + k);
}

## Typische Fehler

# Variable außerhalb der Schleife nicht sichtbar, wenn du int k = ... direkt im Kopf deklarierst.

# Falsche Bedingung (<= vs. <) führt zu einem Durchlauf mehr/weniger als gedacht.

# Übung 1:
## Aufgabe: Lies eine Zahl n (oder setze sie fest) und berechne mit einer for-Schleife die Summe von 1 bis n. Gib das Ergebnis aus.

public class SummeBisN {
public static void main(String[] args) {
int n = 10; // ändere zum Testen
int summe = 0;
for (int i = 1; i <= n; i++) {
summe += i;
}
System.out.println("Summe 1.." + n + " = " + summe);
}
}

---

# for-each (erweiterte for-Schleife)

## Die erweiterte for-Schleife iteriert bequem über Arrays oder Collections, ohne Indexverwaltung.

Syntax

for (ElementTyp elementName : sammlung) {
// benutze elementName
}

# Beispiel:

String[] namen = {"Ava", "Ben", "Cem"};
for (String name : namen) {
System.out.println("Hallo, " + name);
}

## Typische Hinweise

for-each eignet sich nicht zum Verändern von Elementen per Index. Wenn du den Index brauchst oder Elemente ersetzen willst, nimm eine normale for-Schleife.

Für Listen/Collections brauchst du die passenden Importe/Typen (z. B. java.util.List).

# Übung 1 - Längstes Wort

## Aufgabe: Gegeben ist ein String-Array worte. Finde mit for-each das längste Wort und gib es aus.

public class LaengstesWort {
public static void main(String[] args) {
String[] worte = {"Katze", "Hochschule", "AG", "Programmierwettbewerb"};
String laengstes = "";
for (String w : worte) {
if (w.length() > laengstes.length()) {
laengstes = w;
}
}
System.out.println("Längstes Wort: " + laengstes);
}
}

---


## Break und Continue

break: beende die Schleife sofort.
continue: springe zum nächsten Durchlauf, überspringe den Rest des aktuellen Blocks.

for (int i = 1; i <= 10; i++) {
if (i % 2 == 0) continue; // überspringe gerade Zahlen
if (i > 7) break; // beende die Schleife, wenn i > 7
System.out.println(i);
}
