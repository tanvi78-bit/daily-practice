import java.util.InputMismatchException;
import java.util.Scanner;
public class Inputmismatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       try{
        System.out.print("Enter a number: ");
         int a=sc.nextInt();
         System.out.print("You entered: "+ a);
       }catch(InputMismatchException e){
        System.out.println("Please enter only intergers");
       }
        sc.close();
    }
}
