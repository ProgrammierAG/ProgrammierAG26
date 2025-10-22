## Lösung

```java
import java.util.HashMap;
import java.util.Map;

public class AltersMap {
    public static void main(String[] args) {
        Map<String, Integer> alter = new HashMap<>();
        alter.put("Anna", 16);
        alter.put("Ben", 17);
        alter.put("Lukas", 15);
        System.out.println(alter.get("Ben"));
    }
}
```
