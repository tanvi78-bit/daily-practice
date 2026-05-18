public class Newcode {

    String name;
    int id;


    Newcode(String name, int id) {
        this.name = name;
        this.id = id;
    }


    Newcode(Newcode obj2) {
        this.name = obj2.name;
        this.id = obj2.id;
    }
}

class Main {
    public static void main(String[] args) {

        System.out.println("First object");

        Newcode obj = new Newcode("Nandan", 32);

        System.out.println("EmpName: " + obj.name + " and EmpId: " + obj.id);
        System.out.println();

        Newcode T2 = new Newcode(obj);

        System.out.println("Copy Constructor Second object");

        System.out.println("EmpName: " + T2.name + " and EmpId: " + T2.id);
    }
}
 

