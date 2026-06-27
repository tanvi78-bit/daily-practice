import java.util.Scanner;
public class CRUDprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];
        int count = 0, choice;

        do {
            System.out.println("\n1. Create");
            System.out.println("2. Read");
            System.out.println("3. Update");
            System.out.println("4. Delete");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1: // Create
                    System.out.print("Enter value: ");
                    arr[count] = sc.nextLine();
                    count++;
                    break;

                case 2: // Read
                    System.out.println("Data:");
                    for (int i = 0; i < count; i++) {
                        System.out.println(i + " : " + arr[i]);
                    }
                    break;

                case 3: // Update
                    System.out.print("Enter index to update: ");
                    int u = sc.nextInt();
                    sc.nextLine();

                    if (u >= 0 && u < count) {
                        System.out.print("Enter new value: ");
                        arr[u] = sc.nextLine();
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 4: // Delete
                    System.out.print("Enter index to delete: ");
                    int d = sc.nextInt();

                    if (d >= 0 && d < count) {
                        for (int i = d; i < count - 1; i++) {
                            arr[i] = arr[i + 1];
                        }
                        count--;
                        System.out.println("Deleted");
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
} 

