## Lösung

```java
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Eins");
        stack.push("Zwei");
        stack.push("Drei");
        String oberstesElement = stack.peek();
        System.out.println(oberstesElement);
    }
}
```
