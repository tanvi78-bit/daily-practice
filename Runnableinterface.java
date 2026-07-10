class MyThread2 implements Runnable{
    public void run(){
         String str="Thread is Running Successfully";
         System.out.println(str);
    }
}
public class Runnableinterface{
    public static void main(String[] args) {
        MyThread2 g1= new MyThread2();

        Thread t1= new Thread(g1);
         t1.start();
    }
}
