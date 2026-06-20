import java.util.*;

public class Consecutivecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int ans = 0;

            for (int i = 1; i < N; i++) {
                if (S.charAt(i) == S.charAt(i - 1)) {
                    ans++;
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}