package programmierag.aufgaben.__03__schleifen.aufgabe3;
public class Main {
  public static void main(String[] args) {
    String[] words = {"Katze", "Hochschule", "AG", "Programmierwettbewerb"};
    String longest = "";
    for (String word: words) {
      if (word.length() > longest.length()){
        longest = word;
      }
    }System.out.println("Längstes Wort: " + longest);
  }
}
