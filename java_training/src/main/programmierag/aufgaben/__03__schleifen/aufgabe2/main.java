package programmierag.aufgaben.__03__schleifen.aufgabe2;

public class main {
    public static void main(String[] args) {
        for (int i = 1;i <= 107; i++){
            if (i % 3 == 0 && i % 4 == 0){
                System.out.println("UP DOWN");
            } else if (i % 3 == 0) {
                System.out.println("UP");
            } else if (i % 4 == 0) {
                System.out.println("DOWN");
            }else {
                System.out.println(i);
            }
        }
    }
}
