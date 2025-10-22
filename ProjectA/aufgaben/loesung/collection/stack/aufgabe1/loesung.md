## Lösung

```java
import java.util.Stack;

public class StringStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Erstes");
        stack.push("Zweites");
        stack.push("Drittes");
        String oberstesElement = stack.pop();
        System.out.println(oberstesElement);
    }
}
```
