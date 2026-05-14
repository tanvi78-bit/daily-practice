import java.util.Scanner;
public class todaycode {

    public static long stringToNumber(String str) {

        long number = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int digit = ch - '0';

            number = number * 10 + digit;
        }

        return number;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {

            String str = sc.next();

            long number = stringToNumber(str);

            System.out.println(number);
        }

        sc.close();
    }
}

