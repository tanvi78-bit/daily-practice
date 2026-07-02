/*import java.util.Scanner;
public class Perfectnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is Not a Perfect Number.");
        }

        sc.close();
    }
}*/


public class Perfectnumber{
    public static void main(String[] args) {
        int n1=496;
        int add=0;
        for(int i=1;i<n1;i++){
            if(n1%i==0){
                add=add+i;
            }
        }
        boolean isPerfect=(add==n1);
        if(isPerfect){
            System.out.println("is " + n1 + " a perfect number?: " + isPerfect);
        }else{
            System.out.println("is " + n1 + " a perfect number?: " + isPerfect);
        }
    }
}