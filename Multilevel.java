class Vehicle{
Vehicle(){
    System.out.println("This is a Vehicle");
}
}
class Fourwheeler extends Vehicle{
    Fourwheeler(){
        System.out.println("4 wheeler Vehicles");
    }
}
class car extends Fourwheeler{
    car(){
    System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class Multilevel {
     public static void main(String[] args) {
        car obj=new car();
        
     }
}
