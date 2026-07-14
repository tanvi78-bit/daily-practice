class PrintingTask extends Thread {
    String document;

    PrintingTask(String document) {
        this.document = document;
    }

    public void run() {
        System.out.println("Printing: " + document);
    
        System.out.println(document + " printed successfully.");
    }
}

public class AkhbaarPrinting{
    public static void main(String[] args) {

        Thread t1 = new PrintingTask("Dainik Bharat");
        Thread t2 = new PrintingTask("Navbharat");
        Thread t3 = new PrintingTask("Patrika");
        Thread t4 = new PrintingTask("Hindustan Times");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}

