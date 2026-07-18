import java.util.*;

 public class Codechef2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            int breaks = (X - 1) / 3;
            int totalTime = X * Y + breaks * Z;

            System.out.println(totalTime);
        }

        sc.close();
    }
}

