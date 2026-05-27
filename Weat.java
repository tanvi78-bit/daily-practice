import java.util.*;

public class Weat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (X > A) {
            System.out.println("Alice");
        } else if (X < A) {
            System.out.println("Bob");
        } else {
            // Primary scores are equal
            if (Y >= B) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
        sc.close();
    }
}