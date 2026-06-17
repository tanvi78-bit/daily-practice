import java.util.Scanner;
public class Digitscount {
static int countdigits(int num){
    if(num==0){
        return 1;
    }
    int count=0;
    while(num!=0){
        num/=10;
        count++;
    }
    return count;
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count = countdigits(num);
        System.out.println(count);
        sc.close();
        
    }
}
