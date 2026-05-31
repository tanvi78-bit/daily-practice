import java.util.Scanner;
public class Videocompression {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] A= new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        int groups=1;
        for(int i=1;i<N;i++){
            if(A[i]!=A[i-1]){
                groups++;
            }
        }
        System.out.println(groups);
        sc.close();
    }

}
