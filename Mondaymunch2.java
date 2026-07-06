import java.util.Scanner;
public class Mondaymunch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();
        int W = sc.nextInt();

        System.out.println(R * C * W);

        sc.close();
    }
}

