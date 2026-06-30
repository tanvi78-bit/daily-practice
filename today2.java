class Mythread extends Thread{
    //intiated run method for thread 
    public void run(){

        String str="Thread Started Running....";
        System.out.println(str);
    }
}
    public class today2{
        public static void main(String[] args) {
            Mythread t1=new Mythread();
            t1.start();
        }
    }
