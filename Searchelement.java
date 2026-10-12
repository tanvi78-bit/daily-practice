import java.util.Scanner;

public class Searchelement {
    static int elementSearch(int arr[],int key){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                return i;
            }
            }
            return -1;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter the element to search: ");
        int key = sc.nextInt();
       System.out.print("Enter the size of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int result=elementSearch(arr,key);
        System.out.println("Index" + result);
        sc.close();

    }
}
