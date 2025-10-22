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

    void einfuegenAmAnfang(int wert) {
        Listenknoten neuerKnoten = new Listenknoten(wert);
        neuerKnoten.naechster = kopf;
        kopf = neuerKnoten;
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
        liste.einfuegenAmAnfang(10);
        liste.einfuegenAmAnfang(20);
        liste.einfuegenAmAnfang(30);

        liste.ausgeben();
    }
}

```
