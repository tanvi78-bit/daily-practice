import java.util.Scanner;
import java.util.regex.Pattern;
public class validnumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter phone number: ");
        String phone = sc.nextLine();

        String india = "^([+]91[- ]?)?[6-9][0-9]{9}$";

        String usa = "^([+]1[- ]?)?[2-9][0-9]{9}$";

        String uk = "^([+]44[- ]?)?7[0-9]{9}$";

        if (Pattern.matches(india, phone)) {
            System.out.println("Valid Indian Phone Number");
        }
        else if (Pattern.matches(usa, phone)) {
            System.out.println("Valid USA Phone Number");
        }
        else if (Pattern.matches(uk, phone)) {
            System.out.println("Valid UK Phone Number");
        }
        else {
            System.out.println("Invalid Phone Number");
        }

        sc.close();
    }
}
