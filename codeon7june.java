abstract class Bank {
    abstract void getInterestRate();
}

class SBI extends Bank {
    void getInterestRate() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank {
    void getInterestRate() {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class codeon7june {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        b1.getInterestRate();

        Bank b2 = new HDFC();
        b2.getInterestRate();
    }
}