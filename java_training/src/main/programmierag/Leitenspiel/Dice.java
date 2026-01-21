package programmierag.Leitenspiel;
import java.util.Random;

public class Dice {
    private final int min;
    private final int max;
    private int rollCount;
    private int current;
    private final Random random = new Random();

    public Dice(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void roll() {
        current = random.nextInt(max) + min;
        rollCount++;
    }

    public int getRollCount() {
        return rollCount;
    }

    public int getCurrent() {
        return current;
    }

    public void reset() {
        rollCount = 0;
    }
}
