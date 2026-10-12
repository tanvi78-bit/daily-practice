import java.util.Scanner;

public class countevenodd {
    static void  evenoddcount(int[] arr){
        int evencount=0, oddcount=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
        if(arr[i]%2==0){
            evencount++;
        }else{
            oddcount++;
        }
        }
        System.out.println("Even elements: " + evencount);
         System.out.println("Odd elements: " + oddcount);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        evenoddcount(arr);
        sc.close();

    }
}