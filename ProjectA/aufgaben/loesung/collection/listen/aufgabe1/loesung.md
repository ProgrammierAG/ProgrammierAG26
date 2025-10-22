## Lösung

```java
import java.util.ArrayList;
import java.util.List;

public class NamenListe {
    public static void main(String[] args) {
        List<String> namen = new ArrayList<>();
        namen.add("Anna");
        namen.add("Ben");
        namen.add("Lukas");
        for (String name : namen) {
            System.out.println(name);
        }
    }
}
```
