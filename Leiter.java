package programmierag.aufgaben.Leiterspiel;

public class Leiter {
    final int punkt1;
    final int punkt2;

    public Leiter(int punkt1, int punkt2) {
        this.punkt1 = punkt1;
        this.punkt2 = punkt2;
    }

    public int getPunkt1() {
        return punkt1;
    }

    public int getPunkt2() {
        return punkt2;
    }
}