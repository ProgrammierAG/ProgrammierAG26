## Lösung

```java
import java.util.HashMap;
import java.util.Map;

public class BuchstabenMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        // Wert von "B" ändern
        map.put("B", 5);

        // Alle Schlüssel-Wert-Paare ausgeben
        for (Map.Entry<String, Integer> eintrag : map.entrySet()) {
            System.out.println(eintrag.getKey() + " = " + eintrag.getValue());
        }
    }
}

```
