import java.util.*;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            int countA = 0;
            int countB = 0;

            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == 'a') {
                    countA++;
                } else {
                    countB++;
                }
            }

            System.out.println(countA + " " + countB);
        }
        sc.close();
    }
}