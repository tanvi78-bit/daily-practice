import java.util.HashSet;
import java.util.Scanner;

public class uniquewords {
    public static void main(String[] args) {

        Scanner hello = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = hello.nextLine();

        String[] words = sentence.split(" ");

        HashSet<String> uniqueWords = new HashSet<>();

        for (String word : words) {
            uniqueWords.add(word);
        }

        System.out.println("Unique words: " + uniqueWords.size());

        hello.close();
    }
}