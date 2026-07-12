import java.util.*;

class Sundaymunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            StringBuilder ans = new StringBuilder();

            for (int i = 0; i < N; i++) {
                char ch = S.charAt(i);

                if (ch == 'A')
                    ans.append('T');
                else if (ch == 'T')
                    ans.append('A');
                else if (ch == 'C')
                    ans.append('G');
                else if (ch == 'G')
                    ans.append('C');
            }

            System.out.println(ans.toString());
        }

        sc.close();
    }
}