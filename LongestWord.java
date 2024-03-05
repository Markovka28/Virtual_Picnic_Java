import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LongestWord {

  public static void main(String[] args) {
    try {
      File file = new File("input.txt");
      Scanner scanner = new Scanner(file);
      String longestWord = "";
      int longestWordLength = 0;

      while (scanner.hasNext()) {
        String word = scanner.next();
        if (word.length() > longestWordLength) {
          longestWord = word;
          longestWordLength = word.length();
        }
      }

      System.out.println(
        "Самое длинное слово: " +
        longestWord +
        " состоит из " +
        longestWordLength +
        " букв."
      );
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("Файл не найден.");
    }
  }
}
