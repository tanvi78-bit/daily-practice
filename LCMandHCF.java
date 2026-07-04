import java.util.Scanner;
public class LCMandHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int A = num1;
        int B = num2;

        while (B!= 0) {
            int temp = B;
            B = A % B;
            A = temp;
        }

        int hcf = A;

        int lcm = (num1 * num2) / hcf;
        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);

        sc.close();
    }
}