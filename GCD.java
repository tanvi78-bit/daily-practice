import java.util.Scanner;
public class GCD{
 /*static int gcdf(int a,int b){
    int res= Math.min(a, b);
    while(res>0){
        if(a%res==0 && b%res==0){
            break;
        }
        res--;
    }
    return res;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        System.out.print("Enter the number:");
        int b=sc.nextInt();
        System.out.println(gcdf(a,b));
        sc.close();
    }
}*/
static int gcd(int a,int b){
    while(a!=b){
        if(a>b){
           a= a-b;
        }else{
            b=b-a;
        }
        return a;
    }
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.print("Enter the number:");
        int a=sc.nextInt();
        System.out.print("Enter the number:");
        int b=sc.nextInt();
        System.out.println(gcd(a,b));
        sc.close();
}
}