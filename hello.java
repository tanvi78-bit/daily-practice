import java.util.Scanner;
class program {
 void add(int p ,int q){
    System.out.println(p+q);
 }   
}
class program2 extends program{
    void mul(int p,int q){
        System.out.println(p*q);
    }
    void task(int p, int q){
        System.out.print((p*p) + (q*q));
    }
}
public class hello {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        program2 obj= new program2();
        int a=sc.nextInt();
        int b=sc.nextInt();
        obj.add(a,b);
        obj.mul(a,b);
        obj.task(a,b);
        sc.close();
    }

}

