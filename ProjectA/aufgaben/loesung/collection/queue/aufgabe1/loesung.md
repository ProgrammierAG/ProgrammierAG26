## Lösung

```java
import java.util.LinkedList;
import java.util.Queue;

public class StringQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Erstes");
        queue.add("Zweites");
        queue.add("Drittes");
        String erstesElement = queue.poll();
        System.out.println(erstesElement);
    }
}
```
