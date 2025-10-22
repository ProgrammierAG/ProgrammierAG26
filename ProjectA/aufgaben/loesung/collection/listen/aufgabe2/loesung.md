## Lösung

```java
public class ArraySumme {
    public static void main(String[] args) {
        int[] zahlen = {3, 5, 7, 4, 6};
        int summe = 0;
        for (int zahl : zahlen) {
            summe += zahl;
        }
        System.out.println("Summe der Elemente: " + summe);
    }
}

```
