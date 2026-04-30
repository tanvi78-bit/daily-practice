import java.util.Scanner;
class sum{
public static int factorial(int x){
if(x==0 || x==1){
    return 1;
}else{
    return factorial(x-1)*x;
}
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println(factorial(x));
        sc.close();
    }
}