# Git-Workflow für das Projekt

Diese Anleitung beschreibt den empfohlenen Arbeitsablauf für die Arbeit mit Git während der Programmier-AG. Sie richtet sich an alle Schüler*innen und soll ihnen bei der Arbeit mit Git helfen.

---

## Git Installation und Konfiguration:

- Git beim Öffnen von IntelliJ IDEA installieren
    1. Wenn IntelliJ IDEA geöffnet ist, kann man auf `Download and Install Git` klicken.
    2. Alternativ kann Git manuell von der offiziellen [Git-Website](https://git-scm.com/downloads). Lade die Datei `Git for Windows/x64 Setup` herunter. Die heruntergeladene Datei kann anschließend installiert werden.
    3. IntelliJ IDEA schließen, nachdem Git installiert ist und es anschließend erneut starten.
       
---

## Clone Repository

Nach der Installation und Konfiguration von Git kann das Repository „geklont” werden.

- Das kann direkt in IntelliJ IDEA beim Drücken der Taste `Clone Repository` erledigt werden
- Alternativ kann im Terminal von IntelliJ IDEA der folgende Befehl eingegeben werden:
    
    ```bash
    git clone [HTTPS-Adresse des Repositorys]
    ```
    ***(Die HTTPS-Adresse kann im [GitHub-Repository](https://github.com/ProgrammierAG/ProgrammierAG26) unter `Code` gefunden und kopiert werden)***

- Damit die Änderungen später an das Remote-Repository gesendet werden können, muss im Git die E-Mail-Adresse konfiguriert werden, die für das Repository verwendet wird. Dies erfolgt, indem man das Terminal in IntelliJ IDEA öffnet und den folgenden Befehl eingibt:
    
    ```bash
    git config --global user.email [E-Mail-Adresse]
    ```


---

## Branch erstellen/auswählen

### 1. Falls es im Remote-Repository keinen branch mit deinem Namen gibt, dann sollte ein branch erstellt werden, an dem du arbeiten wirst:

- Gib im IntelliJ IDEA-Terminal den folgenden Befehl ein:

    ```bash
    git checkout -b [branch Name]
    ```
    ***Der branch Name sollte wie folgt aussehen (ein Beispiel für jemanden, der Max Mustermann heißt):***
    
    ```bash
    Teilnehmende/max-mus
    ```
    (Nach dem „Teilnehmende/” kommen die ersten drei Buchstaben des Vornamens`klein geschrieben`, dann ein Bindestrich(-) und anschließend die ersten drei Buchstaben des Nachnamens`klein geschrieben`)

### 2. Falls es im Remote-Repository bereits einen branch mit deinem Namen gibt:

- Fetch die branches aus dem Repository. In IntelliJ IDEA gib im Terminal den folgenden Befehl ein:

    ```bash
    git fetch origin
    ```

- Wähle deine branch mit dem folgenden Befehl aus:

    ```bash
    git checkout [branch Name]
    ```

    --- 

## Änderungen im Repository pushen

Wenn du mit deinen Änderungen fertig bist und sie in das Remote-Repository pushen möchtest, dann:

### 1. Falls du den branch gerade erstellt hast und er noch nicht im Remote-Repository vorhanden ist:
1. Füge deine Änderungen mit dem folgenden Befehl im IntelliJ IDEA Terminal auf „Staged“ hinzu

    ```bash
    git add .
    ```

2. Speichere die zuvor hinzugefügten Änderungen mit dem folgenden Befehl im IntelliJ-IDEA-Terminal dauerhaft im lokalen Repository

    ```bash
    git commit -m "task: [kurze Beschreibung deiner Änderungen]"
    ```

3. Übertrage deine lokalen Commits (also deine gespeicherten Änderungen) mit dem folgenden Befehl im IntelliJ-IDEA-Terminal in das Remote-Repository

    ```bash
    git push -u origin [deine branch Name]
    ```

4. Es wird ein Fenster zur Authentifizierung mit GitHub geöffnet. Im Fenster einfach durchklicken und die Authentifizierung durchführen.

### 2. Falls der branch bereits im Remote-Repository vorhanden war:
1. Füge deine Änderungen mit dem folgenden Befehl im IntelliJ IDEA Terminal auf „Staged“ hinzu

    ```bash
    git add .
    ```

2. Speichere die zuvor hinzugefügten Änderungen mit dem folgenden Befehl im IntelliJ-IDEA-Terminal dauerhaft im lokalen Repository

    ```bash
    git commit -m "task: [kurze Beschreibung deiner Änderungen]"
    ```

3. Übertrage deine lokalen Commits (also deine gespeicherten Änderungen) mit dem folgenden Befehl im IntelliJ-IDEA-Terminal in das Remote-Repository

    ```bash
    git push origin [deine branch Name]
    ```

4. Es wird ein Fenster zur Authentifizierung mit GitHub geöffnet. Im Fenster einfach durchklicken und die Authentifizierung durchführen.
