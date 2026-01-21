package programmierag.aufgaben.Leiterspiel;

public class Dice {
    int min;
    int max;

    public Dice(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int roll(){
        return min + (int)(Math.random() * max);
    }
}
