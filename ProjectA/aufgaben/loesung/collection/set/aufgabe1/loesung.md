## Lösung

```java
import java.util.HashSet;
import java.util.Set;

public class FarbenSet {
    public static void main(String[] args) {
        Set<String> farben = new HashSet<>();
        farben.add("rot");
        farben.add("blau");
        farben.add("grün");
        farben.add("rot"); // Doppeltes Element, wird ignoriert
        System.out.println(farben);
    }
}
```
