import java.util.*;

class diceAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        if (X >= 3)
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }
}