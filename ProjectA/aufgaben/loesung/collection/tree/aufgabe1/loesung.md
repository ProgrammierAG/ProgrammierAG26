## Lösung

```java
import java.util.LinkedList;
import java.util.Queue;

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
        System.out.println(wert);
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

    public static void main(String[] args) {
        BinärerSuchbaum baum = new BinärerSuchbaum();
        baum.einfuegen(50);
        baum.einfuegen(30);
        baum.einfuegen(70);
        baum.einfuegen(20);
        baum.einfuegen(40);
    }
}
```
