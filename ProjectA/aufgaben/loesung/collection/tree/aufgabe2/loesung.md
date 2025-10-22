## Lösung

```java
class BaumKnoten {
    int wert;
    BaumKnoten links, rechts;
    public BaumKnoten(int wert) {
        this.wert = wert;
        links = rechts = null;
    }
}

public class BinärerSuchbaum {
    BaumKnoten wurzel;

    void einfuegen(int wert) {
        wurzel = einfuegenRekursiv(wurzel, wert);
    }

    BaumKnoten einfuegenRekursiv(BaumKnoten knoten, int wert) {
        if (knoten == null) {
            return new BaumKnoten(wert);
        }
        if (wert < knoten.wert) {
            knoten.links = einfuegenRekursiv(knoten.links, wert);
        } else if (wert > knoten.wert) {
            knoten.rechts = einfuegenRekursiv(knoten.rechts, wert);
        }
        return knoten;
    }

    boolean suchen(int wert) {
        return suchenRekursiv(wurzel, wert);
    }

    boolean suchenRekursiv(BaumKnoten knoten, int wert) {
        if (knoten == null) {
            return false;
        }
        if (wert == knoten.wert) {
            return true;
        }
        return wert < knoten.wert
            ? suchenRekursiv(knoten.links, wert)
            : suchenRekursiv(knoten.rechts, wert);
    }

    public static void main(String[] args) {
        BinärerSuchbaum baum = new BinärerSuchbaum();
        baum.einfuegen(15);
        baum.einfuegen(10);
        baum.einfuegen(20);
        baum.einfuegen(8);
        baum.einfuegen(12);

        System.out.println(baum.suchen(12));
    }
}

```
