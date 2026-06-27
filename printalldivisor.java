import java.util.Scanner;
public class printalldivisor {
    static void printdivisor(int num){
        for(int i=1;i*i<=num;i++){
         if(num%i==0){
            System.out.println(i);
         }
         if(i!=num/i){
            System.out.println(num/i);
         }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        printdivisor(num);
        sc.close();
    }
}
