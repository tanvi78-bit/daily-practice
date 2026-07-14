class PrintingTask extends Thread {
    String document;

    PrintingTask(String document) {
        this.document = document;
    }

    public void run() {
        System.out.println("Printing document: " + document);
    }
}
public class PrintingMachine {
    public static void main(String[] args) {
        Thread t1 = new PrintingTask("Adhaar card");
        Thread t2 = new PrintingTask("resume");
        Thread t3 = new PrintingTask("marksheet");
        Thread t4 = new PrintingTask("PAN card");

t1.start();
t2.start();
t3.start();
t4.start();
    }
}
