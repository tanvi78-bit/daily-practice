import java.util.Scanner;
public class StudentCRUD {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int id[]=new int[10];
        String name[]= new String[10];
        double marks[]=new double[10];
        int count=0;
        int choice;
        do{
            System.out.println("\n======= STUDENT CRUD MENU========");
            System.out.println("1.Create");
            System.out.println("2.Read");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");

            System.out.print("Enter choice: ");
            choice =sc.nextInt();

            switch (choice) {
                
                case 1:
                
                if(count==10){
                    System.out.print("Array Full: ");
                    break;
                }

                System.out.println("Enter id: ");
                id[count]=sc.nextInt();

                sc.nextLine();
                System.out.println("Enter Name: ");
                name[count]=sc.nextLine();

                System.out.print("Enter Marks: ");
                marks[count]=sc.nextDouble();

                count++;

                System.out.println("Record Inserted: ");

                break;

                case 2: 

                if(count==0){
                    System.out.println("no Records: ");
                }else{
                    System.out.println("\n Student Records");

                    for(int i=0; i<count;i++){
                        System.out.println("------------------------------");
                        System.out.println("ID: "+id[i]);
                        System.out.println("name: "+name[i]);
                        System.out.println("Marks: "+marks[i]);
                    }
                }

                break;

                case 3:

                System.out.println("Enter Id to update: ");
                int UpdateId=sc.nextInt();

                boolean found=false;

                for(int i=0;i<count;i++){
                    if(id[i]==UpdateId){
                        System.out.print("Enter new marks: ");
                        marks[i]=sc.nextDouble();

                        found=true;

                        System.out.println("Update Successfully");
                    }
                }
                if(!found){
                   System.out.println("Record Not Found");
                }  
                
                break;

                case 4:

                System.out.println("Enter ID to Delete: ");
                int deleteId=sc.nextInt();

                boolean deleted=false;

                for(int i=0;i<count;i++){
                    if(id[i]==deleteId){
                        for(int j=i;j<count-1;j++){
                            id[j]=id[j+1];
                            name[j]=name[j+1];
                            marks[j] = marks[j + 1];

                        }
                        count--;
                        deleted=true;
                        System.out.println("Record Deleted");

                        break;
                    }
                }
                if(!deleted) {
                    System.out.println("Record Not Found");
                }
                break;

                case 5: 

                System.out.println("Program ended");
                 break;

                default: 

                System.out.println("Invalid choice");
             }
            }
         while(choice!=5);
        sc.close();
    }
}
