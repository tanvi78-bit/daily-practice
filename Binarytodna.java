import java.util.*;

public class Binarytodna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            String S = sc.next();

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < N; i += 2) {
                String pair = S.substring(i, i + 2);

                switch (pair) {
                    case "00":
                        result.append('A');
                        break;
                    case "01":
                        result.append('T');
                        break;
                    case "10":
                        result.append('C');
                        break;
                    case "11":
                        result.append('G');
                        break;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}