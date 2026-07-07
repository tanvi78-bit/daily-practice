import java.util.Scanner;

class Shoescalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int ans = N + Math.max(0, N - M);

            System.out.println(ans);
        }

        sc.close();
    }
}