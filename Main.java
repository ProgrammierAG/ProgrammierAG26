package programmierag.aufgaben.Leiterspiel;
import java.util.List;
import java.util.ArrayList;
public class Main {
    static int Playerposition = 0;
    static List<Integer> Leiterbeginn = new ArrayList<Integer>();
    static List<Integer> Leiterende = new ArrayList<Integer>();
    public static void main(String[] args) {
        int Playerposition = 0;
        int Wuerfel;
        setup();
        while (Playerposition < 100) {
            Wuerfel = random(1,6);
            Playerposition +=  Wuerfel;
            System.out.println(Wuerfel+" wurde gewürfelt");
            Playerposition = Search(Playerposition);
            System.out.println("Deine neue Position ist " + Playerposition);
        }
    }
    public static int random(int min, int max){
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void setup() {
        // initialisiert Leiterpositionen
        Leiterbeginn.add(6);
        Leiterbeginn.add(14);
        Leiterbeginn.add(21);
        Leiterbeginn.add(31);
        Leiterbeginn.add(33);
        Leiterbeginn.add(46);
        Leiterbeginn.add(51);
        Leiterbeginn.add(57);
        Leiterbeginn.add(65);
        Leiterbeginn.add(68);
        Leiterbeginn.add(70);
        Leiterbeginn.add(98);
        Leiterende.add(27);
        Leiterende.add(19);
        Leiterende.add(53);
        Leiterende.add(42);
        Leiterende.add(38);
        Leiterende.add(62);
        Leiterende.add(59);
        Leiterende.add(96);
        Leiterende.add(85);
        Leiterende.add(80);
        Leiterende.add(76);
        Leiterende.add(92);

    }
    public static int Search (int playerPosition){
        //prüft position auf Leiter
        for (int i = 0; i < 12; i++) {
            if(Leiterende.get(i) == playerPosition) {
                System.out.print("Switched from " + Leiterende.get(i) + " to ");
                playerPosition = Leiterbeginn.get(i);
                System.out.println(playerPosition);
                            }
            else if(Leiterbeginn.get(i) == playerPosition) {
                System.out.print("Switched from " + Leiterende.get(i) + " to ");
                playerPosition = Leiterende.get(i);
                System.out.println(playerPosition);
            }
        }
        return playerPosition;
    }
}

