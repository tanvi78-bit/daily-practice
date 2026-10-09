import java.util.Scanner;
public class Revresearray {
   static void reverse(int[] arr){
    int low=0;
    int high=arr.length-1;
    while(low<high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        low++;
        high--;
    }
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
        reverse(arr);
        System.out.print("Reversed array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
