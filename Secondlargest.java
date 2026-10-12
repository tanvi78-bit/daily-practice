import java.util.Scanner;

public class Secondlargest {
    static int lagrestsecond(int[] arr){
        int n=arr.length;
        int largest=-1 ,secondlargest=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
                
            }
            else if(arr[i]<largest && arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
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
        System.out.println(lagrestsecond(arr));
        sc.close();

    }
}