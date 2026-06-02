import java.util.Scanner;

class ATM {
    String bankName;
    String ifscCode;
    String accountHolder;
    double balance;

    // Constructor
    ATM(String bankName, String ifscCode, String accountHolder, double balance) {
        this.bankName = bankName;
        this.ifscCode = ifscCode;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to display account details
    void displayDetails() {
        System.out.println("BANK DETAILS");
        System.out.println("Bank Name: " + bankName);
        System.out.println("IFSC Code: " + ifscCode);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: Rs." + balance);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > balance || (balance - amount) < 1000) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: Rs." + balance);
        }
    }
}

public class hall12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM("State Bank of India",
                "SBIN0001234",
                "Tanvi Tiwari",
                6000
        );

        atm.displayDetails();

        System.out.print("\n Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        atm.withdraw(amount);

        sc.close();
    }
}