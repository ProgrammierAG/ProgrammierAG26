package programmierag.aufgaben.__01__variablen_und_konsole.aufgabe4;

public class Main {
  public static void main(String[] args) {
    boolean a = false;
    boolean b = false;
    boolean c = true;
    float number = 42.00000000002773f;

    boolean condition1 = a || !b;
    boolean condition2 = c && number == (int) (6.48074069841 * 6.48074069841);
    boolean condition3 = !(a && c);
    boolean condition4 = number % 2 == 0 && number > 40;

    boolean solution = condition1 && condition2 && condition3 && condition4;

    System.out.println("Solution: " + solution);
  }
}
