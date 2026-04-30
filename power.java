import java.util.*;

class powercalculate{
    double calculate(int a,int b){
        return Math.pow(a,b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        powercalculate obj= new powercalculate();
       double result= obj.calculate(a,b);
        System.out.println(result);
        sc.close();
    }
}