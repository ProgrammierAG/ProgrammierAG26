## Lösung

```java
import java.util.HashSet;
import java.util.Set;

public class ObstSet {
    public static void main(String[] args) {
        Set<String> obst = new HashSet<>();
        obst.add("Apfel");
        obst.add("Banane");
        obst.add("Orange");
        boolean enthältBanane = obst.contains("Banane");
        System.out.println(enthältBanane);
    }
}
```
