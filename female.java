import java.util.Scanner;

class details {
    String name;
    int age;
    String city;

    // Method to accept details
    void getDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Age: ");
        age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter City: ");
        city = sc.nextLine();
        sc.close();
    }

    // Method to display details
    void displayDetails() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
    }
}

public class female{
    public static void main(String[] args) {
        details p = new details();

        p.getDetails();
        p.displayDetails();
    }
    }