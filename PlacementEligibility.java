import java.util.Scanner;
public class PlacementEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            System.out.print("Enter Student Name: ");
            String name=sc.nextLine();
            System.out.println("Enter CGPA: ");
            double cgpa=sc.nextDouble();
            if(cgpa>=7.0){
                System.out.println(name + " is eligible for placement");
            }else{
                System.out.println(name + " is not eligible for placement");
            }
        }catch(Exception e){
            System.out.println("Invalid Input! please enter a valid CGPA");
        }
        finally{ System.out.println("Placement Verification Process Completed");

        }

        sc.close();
    }
}