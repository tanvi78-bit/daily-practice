class Vehicle{
    Vehicle(){
        System.out.println("This is a Vehicle");
    }
}
class car extends Vehicle{
   void drive(){
        System.out.println("This Vehicle is car");
    }
}
public class Test2{
    public static void main(String[]args){
        car obj=new car();
         obj.drive();
    }

}