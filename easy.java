import java.util.Scanner;
public class easy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int X= scanner.nextInt();
            int Y = scanner.nextInt();

            int money;

            if (Y <= X) {
                money = Y;
            } else {
                money = X + (Y - X) * 2;
            }

            System.out.println(money);
        }

        scanner.close();
    }
}
        
    



