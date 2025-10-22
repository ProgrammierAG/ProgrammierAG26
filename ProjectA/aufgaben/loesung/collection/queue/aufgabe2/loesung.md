## Lösung

```java
import java.util.LinkedList;
import java.util.Queue;

public class StringQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Eins");
        queue.add("Zwei");
        queue.add("Drei");
        String erstesElement = queue.peek();
        System.out.println(erstesElement);
    }
}
```
