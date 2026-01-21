package programmierag.Leitenspiel;

public class Ladder {
    public int top;
    public int bottom;

    public Ladder(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public boolean isOnLadder(int pos) {
        return pos == bottom || pos == top;
    }

    public int useLadder(int pos) {
        if (pos == bottom) {
            return top;
        } else {
            return bottom;
        }
    }
}