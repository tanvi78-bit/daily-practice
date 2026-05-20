import java.util.Scanner;
public class Hell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        int cost;

        if (Z <= 50) {
            cost = X;
        } else {
            cost = X + (Z - 50) * Y;
        }

        System.out.println(cost);
        sc.close();
    }
}

