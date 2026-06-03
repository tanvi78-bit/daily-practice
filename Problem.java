import java.util.*;

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int R = (N / 20) + 1;

        System.out.println(R);
        sc.close();
    }
}