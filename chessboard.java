import java.util.*;
public class chessboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            int dx = Math.abs(x1 - x2);
            int dy = Math.abs(y1 - y2);

            System.out.println(Math.max(dx, dy));
        }

        sc.close();
    }
}