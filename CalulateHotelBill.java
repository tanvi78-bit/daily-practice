import java.util.Scanner;
public class CalulateHotelBill {
    

    public static int calculateHotelBill(int N, int R, int E) {
        return (N * R) + E;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int R = sc.nextInt();
        int E = sc.nextInt();

        System.out.println(calculateHotelBill(N, R, E));

        sc.close();
    }
}

