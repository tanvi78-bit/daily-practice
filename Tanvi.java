interface Animal{
public void animalSound();      // interface method does not have a body
public void sleep();
}
class pig implements Animal{
public void animalSound(){
System.out.println("The pig says: wee wee");
}
public void sleep(){
System.out.println("Zzz");
}
}
 public class Tanvi {
    public static void main(String[]args){
        pig mypig=new pig();
        mypig.animalSound();
        mypig.sleep();
    }
}