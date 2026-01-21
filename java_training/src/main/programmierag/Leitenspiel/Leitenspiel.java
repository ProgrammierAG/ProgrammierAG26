package programmierag.Leitenspiel;

public class Leitenspiel {

    private static final int START_FIELD = 0;
    private static final int TARGET_FIELD = 100;
    private static final int DICE_MIN = 1;
    private static final int DICE_MAX = 6;

    private final Dice dice;
    private int currentField;
    private int previousField;

    private static final Ladder[] ladders = new Ladder[]{
            new Ladder(19, 14),
            new Ladder(27, 6),
            new Ladder(38, 33),
            new Ladder(42, 31),
            new Ladder(53, 21),
            new Ladder(59, 51),
            new Ladder(62, 46),
            new Ladder(76, 70),
            new Ladder(80, 68),
            new Ladder(85, 65),
            new Ladder(96, 57),
            new Ladder(98, 92),
    };

    public Leitenspiel() {
        dice = new Dice(DICE_MIN, DICE_MAX);
        reset();
    }

    public void reset() {
        currentField = START_FIELD;
        dice.reset();
    }

    public void run() {
        while (currentField != TARGET_FIELD) {

            // BASIC MOVE
            dice.roll();

            // MOVE
            previousField = currentField;
            currentField = move(dice.getCurrent());

            // SHOW
            printStats();
        }

        System.out.println("You needed " + dice.getRollCount() + " dice rolls to reach to goal!");
    }

    private void printStats() {
        System.out.println("Current Turn: " + dice.getRollCount());
        System.out.println("Previous Field: " + previousField);
        System.out.println("Dice number: " + dice.getCurrent());
        System.out.println("New Field: " + currentField);
        System.out.println();
    }

    private int move(int roll) {
        int pos = currentField + roll;

        if (pos > TARGET_FIELD) {
            pos = (TARGET_FIELD - (pos - TARGET_FIELD));
        }

        for (var ladder : ladders) {
            // CHECK LADDERS
            if (ladder.isOnLadder(pos)) {
                var newPos = ladder.useLadder(pos);
                System.out.println("\u001B[33m" + "You landed on position: " + pos + " you move through the ladder to position: " + newPos + "\u001B[0m" + "\n");

                return newPos;
            }
        }

        return pos;
    }
}