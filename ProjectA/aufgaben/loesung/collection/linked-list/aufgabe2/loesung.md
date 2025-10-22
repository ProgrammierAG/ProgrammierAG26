## Lösung

```java
class Listenknoten {
    int wert;
    Listenknoten naechster;
    public Listenknoten(int wert) {
        this.wert = wert;
        this.naechster = null;
    }
}

public class VerketteteListe {
    Listenknoten kopf;

    void einfuegenAmEnde(int wert) {
        Listenknoten neuerKnoten = new Listenknoten(wert);
        if (kopf == null) {
            kopf = neuerKnoten;
            return;
        }
        Listenknoten aktueller = kopf;
        while (aktueller.naechster != null) {
            aktueller = aktueller.naechster;
        }
        aktueller.naechster = neuerKnoten;
    }

    void ausgeben() {
        Listenknoten aktueller = kopf;
        while (aktueller != null) {
            System.out.println(aktueller.wert);
            aktueller = aktueller.naechster;
        }
    }

    public static void main(String[] args) {
        VerketteteListe liste = new VerketteteListe();
        liste.einfuegenAmEnde(5);
        liste.einfuegenAmEnde(15);
        liste.einfuegenAmEnde(25);

        liste.ausgeben();
    }
}
```
