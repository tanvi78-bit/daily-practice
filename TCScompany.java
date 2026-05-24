// Hierarchical Inheritance Example
class Employee {

    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {

    Manager() {
        System.out.println("Manager constructor");
    }

    void manageTeam() {
        System.out.println("Manager manages team");
    }
}

class Developer extends Employee {

    void code() {
        System.out.println("Developer writes code");
    }
}

public class TCScompany {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.work();
        m.manageTeam();
    }
}