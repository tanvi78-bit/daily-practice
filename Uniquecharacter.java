import java.util.HashSet;
public class Uniquecharacter {
public static void main(String[] args) {
 String str = "Hello";

HashSet<Character> set = new HashSet<>();

for (char ch : str.toCharArray()) {
            set.add(ch);
        }

System.out.println("Unique Character Count: " + set.size());
    }
}
